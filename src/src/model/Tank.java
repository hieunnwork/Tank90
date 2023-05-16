package model;

import java.awt.*;

public class Tank {

    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    protected int x;
    protected int y;
    protected int orient;

    protected int speed;
    protected Image[] images;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;

    }
}
