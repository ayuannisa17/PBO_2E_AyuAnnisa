package game;

import java.util.*;

public abstract class Character {
    private final String name;
    protected final int maxHealth;
    private int health;
    private final int attackPower;
    private final List<StatusEffect> effects = new ArrayList<>();

    protected Character(String name, int health, int attackPower) {
        if (health < 0) throw new IllegalArgumentException("Health cannot be negative");
        if (attackPower < 0) throw new IllegalArgumentException("Attack power cannot be negative");
        
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
    }

    public final String getName() { return name; }
    public final int getAttackPower() { return attackPower; }
    public final int getHealth() { return health; }
    public final int getMaxHealth() { return maxHealth; }
    
    protected final void setHealth(int value) {
        this.health = Math.max(0, Math.min(value, maxHealth));
    }

    protected int onIncomingDamage(int base) {
        int reduced = base;
        for (StatusEffect effect : effects) {
            if (effect instanceof Shield) {
                reduced = ((Shield) effect).reduceDamage(reduced);
            }
        }
        return reduced;
    }

    public final boolean isAlive() { return health > 0; }

    public final void takeDamage(int dmg) { 
        setHealth(getHealth() - Math.max(0, dmg)); 
    }

    public final void addEffect(StatusEffect e) { 
        if (e != null) {
            effects.add(e);
        }
    }

    public final void performTurn(Character target) {
        if (!isAlive()) return;
        
        for (int i = effects.size() - 1; i >= 0; i--) {
            StatusEffect effect = effects.get(i);
            effect.onTurnStart(this);
            if (effect.isExpired()) {
                effects.remove(i);
            }
        }

        attack(target);
        
        for (int i = effects.size() - 1; i >= 0; i--) {
            StatusEffect effect = effects.get(i);
            effect.onTurnEnd(this);
            if (effect.isExpired()) {
                effects.remove(i);
            }
        }
    }

    public abstract void attack(Character target);
    
    public List<StatusEffect> getEffects() {
        return new ArrayList<>(effects);
    }
}