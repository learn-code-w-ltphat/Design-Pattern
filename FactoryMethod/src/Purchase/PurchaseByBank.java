package Purchase;

/// Lớp PurchaseByBank là lớp chuyên trách ConcreteProduct trong Factory Method Pattern chịu trách nhiệm xử lý nghiệp vụ
/// thanh toán thông qua tài khoản ngân hàng
public class PurchaseByBank implements  PurchaseFactory{
    /// Phương thức xử lý nghiệp vụ của lớp chuyên trách PurchaseByBank, đơn giản hóa công việc thanh toán bằng cách in
    /// ra màn hình thông báo
    @Override
    public void makePurchase() {
        System.out.println("Purchase by Bank");
    }
}
