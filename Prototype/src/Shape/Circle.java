package Shape;

public class Circle implements Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at (" + x + "," + y + ") with radius " + radius);
    }

    @Override
    public Shape clone() {
        return new Circle(this.x, this.y, this.radius);
    }
}
