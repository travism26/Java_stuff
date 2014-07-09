
public class standard extends room{
	private String standardRoom;
	
	public standard(int floorNumber, int capacity, int numBeds, String standardRoom) {
		super(floorNumber, capacity, numBeds);
		this.standardRoom = standardRoom;
		
	}

	public String getStandardRoom() {
		return standardRoom;
	}

	public void setStandardRoom(String standardRoom) {
		this.standardRoom = standardRoom;
	}

}
