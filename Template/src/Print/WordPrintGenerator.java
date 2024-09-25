package Print;

public class WordPrintGenerator extends PrintGenerator {
    @Override
    protected void preparePaper() {
        System.out.println("Loading Word");
    }

    @Override
    protected void addContent() {
        System.out.println("Printing Word");
    }
}
