import UIGenerator.DarkThemeFactory;
import UIGenerator.LightThemeFactory;
import UIGenerator.UIFactory;

/// Bài toán: Hiện nay các giao diện của ứng dụng thường chia ra Light theme và Dark theme để phù hợp hiển thị cho từng
/// cấu hình hệ thống. Điều này làm cho việc thiết kế đối tượng sẽ tăng lên gấp đôi, và khi có quá nhiều đối tượng cho
/// mỗi theme thì việc sử dụng sẽ rất khó kiểm soát. Hãy thiết kế hệ thống chia ra Light/Dark theme và đơn giản hóa việc
///  render Button và TextField lên màn hình thông qua dòng thông báo
public class Main {
    public static void main(String[] args) {
        // Light theme
        System.out.println("Light theme App...");
        UIFactory LightUIFactory = new LightThemeFactory();
        App lightApp = new App(LightUIFactory);
        lightApp.show();

        System.out.println("-----------------------------");

        // Dark theme
        System.out.println("Dark theme App...");
        UIFactory DarkUIFactory = new DarkThemeFactory();
        App darkApp = new App(DarkUIFactory);
        darkApp.show();
    }
}