public class Unikey {
    /// instance lưu trữ thể hiện của một lớp Unikey (có thể được xem là 1 tiến trình chạy trong Windows)
    /// static để cho phép 1 thể hiện được sử dụng trước khi tạo dựng 1 lớp (1 tiến trình duy nhất)
    private static Unikey instance;

    /// Giấu đi phương thức khởi tạo để không cho phép người dùng tự ý tạo dựng lớp Unikey
    private Unikey() { }

    /// Được sử dụng để khởi tạo và trả về thể hiện của lớp Unikey
    /// @return Lớp Unikey (có thể được xem là 1 tiến trình chạy trong Windows)
    public static Unikey getNewDialog() {
        /// Kiểm tra xem nếu chưa có lớp Unikey hay tiến trình nào đang chạy thì tạo mới
        if (instance == null) {
            instance = new Unikey();
        }

        /// Trả về lớp Unikey (tiến trình chạy Unikey)
        return instance;
    }

    /// Đơn giản hóa công việc hiển thị Dialog bằng cách in ra màn hình thông báo
    public void showDialog() {
        System.out.printf("Dialog with address %s is showing!%n", instance);
    }
}
