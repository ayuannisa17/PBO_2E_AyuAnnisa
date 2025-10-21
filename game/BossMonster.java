package game;

public class BossMonster extends Enemy {
    private int turnCounter = 0;
    private int rageStrikeCount = 0;

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        if (!isAlive() || target == null || !target.isAlive()) return;
        
        turnCounter++;
        int baseDamage = strategy.computeDamage(this, target);
        int initialTargetHP = target.getHealth();
        
        boolean useRageStrike = (getHealth() < getMaxHealth() * 0.5) || (turnCounter % 3 == 0);
        
        if (useRageStrike) {
            rageStrikeCount++;
            int rageDamage = (int)(baseDamage * 2.0);
            int finalDamage = target.onIncomingDamage(rageDamage);
            target.takeDamage(finalDamage);
            System.out.printf("[Team B] %s -> %s (RAGE x2: %d): %d dmg%n", 
                getName(), target.getName(), rageDamage, finalDamage);
        } else {
            int finalDamage = target.onIncomingDamage(baseDamage);
            target.takeDamage(finalDamage);
            System.out.printf("[Team B] %s -> %s (Normal hit %d): %d dmg%n", 
                getName(), target.getName(), baseDamage, finalDamage);
        }
        
        System.out.printf("  %s HP: %d -> %d%n", 
            target.getName(), initialTargetHP, target.getHealth());
    }
    
    public int getRageStrikeCount() { return rageStrikeCount; }
}