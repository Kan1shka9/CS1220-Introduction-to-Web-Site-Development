package pMidTerm;

public class taskDescriptor {
	public String fname;
	public String lname;
	public String taskTitle;
	
	public taskDescriptor(String fname, String lname, String taskTitle) {
		this.fname = fname;
		this.lname = lname; 
		this.taskTitle = taskTitle;
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

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
}