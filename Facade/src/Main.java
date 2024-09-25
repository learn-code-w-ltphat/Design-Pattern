import HomeSystem.AirConditioner;
import HomeSystem.Light;
import HomeSystem.Security;
import HomeSystem.Television;

/// Bài toán: Bạn đang phát triển một hệ thống Tự động hóa Nhà thông minh với các thiết bị như đèn, máy điều hòa không
/// khí, TV và thiết bị an ninh. Mỗi thiết bị có nhiều thao tác phức tạp như bật/tắt, điều chỉnh nhiệt độ, thay đổi
/// kênh,... Việc điều khiển từng thiết bị riêng lẻ rất phức tạp và không thân thiện với người dùng. Hãy thiết kế một hệ
/// thống đơn giản hơn bằng cách tạo ra một lớp HomeControl để cung cấp các phương thức đơn giản như "Bật/tắt tất cả hệ
/// thống", "Bật chế độ xem phim" (giảm độ sáng đèn, bật TV, điều chỉnh máy điều hòa ở nhiệt độ thoải mái), "Bật/tắt chế
/// độ an ninh" giúp tự động hóa và đồng bộ việc điều khiển tất cả các thiết bị cùng lúc.
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        Television television = new Television();
        Security security = new Security();

        HomeControl remoteDevice = new HomeControl(light, airConditioner, security, television);

        System.out.println("Remote starting...");

        System.out.println("---------------------------------------");
        remoteDevice.activateAll();

        System.out.println("---------------------------------------");
        remoteDevice.activateMovieMode(200);

        System.out.println("---------------------------------------");
        remoteDevice.activateSecurityMode();

        System.out.println("---------------------------------------");
        remoteDevice.turnOffAllSystems();
    }
}