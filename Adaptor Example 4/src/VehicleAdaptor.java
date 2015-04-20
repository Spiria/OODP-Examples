public class VehicleAdaptor extends WaterVehicle implements Vehicle{
	public VehicleAdaptor(String name)
	{
		super(name);
	}
    public void ShowAction()
    {
        super.ShowFloatSkid();
    }
}
