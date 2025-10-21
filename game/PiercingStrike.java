package game;

public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) {
        if (multiplier < 1.0) throw new IllegalArgumentException("Multiplier must be at least 1.0");
        this.multiplier = multiplier;
    }

    @Override
    public String name() {
        return "PiercingStrike(x" + multiplier + ")";
    }

    @Override
    public void apply(Character self, Character target) {
        if (self == null || target == null) return;
        
        int baseDamage = self.getAttackPower();
        if (self instanceof Player) {
            Player player = (Player) self;
            baseDamage += player.getLevel() * 2; 
        }
        
        int piercingDamage = (int)(baseDamage * multiplier);
        int initialTargetHP = target.getHealth();

        int finalDamage = piercingDamage;
        target.takeDamage(finalDamage);
        
        System.out.printf("[Team A] %s -> %s (%s): %d dmg%n", 
            self.getName(), target.getName(), name(), finalDamage);
        System.out.printf("  %s HP: %d -> %d%n", 
            target.getName(), initialTargetHP, target.getHealth());
    }
}