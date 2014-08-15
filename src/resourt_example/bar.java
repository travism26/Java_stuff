import java.util.ArrayList;

public class bar extends building {
	/*
	 * #dance floors isBand playing?
	 */
	private int numDanceFloors;
	private boolean bandPlaying;

	public bar(String name, String address, int numFloors, int buildingNum,
			int capacity, ArrayList<employee> workers, int numDanceFloors,
			boolean bandPlaying) {
		super(name, address, numFloors, buildingNum, capacity, workers);
		this.numDanceFloors = numDanceFloors;
		this.bandPlaying = bandPlaying;
	}

	public int getNumDanceFloors() {
		return numDanceFloors;
	}

	public void setNumDanceFloors(int numDanceFloors) {
		this.numDanceFloors = numDanceFloors;
	}

	public boolean isBandPlaying() {
		return bandPlaying;
	}

	public void setBandPlaying(boolean bandPlaying) {
		this.bandPlaying = bandPlaying;
	}

}
