package designPattern.abstractfactory;

public class LinuxFactory extends AbstractFactory {

    private static Button button=null;
    private static CheckBox checkBox=null;
    public Button getButton(int no)
    {
        switch (no)
        {
            case 2:
                button=new LinuxButton();
                break;
            default:
                System.out.println("CheckBox not found");
                break;
        }
        return button;
    }

    public CheckBox getCheckBox(int no)
    {
        switch (no)
        {
            case 4:
                checkBox=new WindowsCheckBox();
                break;
            default:
                System.out.println("CheckBox not found");
                break;
        }
        return checkBox;
    }

}
