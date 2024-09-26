package Shape;

public class Rectangle implements Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }
}
