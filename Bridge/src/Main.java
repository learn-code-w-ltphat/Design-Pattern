import Shape.Shape;
import Shape.Circle;
import Shape.Square;

import Draw.RasterDrawAPI;
import Draw.VectorDrawAPI;

/// /// Bài toán: Ở các ứng dụng vẽ đồ họa, việc vẽ theo định dạng Raster hoặc Vector hiện rất phù biến và tùy theo mục
/// đích, người vẽ sẽ chọn định dạng thích hợp hoặc có thể chuyển qua lại giữa 2 định dạng. Hãy thiết kế việc vẽ hình
/// vuông và hình tròn ở 2 định dạng được đơn giản hóa bằng cách in ra vị trí, thông số và dịnh dạng in.
public class Main {
    public static void main(String[] args) {
        Shape vectorCircle = new Circle(1, 2, 3, new VectorDrawAPI());
        Shape rasterSquare = new Square(5, 6, 4, new RasterDrawAPI());

        vectorCircle.draw();
        rasterSquare.draw();
    }
}