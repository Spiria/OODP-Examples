public class AdaptorClass {

	public static void main(String[] args) {
		Vehicle[] list = { new MultiWheel("trailer"), new FourWheel("bus"),
				new TwoWheel("autobike"), new VehicleAdaptor("boat")
		};
		for (Vehicle obj : list) {
			obj.ShowAction();
		}

	}

}
