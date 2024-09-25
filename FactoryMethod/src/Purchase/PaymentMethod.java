package Purchase;

/// Các phương thức xử lý thanh toán
public enum PaymentMethod {
    /// Thanh toán khi nhận hàng
    COD,

    /// Thanh toán thông qua thẻ tín dụng hoặc thẻ ghi nợ
    CARD,

    /// Thanh toán thông qua tài khoản ngân hàng
    BANK
}
