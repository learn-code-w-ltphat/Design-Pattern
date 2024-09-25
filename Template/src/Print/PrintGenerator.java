package Print;

public abstract class PrintGenerator {
    // Template method
    public final void generate() {
        preparePaper();
        addContent();
        finishPrinting();
    }

    // Common method
    protected void finishPrinting() {
        System.out.println("Ejecting the paper...");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void preparePaper();
    protected abstract void addContent();
}
