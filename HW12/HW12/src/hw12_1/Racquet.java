package hw12_1;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet extends JPanel {
    int x = 0;
    int step = 10;
    private static final int y = 570;
    private static final int WIDTH = 120;
    private static final int HEIGHT = 30;

    private Window window;

    public Racquet(Window window) {
        this.window = window;
    }

    public void move() {
        if (x + step > 0 && x + step < window.getWidth() - WIDTH) {
            x += step;
        }
    }

    public void paint(Graphics2D g) {
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            step = -10;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            step = 10;
        }
    }

    public void keyReleased(KeyEvent e) {
        step = 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }

    public int getY() {
        return y;
    }
}
