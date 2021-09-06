package O5_메서드리턴_level2;
class Student{
	int hakbun;
	int score;
	void print() {
		System.out.println(hakbun + " " + score);
	}
}
class StudentManager1{	
	// 2) 리턴사용
	Student setStudentValue(int x , int y) {
		Student st = new Student();
		st.hakbun = x;
		st.score = y;
		return st;
	}
}
class StudentManager2{
	// 2) 리턴사용x
	Student student;	
	void setStudentValue( int x, int  y) { 
		student = new Student();
		student.hakbun = x;
		student.score = y;
	}
}
public class O5_매서드리턴_5 {
	public static void main(String[] args) {
		// 리턴은 클래스 참조 변수도 가능하다.
		
		StudentManager1 mng1 = new StudentManager1();
		Student st1 = mng1.setStudentValue(10001, 30);
		st1.print();
		System.out.println("----------------------------");
		
		StudentManager2 mng2 = new StudentManager2();
		mng2.setStudentValue(10001, 30);
		Student st2 = mng2.student;
		st2.print();
		
		
		
	}
}