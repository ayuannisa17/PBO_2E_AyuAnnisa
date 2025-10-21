package game;

public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Heal amount cannot be negative");
        this.amount = amount;
    }

    @Override
    public String name() {
        return "HealSkill(+" + amount + ")";
    }

    @Override
    public void apply(Character self, Character target) {
        if (self == null || target == null) return;
        
        int currentHealth = target.getHealth();
        int maxHealth = target.getMaxHealth();
        int newHealth = Math.min(currentHealth + amount, maxHealth);
        target.setHealth(newHealth);
    }
}