package Characters;

import Abstract.*;

import java.util.ArrayList;

public class Monk extends Healer {
    public Monk(ArrayList<BaseHero> group, int x, int y) {
        super(12, 7, new int[] { -4, -4 }, 30, 5, States.ALIVE);
        super.group = group;
        super.position = new Position(x, y);
    }

}
