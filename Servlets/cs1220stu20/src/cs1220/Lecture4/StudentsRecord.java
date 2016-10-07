package cs1220.Lecture4;

public class StudentsRecord {
	
	public String fname;
	public String lname;
	public String grade;
	
	public StudentsRecord(String fname, String lname, String grade) {
			this.fname = fname;
			this.lname = lname; 
			this.grade = grade;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}