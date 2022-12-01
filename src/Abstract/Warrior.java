package Abstract;

public abstract class Warrior extends BaseHero {
    public Warrior(int attack, int protection, int[] damage, double health, int speed, States state) {
        super(attack, protection, damage, health, speed, state);
    }
}
