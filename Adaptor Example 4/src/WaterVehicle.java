public class WaterVehicle {
    private String name;

    public WaterVehicle(String name)
    {
        this.name = name;
    }

    public void ShowFloatSkid()
    {
        System.out.println("Water vehicle " + this.name + " skids on water.");
    }
}

