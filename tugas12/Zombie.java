package tugas12;

public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public abstract void heal();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level + "\n";
    }
}
