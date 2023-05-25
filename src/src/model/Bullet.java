package model;

import gui.CustomFrame;

import javax.swing.*;
import java.awt.*;

public class Bullet {
    private int x;
    private int y;
    private int speed;
    private int orient;
    private Image image = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bullet.png").getImage();

    public Bullet(int x, int y, int orient) {
        this.x = x - image.getWidth(null) / 2;
        this.y = y - image.getHeight(null) / 2;
        this.orient = orient;
        speed = 4;

    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(image, x, y, null);
    }

    public boolean move() {
        switch (orient) {
            case Tank.LEFT:
                x -= speed;
                break;
            case Tank.RIGHT:
                x += speed;
                break;
            case Tank.UP:
                y -= speed;
                break;
            case Tank.DOWN:
                y += speed;
                break;
        }
        if (x <= 0 || y <= 0 || x >= CustomFrame.W_FRAME - image.getWidth(null) ||
                y >= CustomFrame.H_FRAME - image.getHeight(null)) {
            return true;
        }
        return false;
    }

    public Rectangle getRec() {
        Rectangle rectangle;
        rectangle = new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
        return rectangle;
    }
}
