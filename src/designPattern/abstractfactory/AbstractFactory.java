package designPattern.abstractfactory;

public abstract class AbstractFactory {
    public abstract Button getButton(int windowsNo);
    public abstract CheckBox getCheckBox(int windowsNo);
}
