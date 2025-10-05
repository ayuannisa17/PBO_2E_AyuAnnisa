package monsterbattle;

public class BossMonster extends Monster {

    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower, type);
    }

    @Override
    public void attack(Character target) {
        int damage = getAttackPower() * 2; 
        System.out.println(getName() + " unleashes a SPECIAL ATTACK! Damage: " + damage);
        target.takeDamage(damage);
    }
}

