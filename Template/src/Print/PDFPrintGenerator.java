package Print;

public class PDFPrintGenerator extends PrintGenerator {
    @Override
    protected void preparePaper() {
        System.out.println("Loading PDF");
    }

    @Override
    protected void addContent() {
        System.out.println("Printing PDF");
    }
}
