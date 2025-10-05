package monsterbattle;

public class GameTest {
    public static void main(String[] args) {
        Player p1 = new Player("Annisa", 120, 25, 5); 
        Monster m1 = new Monster("Goblin", 80, 15, "Goblin");
        BossMonster boss = new BossMonster("Dragon Boss", 200, 30, "Dragon");

        System.out.println("=== Battle Start ===");
        Character[] enemies = {m1, boss};

        int round = 1;
        while (p1.isAlive() && (m1.isAlive() || boss.isAlive())) {
            System.out.println("\n--- Round " + round + " ---");

            if (m1.isAlive()) {
                p1.attack(m1);
            } else if (boss.isAlive()) {
                p1.attack(boss);
            }

            for (Character enemy : enemies) {
                if (enemy.isAlive()) {
                    enemy.attack(p1);
                }
            }

            if (round % 3 == 0 && p1.isAlive()) {
                p1.heal(20);
            }

            round++;
        }

        System.out.println("\n=== Battle Result ===");
        if (p1.isAlive()) {
            System.out.println(p1.getName() + " wins the battle!");
        } else {
            System.out.println("Player has been defeated...");
        }
    }
}
