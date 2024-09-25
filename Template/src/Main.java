import Print.PDFPrintGenerator;
import Print.PrintGenerator;
import Print.TextPrintGenerator;
import Print.WordPrintGenerator;

/// Bài toán: Khi tạo ra bản in, ta có thể sử dụng file text bình thường, file word, pdf,... Hãy thiết kế và đơn giản
/// hóa quá trình thu đọc dữ liệu theo từng định dạng file và xuất ra bản in bằng dòng thông báo.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start printing Txt");
        PrintGenerator textPrinter = new TextPrintGenerator();
        textPrinter.generate();

        System.out.println("----------------------------------");

        System.out.println("Start printing PDF");
        PrintGenerator PDFPrinter = new PDFPrintGenerator();
        PDFPrinter.generate();

        System.out.println("----------------------------------");

        System.out.println("Start printing Word");
        PrintGenerator WordPrinter = new WordPrintGenerator();
        WordPrinter.generate();
    }
}