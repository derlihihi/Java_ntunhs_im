package hw12_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Window extends JFrame {
    static int score;
    Ball ball = new Ball(this);
    Racquet racquet = new Racquet(this);

    public Window() {
        this.setTitle("不讓球掉下來!!");
        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                racquet.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet.keyReleased(e);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.setFont(new Font("Verdana", Font.BOLD, 50));
        g2d.drawString(String.valueOf(score), 500, 120);
        ball.paint(g2d);
        racquet.paint(g2d);
    }

    private void move() {
        ball.move();
        racquet.move();
    }

    public void gameOver() {
        System.out.println("Game Over");
        System.exit(0);
    }

    public static void main(String[] args) throws InterruptedException {
        Window window = new Window();
        while (true) {
            window.move();
            window.repaint();
            Thread.sleep(10);
        }
    }
}
