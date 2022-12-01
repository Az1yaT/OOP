package Abstract;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {
    int shoot;

    public Shooter(int attack, int protection, int[] damage, double health, int speed, States state, int shoot) {
        super(attack, protection, damage, health, speed, state);
        this.shoot = shoot;
    }

    @Override
    public void step(ArrayList<BaseHero> group) {

    }

}
