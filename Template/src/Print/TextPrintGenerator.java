package Print;

public class TextPrintGenerator extends PrintGenerator {
    @Override
    protected void preparePaper() {
        System.out.println("Loading Txt");
    }

    @Override
    protected void addContent() {
        System.out.println("Printing Txt");
    }
}
