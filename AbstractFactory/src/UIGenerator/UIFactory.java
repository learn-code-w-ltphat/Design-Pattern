package UIGenerator;

import Elements.Button.Button;
import Elements.TextField.TextField;

public interface UIFactory {
    Button createButton();
    TextField createTextField();
}
