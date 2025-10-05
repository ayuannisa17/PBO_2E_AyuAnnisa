package monsterbattle;

public class Player extends Character {
    private int level;

    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
    }
    @Override
    public void attack(Character target) {
        int damage = (int)(super.getHealth() * 0.1) + level;
        System.out.println(getName() + "attacks with sword!Damage: " + damage);
        target.takeDamage(damage);
    }
     public void heal(int amount) {
        setHealth(getHealth() + amount);
        System.out.println(getName() + " healed by " + amount + ". Current health: " + getHealth());
    }
}
