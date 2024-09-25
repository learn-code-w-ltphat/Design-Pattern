/// Bài toán: Để tạo nên món Pizza thì ta sẽ có nhiều bước để làm nó như thêm phô mai, lạp xưởng, nấm,... Và các công đoạn
/// này là riêng biệt nhau. Hãy thiết kế việc tạo ra Pizza một cách đơn giản hóa bằng dòng thông báo các bước đang làm.
/// Đặc biệt là các bước này có thể không theo thứ tự hoặc bỏ bớt bước vẫn có thể tạo được ra Pizza
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("large")
                .cheese(true)
                .pepperoni(true)
                .mushrooms(false)
                .build();

        System.out.println(pizza.toString());
    }
}