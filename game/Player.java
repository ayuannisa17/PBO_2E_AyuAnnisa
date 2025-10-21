package game;

import java.util.*;

public class Player extends Character {
    private int level;
    private AttackStrategy strategy;
    private final List<Skill> skills = new ArrayList<>();
    private static final Random random = new Random();
    private int totalDamageDealt = 0;

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        if (level < 1) throw new IllegalArgumentException("Level must be at least 1");
        if (strategy == null) throw new IllegalArgumentException("Strategy cannot be null");
        
        this.level = level;
        this.strategy = strategy;
    }

    public void addSkill(Skill s) { 
        if (s != null) {
            skills.add(s);
        }
    }
    
    public int getLevel() { return level; }
    public AttackStrategy getStrategy() { return strategy; }
    public int getTotalDamageDealt() { return totalDamageDealt; }

    @Override
    public void attack(Character target) {
        if (!isAlive() || target == null || !target.isAlive()) return;
        
        int baseDamage = strategy.computeDamage(this, target);
        int initialTargetHP = target.getHealth();

        Skill piercingSkill = getRandomPiercingStrike();
        if (piercingSkill != null && random.nextBoolean()) {
            piercingSkill.apply(this, target);
            totalDamageDealt += (initialTargetHP - target.getHealth());
        } else {
            int finalDamage = target.onIncomingDamage(baseDamage);
            target.takeDamage(finalDamage);
            totalDamageDealt += finalDamage;
            System.out.printf("[Team A] %s -> %s (Normal Strategy): %d dmg%n", 
                getName(), target.getName(), finalDamage);
            System.out.printf("  %s HP: %d -> %d%n", 
                target.getName(), initialTargetHP, target.getHealth());
        }
    }
    
    public void useHeal() {
        for (Skill skill : skills) {
            if (skill instanceof HealSkill) {
                int initialHP = getHealth();
                skill.apply(this, this);
                System.out.printf("[Team A] %s uses HealSkill(+15): %d -> %d%n", 
                    getName(), initialHP, getHealth());
                return;
            }
        }
    }
    
    public boolean hasHealSkill() {
        for (Skill skill : skills) {
            if (skill instanceof HealSkill) {
                return true;
            }
        }
        return false;
    }
    
    private Skill getRandomPiercingStrike() {
        List<Skill> piercingSkills = new ArrayList<>();
        for (Skill skill : skills) {
            if (skill instanceof PiercingStrike) {
                piercingSkills.add(skill);
            }
        }
        return piercingSkills.isEmpty() ? null : piercingSkills.get(0);
    }
    
    @Override
    public String toString() {
        return String.format("Player(name=%s, HP=%d/%d, AP=%d, Lv=%d, Strategy=%s)", 
            getName(), getHealth(), getMaxHealth(), getAttackPower(), level, strategy.getName());
    }
}