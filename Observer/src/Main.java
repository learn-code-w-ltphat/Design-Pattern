import Display.TemperatureDisplay;
import Weather.SimpleWeatherStation;

/// Bài toán: Ứng dụng dự báo thời tiết hiện rất phổ biến và được sử dụng rộng rãi để cập nhật tình hình nhiệt độ, thời
/// tiết của một khu vực nhất định. Hãy thiết kế trạm thông tin thời tiết đơn giản bằng cách thông báo cho các thiết bị
/// kết nối đến nó sự thay đổi của nhiệt độ. Các thiết bị như Điện thoại, Máy tính bảng sẽ chỉ cần in ra thông báo về
/// chỉ số nhiệt độ hiện tại mà nó nhận được.
public class Main {
    public static void main(String[] args) {
        SimpleWeatherStation station = new SimpleWeatherStation();

        TemperatureDisplay mobileApp = new TemperatureDisplay("Mobile");
        TemperatureDisplay tabletApp = new TemperatureDisplay("Tablet");

        station.registerObserver(mobileApp);
        station.registerObserver(tabletApp);

        station.setTemperature(20);
        station.setTemperature(30);

        station.removeObserver(mobileApp);
        station.setTemperature(18);
    }
}