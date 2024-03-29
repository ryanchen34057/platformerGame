package level;

import character.Id;

import java.awt.*;

public abstract class Tile {
    //Coordinate
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    //State
    protected boolean breakable;

    //info
    private Id id;

    public Tile(int x, int y, int width, int height, boolean breakable, Id id) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.id = id;
        this.breakable = breakable;
    }

    //getters and setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x += x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y += y;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Id getId() {
        return id;
    }

    // Drawing method
    public abstract void paint(Graphics g);

    // Update method
    public abstract void update();

    // Collision test
    public Rectangle getBounds() {
        return new Rectangle(getX(), getY(), width, height);
    }
    public abstract Rectangle getBoundsTop();
    public abstract Rectangle getBoundsBottom();
    public abstract Rectangle getBoundsLeft();
    public abstract Rectangle getBoundsRight();
}
