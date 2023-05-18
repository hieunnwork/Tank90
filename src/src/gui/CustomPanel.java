package gui;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    public CustomPanel() {
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(graphics2D);

        Image tank = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\player_green_up.png").getImage();
        graphics2D.drawImage(tank, 200, 400, null);
        Image bullet = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bullet.png").getImage();
        graphics2D.drawImage(bullet, 200, 300, null);
        Image bird = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bird.png").getImage();
        graphics2D.drawImage(bird, 200, 200, null);
        Image boss = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bossyellow_down.png").getImage();
        graphics2D.drawImage(boss, 200, 210, null);
        Image rock = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\rock.png").getImage();
        graphics2D.drawImage(rock, 300, 300, null);
        Image tree = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\tree.png").getImage();
        graphics2D.drawImage(tree, 100, 300, null);
        Image water = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\water.png").getImage();
        graphics2D.drawImage(water, 150, 300, null);
        Image brick = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\brick.png").getImage();
        graphics2D.drawImage(brick, 200, 150, null);

    }
}
