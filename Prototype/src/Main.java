import Shape.Shape;
import Shape.Circle;
import Shape.Rectangle;

/// Bài toán: Cho một số lớp hình học như Hình chữ nhật, Hình tròn. Khi thao tác trên các ứng dụng vẽ hình. Ta sẽ dễ
/// dàng bắt gặp việc có thể copy các hình đang chọn và tạo ra hình mới y hệt. Hãy thiết kế và đơn giản hóa việc hiển
/// thị hình học ấy thông qua dòng thông báo hiển thị thông tin kích thước và vị trí của nó.
public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(3, 4, 5);
        circle1.draw();

        Shape circle2 = circle1.clone();
        circle2.setPosition(2, 4);
        circle2.draw();

        Shape rectangle1 = new Rectangle(4, 4, 5, 5);
        rectangle1.draw();

        Shape rectangle2 = rectangle1.clone();
        rectangle2.setPosition(5, 5);
        rectangle2.draw();
    }
}