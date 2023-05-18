package gui;

import javax.swing.*;

public class CustomFrame extends JFrame {
    public static final int W_FRAME = 26*19;

    public static final int H_FRAME = 25*19;

    public CustomFrame() {
        setTitle("Tank 90");
        setSize(W_FRAME, H_FRAME);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        CustomPanel customPanel = new CustomPanel();
        add(customPanel);

    }


}
