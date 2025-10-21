package game;

public abstract class Enemy extends Character {
    private int threatLevel;
    protected AttackStrategy strategy;

    protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap);
        setThreatLevel(threatLevel);
        setStrategy(strategy);
    }

    public final int getThreatLevel() { return threatLevel; }
    
    private void setThreatLevel(int threatLevel) {
        if (threatLevel < 1 || threatLevel > 5) {
            throw new IllegalArgumentException("Threat level must be between 1-5");
        }
        this.threatLevel = threatLevel;
    }
    
    public final void setStrategy(AttackStrategy s) { 
        if (s == null) throw new IllegalArgumentException("Strategy cannot be null");
        this.strategy = s; 
    }
}