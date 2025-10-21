package game;

public interface AttackStrategy {
    String getName();
    int computeDamage(Character self, Character target);
}