package hw12_1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
    private int x, y, diameter;
    private int xSpeed, ySpeed;
    private Window window;

    public Ball(Window window) {
        this.window = window;
        this.diameter = 30;
        this.x = window.getWidth() / 2;
        this.y = window.getHeight() / 2;
        this.xSpeed = 3;
        this.ySpeed = 3;
    }

    public void move() {
        if (x + xSpeed < 0 || x + diameter + xSpeed > window.getWidth()) {
            xSpeed = -xSpeed;
        }
        if (y + ySpeed < 0) {
            ySpeed = -ySpeed;
        }
        if (y + diameter + ySpeed > window.getHeight()) {
            window.gameOver();
        }
        if (collision()) {
            ySpeed = -ySpeed;
            y = window.racquet.getY() - diameter;
            Window.score++;  // 增加分数
        }
        x += xSpeed;
        y += ySpeed;
    }

    private boolean collision() {
        return window.racquet.getBounds().intersects(getBounds());
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, diameter, diameter);
    }

    public void paint(Graphics2D g2d) {
        g2d.setColor(Color.darkGray);
        g2d.fillOval(x, y, diameter, diameter);
    }
}
