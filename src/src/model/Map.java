package model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
            if (bit != 3) {
                g2d.drawImage(images[bit - 1], x, y, null);

            } else {
                g2d.drawImage(images[bit - 1], x, y, 38, 38, null);
            }

        }
    }

    public Rectangle getRec() {
        Rectangle rectangle = null;
        if (bit == 0 || bit == 4) {
            rectangle = new Rectangle();
        } else if (bit == 3) {
            rectangle = new Rectangle(x, y, 38, 38);
        } else {
            rectangle = new Rectangle(x, y, images[bit - 1].getWidth(null), images[bit - 1].getHeight(null));
        }
        return rectangle;
    }

    public boolean checkBullet(ArrayList<Bullet> bullets) {
        for (int i = 0; i < bullets.size(); i++) {
            Rectangle rectangle = getRec().intersection(bullets.get(i).getRec());
            if (!rectangle.isEmpty()) {
                bullets.remove(i);
                if (bit == 3) {
                    return false;
                }
                if (bit == 1) {
                    bit = 0;
                }
                return true;
            }
        }
        return true;
    }

}
