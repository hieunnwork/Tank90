package model;

import javax.swing.*;
import java.awt.*;

public class Boss extends Tank {

    public Boss(int x, int y) {
        super(x, y);
        speed = 1;
        orient = DOWN;
        images = new Image[]{
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bossyellow_up.png").getImage(),
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bossyellow_down.png").getImage(),
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bossyellow_left.png").getImage(),
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bossyellow_right.png").getImage(),
        };
    }
}
