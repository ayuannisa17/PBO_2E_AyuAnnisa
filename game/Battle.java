package game;

import java.util.*;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;
    private int turnCount = 0;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
    }

    public void run() {
        System.out.println("=== SETUP ===");
        printSetup();
        
        System.out.println("\nDamage rules:");
        System.out.println("  - Player base damage = AP + Lv*2 = 25 + 10 = 35");
        System.out.println("  - PiercingStrike: 35 * 1.2 ≈ 42 (bypass sebagian reduksi)");
        System.out.println("  - Shield(flat -10) aktif 3 giliran, Regen(+8) aktif 4 giliran");
        System.out.println("  - Boss Rage Strike: 2x damage jika HP < 50% ATAU setiap turn ke-3");

        while (isBattleOngoing()) {
            turnCount++;
            System.out.printf("%n=== TURN %d ===%n", turnCount);
            
            processTeamTurn(teamA, teamB, "A");
            if (!isBattleOngoing()) break;
             
            processTeamTurn(teamB, teamA, "B");
        }
        
        printResult();
    }
    
    private void processTeamTurn(List<Character> attackingTeam, List<Character> defendingTeam, String teamName) {
        for (Character attacker : attackingTeam) {
            if (!attacker.isAlive()) continue;
            
            Character target = selectTarget(attacker, defendingTeam);
            if (target != null && target.isAlive()) {

                if (attacker instanceof Player && ((Player)attacker).hasHealSkill() && 
                    attacker.getHealth() < attacker.getMaxHealth() * 0.6 && turnCount == 3) {
                    ((Player)attacker).useHeal();
                } else {
                    attacker.performTurn(target);
                }
                
                defendingTeam.removeIf(c -> !c.isAlive());
                if (!isBattleOngoing()) break;
            }
        }
    }
    
    private Character selectTarget(Character attacker, List<Character> possibleTargets) {
        List<Character> aliveTargets = new ArrayList<>();
        for (Character target : possibleTargets) {
            if (target.isAlive()) aliveTargets.add(target);
        }
        if (aliveTargets.isEmpty()) return null;
        
        if (attacker instanceof Enemy) {
            return Collections.max(aliveTargets, Comparator.comparingInt(Character::getHealth));
        }
        else if (attacker instanceof Player) {
            aliveTargets.sort((a, b) -> {
                if (a instanceof Enemy && b instanceof Enemy) {
                    Enemy ea = (Enemy) a;
                    Enemy eb = (Enemy) b;
                    if (ea.getThreatLevel() != eb.getThreatLevel()) {
                        return Integer.compare(eb.getThreatLevel(), ea.getThreatLevel());
                    }
                }
                return Integer.compare(a.getHealth(), b.getHealth());
            });
            return aliveTargets.get(0);
        }
        
        return aliveTargets.get(0);
    }
    
    private boolean isBattleOngoing() {
        boolean teamAAlive = teamA.stream().anyMatch(Character::isAlive);
        boolean teamBAlive = teamB.stream().anyMatch(Character::isAlive);
        return teamAAlive && teamBAlive;
    }
    
    private void printSetup() {
        System.out.println("Team A:");
        for (Character c : teamA) {
            System.out.println("  - " + c);
            if (c instanceof Player) {
                Player p = (Player) c;
                System.out.println("    Skills: [HealSkill(+15), PiercingStrike(x1.2)]");
                System.out.println("    Effects: [Shield(-10 dmg, 3 turns), Regen(+8 HP, 4 turns)]");
            }
        }
        System.out.println("Team B:");
        for (Character c : teamB) {
            System.out.println("  - " + c);
        }
    }
    
    private void printResult() {
        System.out.println("\n=== RESULT ===");
        boolean teamAAlive = teamA.stream().anyMatch(Character::isAlive);
        
        if (teamAAlive) {
            System.out.println("Team A menang!");
        } else {
            System.out.println("Team B menang!");
        }
        
        System.out.println("\nSisa HP:");
        for (Character c : teamA) {
            System.out.printf("  - %s(%s): %d/%d%n", 
                c.getClass().getSimpleName(), c.getName(), c.getHealth(), c.getMaxHealth());
        }
        for (Character c : teamB) {
            System.out.printf("  - %s(%s): %d/%d%n", 
                c.getClass().getSimpleName(), c.getName(), c.getHealth(), c.getMaxHealth());
        }
        
        int playerTotalDamage = 0;
        int bossRageCount = 0;
        int shieldTotalAbsorbed = 0;
        int regenTotalHealed = 0;
        
        for (Character c : teamA) {
            if (c instanceof Player) {
                playerTotalDamage = ((Player) c).getTotalDamageDealt();
            }
            for (StatusEffect effect : c.getEffects()) {
                if (effect instanceof Shield) {
                    shieldTotalAbsorbed += ((Shield) effect).getTotalAbsorbed();
                } else if (effect instanceof Regen) {
                    regenTotalHealed += ((Regen) effect).getTotalHealed();
                }
            }
        }
        
        for (Character c : teamB) {
            if (c instanceof BossMonster) {
                bossRageCount = ((BossMonster) c).getRageStrikeCount();
            }
        }
        
        System.out.println("\nStat ringkas:");
        System.out.printf("  - Player total serangan: %d%n", playerTotalDamage);
        System.out.printf("  - Boss Rage terpicu: %d kali (HP<50%% dan turn ke-3)%n", bossRageCount);
        System.out.printf("  - Shield menyerap total: %d dmg%n", shieldTotalAbsorbed);
        System.out.printf("  - Regen memulihkan total: %d HP%n", regenTotalHealed);
    }
}