package Draw;

public class RasterDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle[ x: " + x + ", y: " + y + ", radius: " + radius + "] in raster");
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing Square[ x: " + x + ", y: " + y + ", side: " + side + "] in raster");
    }
}
