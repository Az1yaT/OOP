package Characters;

import Abstract.*;

import java.util.ArrayList;

public class Peasant extends Warrior {

    boolean delivery;

    public Peasant(ArrayList<BaseHero> group, int x, int y) {
        super(1, 1, new int[] { 1, 1 }, 1, 3, States.ALIVE);
        super.group = group;
        delivery = true;
        super.position = new Position(x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> group) {
        if (getState().equals(States.USED))
            setState(States.ALIVE);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
