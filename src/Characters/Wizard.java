package Characters;

import Abstract.*;

import java.util.ArrayList;

public class Wizard extends Healer {
    public Wizard(ArrayList<BaseHero> group, int x, int y) {
        super(17, 12, new int[]{-5,-5}, 30, 9, States.ALIVE);
        super.group = group;
        super.position = new Position(x, y);
    }

    @Override
    public void step(ArrayList<BaseHero> group) {

    }
}
