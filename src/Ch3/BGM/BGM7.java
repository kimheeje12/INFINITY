package Ch3.BGM;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

import javazoom.jl.player.Player;

public class BGM7 extends Thread {

    private static Player player;
    private boolean isLoop;
    private static String name;
    private static FileInputStream fis;
    private static BufferedInputStream bis;

    public BGM7(String filename, boolean isLoop) {
        try {
            this.isLoop = isLoop;
            name = filename;
            fis = new FileInputStream("C:\\Users\\kimhe\\IdeaProjects\\CH1\\src\\music\\끝" + name);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        isLoop = false;
        player.close();
        this.interrupt();
    }

    public void run() {
        try {
            do {
                fis = new FileInputStream("C:\\Users\\kimhe\\IdeaProjects\\CH1\\src\\music\\끝" + name);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();
            } while (isLoop);
        } catch (Exception e) {
        }
    }
}