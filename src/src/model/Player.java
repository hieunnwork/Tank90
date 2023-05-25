package model;

import javax.swing.*;
import java.awt.*;

public class Player extends Tank {

    public Player(int x, int y) {
        super(x, y);
        orient = UP;
        this.speed = 1;
        images = new Image[]{
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\player_green_left.png").getImage(),
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\player_green_right.png").getImage(),
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\player_green_up.png").getImage(),
                new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\player_green_down.png").getImage(),
        };
    }


}
