package R0_02_SINGLETON;

public class Student {
	private String studentId;
	private int studentNum;
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public void printStudent() {
		System.out.println("num : " + studentNum + " id : " + studentId);
	}
}