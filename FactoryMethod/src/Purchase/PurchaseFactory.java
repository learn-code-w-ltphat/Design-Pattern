package Purchase;

/// Interface PurchaseFactory là lớp Product trong Factory Method Pattern chịu trách nhiệm quy định tên phương thức
/// xử lý nghiệp vụ của các lớp chuyên trách ConcreteProduct
public interface PurchaseFactory {
    /// Phương thức xử lý nghiệp vụ của các lớp chuyên trách ConcreteProduct
    void makePurchase();
}
