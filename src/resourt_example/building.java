import java.util.ArrayList;

public class building {
	private String name;
	private String address;
	private int numFloors;
	private int buildingNum;
	private int capacity;
	private ArrayList<employee> workers;

	public building(String name, String address, int numFloors,
			int buildingNum, int capacity, ArrayList<employee> workers) {
		this.name = name;
		this.address = address;
		this.numFloors = numFloors;
		this.buildingNum = buildingNum;
		this.capacity = capacity;
		this.workers = workers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public int getBuildingNum() {
		return buildingNum;
	}

	public void setBuildingNum(int buildingNum) {
		this.buildingNum = buildingNum;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
