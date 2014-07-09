import java.util.ArrayList;

public class activity {
	private String name;
	private String dailySchedule;
	private ArrayList<String> restrictions = null;

	public activity(String name, String dailySchedule,
			ArrayList<String> restrictions) {
		this.name = name;
		this.dailySchedule = dailySchedule;
		this.restrictions = restrictions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDailySchedule() {
		return dailySchedule;
	}

	public void setDailySchedule(String dailySchedule) {
		this.dailySchedule = dailySchedule;
	}

	public ArrayList<String> getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(ArrayList<String> restrictions) {
		this.restrictions = restrictions;
	}

}
