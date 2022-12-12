package Characters;

import Abstract.*;

import java.util.ArrayList;

public class Robber extends Warrior {

    boolean delivery;

    public Robber(ArrayList<BaseHero> group, int x, int y) {
        super(8, 3, new int[] { 2, 4 }, 10, 6, States.ALIVE);
        super.group = group;
        delivery = false;
        super.position = new Position(x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> group) {

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
