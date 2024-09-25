import Purchase.Purchase;
import Purchase.PaymentMethod;

/// Bài toán: Hiện nay trên các sàn thương mại điện tử đã và đang tích hợp rất nhiều phương thức thanh toán khác nhau
/// như thanh toán tiền mặt khi nhận hàng, thanh toán chuyển khoản, thanh toán thẻ tín dụng,… Vì thế, khi ấn vào các nút
/// tương ứng, ta cần có các hàm chuyên dụng để thực thi các phương thức thanh toán ấy. Hãy đơn giản hóa bằng việc in ra
/// dòng thông báo phương thức thanh toán cho mỗi phương thức thanh toán được yêu cầu
public class Main {
    public static void main(String[] args) {
        try {
            Purchase.purchase(PaymentMethod.COD);
            Purchase.purchase(PaymentMethod.BANK);
            Purchase.purchase(PaymentMethod.CARD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
