public class MultiWheel implements Vehicle
{
    private String name;

    public MultiWheel(String name)
    {
        this.name = name;
    }

    public void ShowAction()
    {
        System.out.println("Multi wheel vehicle " + this.name + " moves on land.");
    }
}
