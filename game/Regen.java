package game;

public class Regen implements StatusEffect {
    private final int perTurn;
    private int duration;
    private final int maxDuration;
    private int totalHealed = 0;

    public Regen(int perTurn, int duration) {
        if (perTurn < 0) throw new IllegalArgumentException("Regen per turn cannot be negative");
        if (duration < 1) throw new IllegalArgumentException("Duration must be at least 1");
        
        this.perTurn = perTurn;
        this.duration = duration;
        this.maxDuration = duration;
    }

    @Override
    public String name() {
        return "Regen(+" + perTurn + " HP, " + duration + " turns)";
    }

    @Override
    public void onTurnStart(Character self) {
        
    }

    @Override
    public void onTurnEnd(Character self) {
        if (self.isAlive()) {
            int currentHealth = self.getHealth();
            int newHealth = Math.min(currentHealth + perTurn, self.getMaxHealth());
            int actualHeal = newHealth - currentHealth;
            
            if (actualHeal > 0) {
                self.setHealth(newHealth);
                totalHealed += actualHeal;
                System.out.printf("[End Effects] %s Regen: +%d HP => %d", 
                    self.getName(), actualHeal, newHealth);
                
                duration--;
                if (duration > 0) {
                    System.out.printf(" ; Regen remaining: %d turns%n", duration);
                } else {
                    System.out.println(" ; Regen EXPIRES");
                }
            } else {
                duration--;
            }
        } else {
            duration--;
        }
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
    
    public int getTotalHealed() { return totalHealed; }
}