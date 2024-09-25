package UIGenerator;

import Elements.Button.Button;
import Elements.Button.DarkThemeButton;
import Elements.TextField.DarkThemeTextField;
import Elements.TextField.TextField;

public class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }

    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
