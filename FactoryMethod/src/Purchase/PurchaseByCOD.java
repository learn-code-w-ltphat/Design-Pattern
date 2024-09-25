package Purchase;

/// Lớp PurchaseByBank là lớp chuyên trách ConcreteProduct trong Factory Method Pattern chịu trách nhiệm xử lý nghiệp vụ
/// thanh toán khi nhận hàng
public class PurchaseByCOD implements  PurchaseFactory {
    /// Phương thức xử lý nghiệp vụ của lớp chuyên trách PurchaseByCOD, đơn giản hóa công việc thanh toán bằng cách in
    /// ra màn hình thông báo
    @Override
    public void makePurchase() {
        System.out.println("Purchase By COD");
    }
}
