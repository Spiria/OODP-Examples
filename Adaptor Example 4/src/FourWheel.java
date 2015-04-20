public class FourWheel implements Vehicle
{
    private String name;

    public FourWheel(String name)
    {
        this.name = name;
    }

    public void ShowAction()
    {
        System.out.println("Four wheel vehicle " + this.name + " moves on land.");
    }
}

