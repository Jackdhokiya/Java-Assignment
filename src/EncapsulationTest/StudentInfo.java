package EncapsulationTest;

public class StudentInfo {
	private String stdName; // private field.
    private int stdRollNo;
    private int stdId;
        
	public StudentInfo(String stdName, int stdRollNo, int stdId) {
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdId = stdId;

	}
	public static void main(String[] args) {
		StudentInfo s = new StudentInfo("Janak", 115, 6);
		System.out.println(s.stdName);
		System.out.println(s.stdRollNo);
		System.out.println(s.stdId); 
		
	}
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public int getStdRollNo() {
		return stdRollNo;
	}


	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}


	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
}
