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

        Image tank = new ImageIcon("D:\\HocJava\\Tank90\\src\\src\\images\\bossyellow_up.png").getImage();
        graphics2D.drawImage(tank, 100, 100, Color.black, null);
    }
}
