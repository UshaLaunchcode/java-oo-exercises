
public class Student {
	public Student(String firstName, String lastName, int studentId, int credits, double gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.credits = credits;
		this.gpa = gpa;
	}
	//fields
	String firstName;
	String lastName;
	int studentId;
	int credits;
	double gpa;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getClassStanding(){
		if(credits < 30){
			return "Freshman";
		}
		else if(credits >= 30 || credits < 60){
			return "Sophomore";
		}
		else if(credits >= 60 || credits < 90){
			return "Junior";
		}
		else(credits >= 90){
			return "Senior";
		}
		public submitGrade(int couseGrade, int numCredits){
			int qualityScore = 0;
			qualityScore = qualityScore+ (numCredits * courseGrade);
			
			
		}
		
		
	}

}
