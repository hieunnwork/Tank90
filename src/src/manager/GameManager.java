package manager;

import model.Boss;
import model.Bullet;
import model.Map;
import model.Player;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class GameManager {
    private Player player;
    private ArrayList<Boss> bossList = new ArrayList<>();

    private ArrayList<Bullet> bullets = new ArrayList<>();

    private ArrayList<Map> maps;


    public void initGameManager() {
        player = new Player(200, 200);
        for (int i = 0; i < 10; i++) {
            Boss boss = new Boss(getRandomNumberInRange(50, 350), getRandomNumberInRange(50, 350));
            bossList.add(boss);
        }
        maps = new ArrayList<>();
        readMap("D:\\HocJava\\Tank90\\src\\src\\map\\map.txt");


    }

    public void bossMove() {

        for (int i = 0; i < bossList.size(); i++) {
            bossList.get(i).changeOrient((getRandomNumberInRange(0, 3)));
            bossList.get(i).move();

        }

    }


    public synchronized void draw(Graphics2D g2d) {
        try {
            player.draw(g2d);
            for (int i = 0; i < bossList.size(); i++) {
                bossList.get(i).draw(g2d);
            }
            for (int i = 0; i < bullets.size(); i++) {
                bullets.get(i).draw(g2d);
            }
            for (int i = 0; i < maps.size(); i++) {
                maps.get(i).draw(g2d);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void playerMove(int orient) {
        player.changeOrient(orient);
        player.move();
    }

    public void bulletMove() {
        for (int i = 0; i < bullets.size(); i++) {
            Boolean check = bullets.get(i).move();
            if (check) {
                bullets.remove(i);
            }
        }
    }

    public void playerFire() {
        bullets.add(player.fire());
        System.out.println(bullets.size());
    }


    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void readMap(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int row = 0;
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    int bit = Integer.parseInt(String.valueOf(line.charAt(i)));
                    Map map = new Map(i * 19, row * 19, bit);
                    maps.add(map);
                }
                line = bufferedReader.readLine();
                row++;
            }
            bufferedReader.close();
            fileReader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
