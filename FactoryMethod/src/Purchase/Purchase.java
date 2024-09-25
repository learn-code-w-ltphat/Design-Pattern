package Purchase;

/// Lớp Purchase là Creator trong Factory Method Pattern chịu trách nhiệm xử lý tình huống và tạo ra các đối tượng
/// chuyên trách tương ứng để xử lý một trong một họ tình huống
public class Purchase {
    /// Phương thức xử lý thanh toán
    /// @param by có kiểu enum chỉ thị phương thức thanh toán
    /// @throws Exception khi mà phương thức truyền vào là null
    public static void purchase(PaymentMethod by) throws Exception {
        // Kiểm tra đầu vào
        if (by == null) {
            throw new Exception("Method can not be null");
        }

        // Xét tình huống xem hình thức thanh toán nào được yêu cầu
        PurchaseFactory purchase = switch (by) {
            case PaymentMethod.CARD -> new PurchaseByCard();
            case PaymentMethod.BANK -> new PurchaseByBank();
            default -> new PurchaseByCOD(); // Mặc định sẽ là thanh toán khi nhận hàng
        };

        // Gọi hàm chuyên trách xử lý nghiệp vụ thanh toán
        purchase.makePurchase();
    }
}
