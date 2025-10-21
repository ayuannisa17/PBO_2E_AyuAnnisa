package game;

import java.util.Random;

public class Monster extends Enemy {
    private static final Random random = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        if (!isAlive() || target == null || !target.isAlive()) return;
        
        int damage = strategy.computeDamage(this, target);
        damage = (int)(damage * (0.8 + random.nextDouble() * 0.4));
        int initialTargetHP = target.getHealth();
        
        int finalDamage = target.onIncomingDamage(damage);
        target.takeDamage(finalDamage);
        
        System.out.printf("[Team B] %s -> %s (Normal %d): %d dmg%n", 
            getName(), target.getName(), damage, finalDamage);
        System.out.printf("  %s HP: %d -> %d%n", 
            target.getName(), initialTargetHP, target.getHealth());
    }
}