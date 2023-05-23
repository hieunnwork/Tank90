package gui;

import manager.GameManager;
import model.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.BitSet;
import java.util.Random;

public class CustomPanel extends JPanel implements Runnable, KeyListener {

    private BitSet bitSet;
    private GameManager gameManager;

    public CustomPanel() {
        gameManager = new GameManager();
        gameManager.initGameManager();
        bitSet = new BitSet(256);
        setBackground(Color.black);
        setFocusable(true);
        this.addKeyListener(this);

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(graphics2D);
        gameManager.draw(graphics2D);


    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            count++;
            if (bitSet.get(KeyEvent.VK_LEFT)) {
                gameManager.playerMove(Tank.LEFT);
            } else if (bitSet.get(KeyEvent.VK_RIGHT)) {
                gameManager.playerMove(Tank.RIGHT);
            } else if (bitSet.get(KeyEvent.VK_UP)) {
                gameManager.playerMove(Tank.UP);
            } else if (bitSet.get(KeyEvent.VK_DOWN)) {
                gameManager.playerMove(Tank.DOWN);
            }
            gameManager.bossMove();

            if (bitSet.get(KeyEvent.VK_SPACE)) {
                if (count > 20) {
                    gameManager.playerFire();
                    count = 0;
                }

            }
            gameManager.bulletMove();


            synchronized (CustomPanel.this) {
                repaint();
            }

            try {
                Thread.sleep(10);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        bitSet.set(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        bitSet.clear(e.getKeyCode());
    }

    private static int getRandomNumberInRange() {
        return (int) (Math.random() * 4);
    }
}
