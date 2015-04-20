public class TwoWheel implements Vehicle
{
    private String name;

    public TwoWheel(String name)
    {
        this.name = name;
    }

    public void ShowAction()
    {
        System.out.println("Two wheel vehicle " + this.name + " moves on land.");
    }
}
