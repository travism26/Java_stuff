import java.util.ArrayList;

public class hotel extends building {

	private ArrayList<room> rooms;
	private double rating;

	public hotel(String name, String address, int numFloors, int buildingNum,
			int capacity, ArrayList<employee> workers, ArrayList<room> rooms,
			double rating) {
		super(name, address, numFloors, buildingNum, capacity, workers);
		this.rooms = rooms;
		this.rating = rating;
	}

	public ArrayList<room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<room> rooms) {
		this.rooms = rooms;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
