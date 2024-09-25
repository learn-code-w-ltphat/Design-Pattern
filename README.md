# Design Pattern - Cửu âm chân kinh võ công cao cường

**Mẫu Thiết Kế (Design Pattern)** là những giải pháp thiết kế đã được chứng minh hiệu quả, được đúc kết từ kinh nghiệm của các nhà phát triển phần mềm hàng đầu. Chúng cung cấp những khuôn mẫu trừu tượng hóa các vấn đề thiết kế phổ biến, giúp các lập trình viên giải quyết các bài toán tương tự một cách hiệu quả và nhất quán.

Việc phát triển phần mềm vẫn có thể hoàn chỉnh mà không cần đến Design Pattern, nhưng sự xuất hiện của Design Pattern sẽ giúp cho việc xác định bài toán cần giải quyết nhanh gọn hơn. Từ đó đưa ra cách giải quyết hợp lý.

## Lịch sử hình thành

Xuất hiện từ những năm 1980, các mẫu thiết kế được hệ thống hóa và phổ biến rộng rãi qua cuốn sách "Design Patterns: Elements of Reusable Object-Oriented Software" của "Gang of Four". Cuốn sách này đã trở thành một tài liệu kinh điển, đặt nền tảng cho việc nghiên cứu và ứng dụng các mẫu thiết kế trong lập trình hướng đối tượng.

## Tại sao cần Design Pattern

Trong quá trình phát triển phần mềm, các lập trình viên thường gặp phải những vấn đề thiết kế tương tự. Thay vì phải tự mình tìm ra giải pháp cho từng vấn đề, các Design Pattern cung cấp những khuôn mẫu đã được kiểm chứng, giúp tiết kiệm thời gian, nâng cao chất lượng code và đảm bảo tính nhất quán của hệ thống.

Ngoài ra, các Design Pattern tuân thủ nghiêm ngặt các nguyên tắc của việc thiết kế hướng đối tượng nên chúng sẽ tăng khả năng cải thiện và mở rộng, khả năng tái sử dụng, tính đọc hiểu của code và giảm thiểu lỗi.

## Các loại Design Pattern

### Mẫu kiến tạo (Creational)

- Hướng đến việc trừu tượng hóa quá trình khởi tạo đối tượng.
- Giúp hệ thống độc lập với việc khởi tạo đối tượng.

### Mẫu cấu trúc (Structural)

- Hướng đến việc ràng buộc về cách kết hợp giữa các lớp, các đối tượng.
- Sắp xếp sự quan hệ giữa các lớp, các đối tượng sao cho nếu có bất kì sự thay đổi nào đối với hệ thống đều không phá vỡ mối quan hệ đó.

### Mẫu tương tác (Behavioral)

- Hướng đến việc tương tác giữa các đối tượng với nhau.
- Sắp xếp, phân phối, cộng tác giữa các lớp để giải quyết một hay một nhóm trách nhiệm nào đó.

## Sự đánh đổi khi áp dụng Design Pattern

Vì sự linh động và khả năng tái sử dụng trong phần mềm cũng đồng nghĩa với việc xuất hiện hàng loạt các lớp trừu tượng và các phân tầng trong mô hình lớp. Các phân tầng trừu tượng này sẽ làm giảm hiệu năng và tốc độ của hệ thống. Do đó, cần phải cân nhắc phần mềm nào ưu tiên sự linh động và khả năng tái sử dụng, phần mềm nào ưu tiên tốc độ và hiệu năng để quyết định có nên áp dụng Design Pattern hay không.

Bên cạnh đó, việc cài đặt các Design Pattern còn phụ thuộc vào trình độ và kĩ năng của lập trình viên. Nếu áp dụng mù quáng và xử lý không khéo sẽ dẫn đến việc Design Pattern mang lại hiệu quả kém hơn là không áp dụng.

## Cách sử dụng

Các Design Pattern sẽ được mình minh họa thông qua ngôn ngữ lập trình Java, một ngôn ngữ thuần hướng đối tượng.

Đầu tiên, clone project về theo cú pháp:

``` bash
    git clone https://github.com/learn-code-w-ltphat/Design-Pattern.git
```

Sau đó, thư mục Design-Pattern sẽ chứa các giải thích ở file *README.md* và đoạn code tương ứng với từng Design Pattern ở folder *src* theo cấu trúc sau:

``` 
    Design-Pattern/         #Thư mục chính
    ├── PatternName/        #Tên của Design Pattern nào đó
    │   ├── .idea/          #Folder cấu hình của Intelij
    │   ├── src/            #Folder chính chứa mã nguồn
    │   │   └── Main.java   #File main thực thi 
    │   │   └── ...         #Các file chứa các lớp khác phụ trợ
    │   └── .gitignore
    │   └── PatternName.iml #File cấu hình của Intelij
    │   └── README.md       #File mô tả bài toán, giải thích, hướng dẫn
    ├── ...
    └── README.md           #File giới thiệu và hướng dẫn chung
```

# Đóng góp

Mình luôn hoan nghênh sự đóng góp từ cộng đồng để cải thiện repo này. Nếu bạn muốn bổ sung hay sửa đổi, vui lòng làm theo các bước sau để tạo một Pull Request:

1. Fork repo này về tài khoản GitHub của bạn.
2. Clone repo đã fork về máy bằng lệnh:
``` bash
    git clone https://github.com/your-username/Design-Pattern.git
```
3. Tạo một branch mới để thực hiện các thay đổi của bạn:
``` bash
    git checkout -b feature/my-contribution
```
4. Thực hiện các thay đổi, bổ sung mã và commit:
``` bash
    git commit -m "Thêm phần giải thích mới cho Design Pattern X"
```
5. Push branch của bạn lên GitHub:
```bash
git push origin feature/my-contribution
```
6. Truy cập vào repo gốc, nhấn vào tab Pull requests và tạo một pull request mới.

Mình sẽ xem xét và phản hồi nhanh chóng về các thay đổi của bạn.

# Liên hệ

Nếu bạn có bất kỳ câu hỏi nào hoặc muốn đóng góp ý kiến, đừng ngần ngại liên hệ với mình qua các kênh sau:

- ✉️ Email: [ltphat2204@gmail.com](mailto:ltphat2204@gmail.com)
- 📘 Facebook: [Lê Tấn Phát](https://www.facebook.com/ltp.2204)
- ⭐ Theo dõi các bài khác: [Github - Học code cùng ltphat](https://github.com/learn-code-w-ltphat)

Chúc mọi người học tốt và áp dụng thành công các mẫu thiết kế trong dự án của mình. Hãy kiên nhẫn và đừng ngại thử nghiệm! 😊