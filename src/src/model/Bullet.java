package model;

import javax.swing.*;

public class Bullet extends Object {

    private int speed;

    public Bullet(int x, int y) {
        super(x, y);
        speed = 1;
        images = new ImageIcon("G:\\java\\Tank90\\src\\src\\images\\bullet.png").getImage();
    }
}
