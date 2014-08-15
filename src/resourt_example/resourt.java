import java.util.ArrayList;

public class resourt {

	private ArrayList<building> buildings;
	private ArrayList<activity> activities;

	resourt(ArrayList<building> buildings, ArrayList<activity> activities) {
		this.buildings = buildings;
		this.activities = activities;
	}

	public ArrayList<building> getBuildings() {
		return buildings;
	}

	public void setBuildings(ArrayList<building> buildings) {
		this.buildings = buildings;
	}

	public ArrayList<activity> getActivities() {
		return activities;
	}

	public void setActivities(ArrayList<activity> activities) {
		this.activities = activities;
	}

	public static void main(String[] args) {
		people employee_one = new employee("jessica", "Johnson", "Female", 21,
				"Receptionist", null);
		/*
		 * String name, String address, int numFloors, int buildingNum, int
		 * capacity, ArrayList<employee> workers, ArrayList<room> rooms, double
		 * rating
		 */
		building hotel = new hotel("La grand Hotel", "Mexico City", 35, 5, 300,
				null, null, 0);
	}
}
