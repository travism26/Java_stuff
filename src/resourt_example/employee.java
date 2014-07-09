import java.util.ArrayList;

public class employee extends people {

	private String position;
	private ArrayList<String> skills = null;

	public employee(String firstName, String lastName, String gender, int age,
			String position, ArrayList<String> skills) {
		super(firstName, lastName, gender, age);
		this.position = position;
		this.skills = skills;

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public void addSkill(String skill) {
		this.skills.add(skill);
	}

}
