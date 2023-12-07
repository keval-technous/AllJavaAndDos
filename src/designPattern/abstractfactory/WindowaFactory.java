package designPattern.abstractfactory;

public class WindowaFactory extends AbstractFactory{
    private static Button button=null;
    private static CheckBox checkBox=null;
    public Button getButton(int no)
    {
        switch (no)
        {
            case 1:
                button=new WindowaButton();
                break;
            default:
                System.out.println("Windows Button not found");
                break;
        }
        return button;
    }

    public CheckBox getCheckBox(int no)
    {
        switch (no)
        {
            case 3:
                checkBox=new WindowsCheckBox();
                break;
            default:
                System.out.println("Windows CheckBox not found");
                break;
        }
        return checkBox;
    }

}
