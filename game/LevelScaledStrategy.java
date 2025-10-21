package game;

public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        if (bonusPerLevel < 0) throw new IllegalArgumentException("Bonus per level cannot be negative");
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public String getName() {
        return "LevelScaled(+" + bonusPerLevel + "/level)";
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int baseDamage = self.getAttackPower();
        
        if (self instanceof Player) {
            Player player = (Player) self;
            baseDamage += player.getLevel() * bonusPerLevel;
        }
        
        return baseDamage;
    }
}