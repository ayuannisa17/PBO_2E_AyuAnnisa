package game;

import java.util.*;

public class GameTest {
    public static void main(String[] args) {
        Player player = new Player("HeroVipkas", 120, 25, 5, new LevelScaledStrategy(2));
        player.addSkill(new HealSkill(15));
        player.addSkill(new PiercingStrike(1.2));
        player.addEffect(new Shield(10, 3));
        player.addEffect(new Regen(8, 4));

        BossMonster boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy());
        Monster monster = new Monster("Goblin", 80, 12, 2, new FixedStrategy());

        Battle battle = new Battle(
            Arrays.asList(player),
            Arrays.asList(boss, monster)
        );

        battle.run();
    }
}