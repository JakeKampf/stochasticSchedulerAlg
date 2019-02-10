package DataModels;

public class Requirement {
	private String cohort;
	private String course;
	private String sectionsAllowed;
	private int seatsNeeded;
	
	public Requirement(String cohort, String course, String sectionsAllowed, int seatsNeeded) {
		this.cohort = cohort;
		this.course = course;
		this.seatsNeeded = seatsNeeded;
		this.sectionsAllowed = sectionsAllowed;
	}
	
	public String getCohort() {
		return cohort;
	}
	public String getCourse() {
		return course;
	}
	public String getSectionsAllowed() {
		return sectionsAllowed;
	}
	
	public int getSeatsNeeded() {
		return seatsNeeded;
	}
}
