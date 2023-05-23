package model;

import javax.swing.*;
import java.awt.*;

public class Map {
    private int x;
    private int y;
    private int bit;

    private Image[] images = new Image[]{
            new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\brick.png").getImage(),
            new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\rock.png").getImage(),
            new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bird.png").getImage(),
            new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\tree.png").getImage(),
            new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\water.png").getImage(),

    };

    public Map(int x, int y, int bit) {
        this.x = x;
        this.y = y;
        this.bit = bit;
    }

    public void draw(Graphics2D g2d) {
        if (bit > 0) {
            g2d.drawImage(images[bit - 1], x, y, null);
        }
    }
}
