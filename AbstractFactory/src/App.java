import Elements.Button.Button;
import Elements.TextField.TextField;
import UIGenerator.UIFactory;

public class App {
    UIFactory gui;

    public App(UIFactory gui) {
        this.gui = gui;
    }

    public void show() {
        Button button = gui.createButton();
        TextField textField = gui.createTextField();

        button.render();
        textField.render();
    }
}
