public class suite extends room {

	private int numPools;
	private String barSize;

	public suite(int floorNumber, int capacity, int numBeds, int numPools,
			String barSize) {
		super(floorNumber, capacity, numBeds);
		this.numPools = numPools;
		this.barSize = barSize;
	}

	public int getNumPools() {
		return numPools;
	}

	public void setNumPools(int numPools) {
		this.numPools = numPools;
	}

	public String getBarSize() {
		return barSize;
	}

	public void setBarSize(String barSize) {
		this.barSize = barSize;
	}

}
