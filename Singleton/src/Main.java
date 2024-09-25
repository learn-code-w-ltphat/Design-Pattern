/// Bài toán: Phần mềm Unikey là phần mềm hỗ trợ gõ tiếng Việt rất thông dụng trên Windows. Tuy nhiên, phần mềm này chỉ
/// mở một cửa sổ duy nhất và nếu như mình mở thêm lần nữa thì vẫn hiện ra cửa sổ đang mở. Hãy thiết kế phiên bản đơn
/// giản của Unikey bằng cách thiết lập một class Unikey và có phương thức showDialog in ra màn hình địa chỉ của class
/// Unikey được gọi
public class Main {
    public static void main(String[] args) {
        // Mở Unikey
        Unikey dialog1 = Unikey.getNewDialog();
        dialog1.showDialog();

        // Mở Unikey thêm lần nữa
        Unikey dialog2 = Unikey.getNewDialog();
        dialog2.showDialog();

        // Kiểm tra 2 dialog mình vừa mở có giống nhau không
        if (dialog1 == dialog2) {
            System.out.println("Dialog1 and Dialog2 are the same");
        } else {
            System.out.println("Dialog1 and Dialog2 are not the same");
        }
    }
}