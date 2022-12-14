package Abstract;

import Characters.*;
import View.*;

import java.util.ArrayList;

public abstract class BaseHero implements BaseInterface {
    private int attack;
    private int protection;
    private int[] damage;
    private double health;
    private int speed;
    private double maxHealth;
    private States state;
    protected ArrayList<BaseHero> group;
    protected Position position;

    public BaseHero(int attack, int protection, int[] damage, double health, int speed, States state) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.state = state;
        this.maxHealth = health;
    }

    public void setState(States state) {
        this.state = state;
        System.out.println(state);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public ArrayList<BaseHero> getGroup() {
        return group;
    }

    public States getState() {
        return state;
    }

    public int[] getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setHealth(double health) {
        if (health > getMaxHealth())
            this.health = maxHealth;
        else
            this.health = health;
    }

    @Override
    public String getInfo() {
        String str = state + "";
        String str2 = (int) health + "";
        if (state.equals(States.DEAD))
            str = AnsiColors.ANSI_RED + state + AnsiColors.ANSI_RESET;
        if (maxHealth - health != 0)
            str2 = AnsiColors.ANSI_RED + (int) health + AnsiColors.ANSI_RESET;
        return AnsiColors.ANSI_CYAN + getClass().getSimpleName() + AnsiColors.ANSI_RESET +
                " HP/Max: " + str2 + "/" + (int) maxHealth + " " + str;
    }

    @Override
    public void step(ArrayList<BaseHero> group) {
    }

    protected void getAttack(BaseHero hero) {
        setState(States.ATTACK);
        if (attack == hero.protection && speed < position.getDist(hero.getPosition()))
            hero.health -= (damage[0] + damage[1]) / 4;
        if (attack == hero.protection)
            hero.health -= (damage[0] + damage[1]) / 2;
        if (attack > hero.protection && speed < position.getDist(hero.getPosition()))
            hero.health -= damage[1] / 2;
        if (attack > hero.protection)
            hero.health -= damage[1];
        if (attack < hero.protection && speed < position.getDist(hero.getPosition()))
            hero.health -= damage[0] / 2;
        else
            hero.health -= damage[0];
        if (hero.health <= 0) {
            hero.health = 0;
            hero.setState(States.DEAD);
        }
    }
}
