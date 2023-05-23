package model;

import gui.CustomFrame;
import gui.CustomPanel;

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

    public void draw(Graphics2D g2d) {
        g2d.drawImage(images[orient], x, y, null);
    }

    public void changeOrient(int newOrient) {
        if (x <= 0) {
            orient = newOrient;
        } else if (y <= 0) {
            orient = newOrient;
        } else if (x >= CustomFrame.W_FRAME - images[orient].getWidth(null) - 17) {
            orient = newOrient;
        } else if (y >= CustomFrame.H_FRAME - images[orient].getWidth(null) - 40) {
            orient = newOrient;
        }


    }

    public void move() {
        switch (orient) {
            case LEFT:
                x -= speed;
                break;
            case RIGHT:
                x += speed;
                break;
            case UP:
                y -= speed;
                break;
            case DOWN:
                y += speed;
                break;
        }
        if (x < 0) {
            x = 0;
        } else if (y < 0) {
            y = 0;
        } else if (x > CustomFrame.W_FRAME - images[orient].getWidth(null) - 17) {
            x = CustomFrame.W_FRAME - images[orient].getWidth(null) - 17;
        } else if (y > CustomFrame.H_FRAME - images[orient].getWidth(null) - 40) {
            y = CustomFrame.H_FRAME - images[orient].getHeight(null) - 40;
        }
    }

    public Bullet fire() {
        int x = this.x + images[orient].getWidth(null) / 2;
        int y = this.y + images[orient].getHeight(null) / 2;
        return new Bullet(x, y, orient);
    }
}
