package manager;

import model.Player;

import java.awt.*;

public class GameManager {
    private Player player;

    public void initGameManager() {
        player = new Player(200, 200);
    }

    public synchronized void draw(Graphics2D g2d) {
        try {
            player.draw(g2d);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void playerMove(int orient) {
        player.changeOrient(orient);
        player.move();
    }
}
