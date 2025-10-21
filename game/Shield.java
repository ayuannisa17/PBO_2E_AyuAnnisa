package game;

public class Shield implements StatusEffect {
    private final int flatReduce;
    private int duration;
    private final int maxDuration;
    private int totalAbsorbed = 0;

    public Shield(int flatReduce, int duration) {
        if (flatReduce < 0) throw new IllegalArgumentException("Damage reduction cannot be negative");
        if (duration < 1) throw new IllegalArgumentException("Duration must be at least 1");
        
        this.flatReduce = flatReduce;
        this.duration = duration;
        this.maxDuration = duration;
    }

    @Override
    public String name() {
        return "Shield(-" + flatReduce + " dmg, " + duration + " turns)";
    }

    @Override
    public void onTurnStart(Character self) {
        System.out.printf("[Start Effects] %s: Shield(active, %d), Regen(active, +8 at end)%n", 
            self.getName(), duration);
    }

    @Override
    public void onTurnEnd(Character self) {

    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
    
    public int reduceDamage(int incomingDamage) {
        int absorbed = Math.min(flatReduce, incomingDamage);
        totalAbsorbed += absorbed;
        duration--;
        return Math.max(0, incomingDamage - flatReduce);
    }
    
    public int getTotalAbsorbed() { return totalAbsorbed; }
    public int getRemainingDuration() { return duration; }
}