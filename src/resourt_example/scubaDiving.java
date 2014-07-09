import java.util.ArrayList;

public class scubaDiving extends activity {
	private employee instructor;

	public scubaDiving(String name, String dailySchedule,
			ArrayList<String> restrictions, employee instructor) {
		super(name, dailySchedule, restrictions);
		this.instructor = instructor;
	}

	public employee getInstructor() {
		return instructor;
	}

	public void setInstructor(employee instructor) {
		this.instructor = instructor;
	}

}
