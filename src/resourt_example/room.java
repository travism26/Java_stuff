public class room {
	private static final int roomNumber = 100;
	private int floorNumber;
	private int capacity;
	private int numBeds;

	public room(int floorNumber, int capacity, int numBeds) {
		this.floorNumber = floorNumber;
		this.capacity = capacity;
		this.numBeds = numBeds;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	public static int getRoomnumber() {
		return roomNumber;
	}
}
