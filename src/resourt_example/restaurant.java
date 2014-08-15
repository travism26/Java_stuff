import java.util.ArrayList;

public class restaurant extends building {

	private String foodSpec;
	private boolean sideBar;

	public restaurant(String name, String address, int numFloors,
			int buildingNum, int capacity, ArrayList<employee> workers,
			String foodSpec, boolean sideBar) {
		super(name, address, numFloors, buildingNum, capacity, workers);
		this.foodSpec = foodSpec;
		this.sideBar = sideBar;
	}

	public String getFoodSpec() {
		return foodSpec;
	}

	public void setFoodSpec(String foodSpec) {
		this.foodSpec = foodSpec;
	}

	public boolean isSideBar() {
		return sideBar;
	}

	public void setSideBar(boolean sideBar) {
		this.sideBar = sideBar;
	}

}
