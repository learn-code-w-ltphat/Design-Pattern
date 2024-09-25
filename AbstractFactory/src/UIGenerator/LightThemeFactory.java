package UIGenerator;

import Elements.Button.Button;
import Elements.Button.LightThemeButton;
import Elements.TextField.LightThemeTextField;
import Elements.TextField.TextField;

public class LightThemeFactory implements UIFactory {
    public Button createButton() {
        return new LightThemeButton();
    }

    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
