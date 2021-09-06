package Q2_03_스태틱_실습;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

// 아래 내용을 캡슐화로 바꿔보세요.
class Student {
	private String studentId;
	private int studentNum;
	
	void printStudent() {
		System.out.println("num : " + studentNum + " id : " + studentId);
	}
	
	void setStudentId(String id) {
		studentId = id;
	}
	void setStudentNum(int num) {
		studentNum = num;
	}
	String getStudentId() {
		return studentId;
	}
	int getStudeuntNum() {
		return studentNum;
	}
}

class StudentDAO {
	static Vector<Student> studentList = new Vector<Student>();
	static Scanner scan = new Scanner(System.in);
	static int num = 1000;
	
	static int getIndex(String id, int num) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentId().equals(id) && studentList.get(i).getStudeuntNum() == num) {
				return i;
			}
		}
		return -1;
	}
	
	static void join() {
		System.out.println("[학생추가]ID를 입력하세요.");
		String id = scan.next();
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentNum(num);
		studentList.add(student);
		num += 1;
		System.out.println("[학생추가]성공.");
	}
	
	static void removeSd() {
		System.out.println("[학생삭제]ID를 입력하세요.");
		String id = scan.next();
		System.out.println("[학생삭제]Num을 입력하세요.");
		int num = scan.nextInt();
		int index = getIndex(id, num);
		if(index == -1) {
			System.out.println("없는 ID이거나 틀린 Num입니다.");
		}else {
			SubjectDAO.removeSubject(studentList.get(index).getStudeuntNum());
			studentList.remove(index);
			System.out.println("[학생삭제]성공.");
		}
	}
}

class Subject {
	private int studentNum;
	private String subject;
	private int score;
	
	void printSubject() {
		System.out.println("name : " + subject + " score : " + score);
	}
	
	void setStudentNum(int num) {
		studentNum = num;
	}
	
	void setSubject(String subject) {
		this.subject = subject;
	}
	
	void setScore(int score) {
		this.score = score;
	}
	
	int getStudentNum() {
		return studentNum;
	}
	
	String getSubject() {
		return subject;
	}
	
	int getScore() {
		return score;
	}
}

class SubjectDAO {
	static Random ran = new Random();
	static Scanner scan = new Scanner(System.in);
	static Vector<Subject> subjectList = new Vector<Subject>();
	
	static void addSubject() {
		System.out.println("[과목추가]ID를 입력하세요.");
		String id = scan.next();
		System.out.println("[과목추가]Num을 입력하세요.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("없는 ID이거나 틀린 Num입니다.");
		}else {
			System.out.println("[과목추가]과목명을 입력하세요.");
			String sub = scan.next();
			if(checkSubject(num, sub) == -1) {
				Subject subject = new Subject();
				subject.setStudentNum(num);
				subject.setSubject(sub);
				subject.setScore(ran.nextInt(101));
				subjectList.add(subject);
				System.out.println("[과목추가]성공.");
			}else {
				System.out.println("이미 수강중인 과목입니다.");
			}
		}
	}
	
	static void removeSubject(int num) {
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getStudentNum() == num) {
				subjectList.remove(i);
				i -= 1;
			}
		}
	}
	
	static void removeSubject() {
		System.out.println("[과목삭제]ID를 입력하세요.");
		String id = scan.next();
		System.out.println("[과목삭제]Num을 입력하세요.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("없는 ID이거나 틀린 Num입니다.");
		}else {
			System.out.println("[과목삭제]과목명을 입력해주세요.");
			String sub = scan.next();
			if(checkSubject(num, sub) != -1) {
				subjectList.remove(checkSubject(num, sub));
				System.out.println("[과목삭제]성공.");
			}else {
				System.out.println("수강중이지 않은 과목입니다.");
			}
		}
	}
	
	static int checkSubject(int num ,String subject) {
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getStudentNum() == num && subjectList.get(i).getSubject().equals(subject)) {
				return i;
			}
		}
		return -1;
	}
	
	static void changeSubject() {
		System.out.println("[과목수정]ID를 입력하세요.");
		String id = scan.next();
		System.out.println("[과목수정]Num을 입력하세요.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("없는 ID이거나 틀린 Num입니다.");
		}else {
			System.out.println("[과목수정]과목명을 입력하세요.");
			String subject = scan.next();
			if(checkSubject(num,subject) != -1) {
				System.out.println("[과목수정]수정하실 과목명을 입력하세요.");
				String subject2 = scan.next();
				Subject sub = new Subject();
				sub.setStudentNum(num);
				sub.setSubject(subject2);
				sub.setScore(ran.nextInt(101));
				int index2 = checkSubject(num, subject);
				subjectList.set(index2, sub);
				System.out.println("[과목수정]성공.");
			}else {
				System.out.println("수강중인 과목이 아닙니다.");
			}
		}
	}
	
	static void personalSub() {
		Vector<Subject> sub = new Vector<Subject>();
		System.out.println("[조회]ID를 입력하세요.");
		String id = scan.next();
		System.out.println("[조회]Num을 입력하세요.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("없는 ID이거나 틀린 Num입니다.");
		}else {
			for(int i = 0; i < subjectList.size(); i++) {
				if(subjectList.get(i).getStudentNum() == num) {
					sub.add(subjectList.get(i));
				}
			}
			System.out.println(id + "님 수강중인 과목 목록.");
			for(int i = 0; i < sub.size(); i++) {
				sub.get(i).printSubject();
			}
		}
	}
	
}

class StudentController {
	Scanner scan;
	StudentController(){
		scan = new Scanner(System.in);
		run();
	}
	void run() {
		while(true) {
			for(int i = 0; i < StudentDAO.studentList.size(); i++) {
				StudentDAO.studentList.get(i).printStudent();
			}
			System.out.println("====================================");
			for(int i = 0; i < SubjectDAO.subjectList.size(); i++) {
				SubjectDAO.subjectList.get(i).printSubject();
			}
			System.out.println("[1]학생추가 [2]학생삭제 [3]과목추가 [4]과목삭제 [5]과목수정 [6]조회");
			int sel = scan.nextInt();
			if(sel == 1) {
				StudentDAO.join();
			}else if(sel == 2) {
				StudentDAO.removeSd();
			}else if(sel == 3) {
				SubjectDAO.addSubject();
			}else if(sel == 4) {
				SubjectDAO.removeSubject();
			}else if(sel == 5) {
				SubjectDAO.changeSubject();
			}else if(sel == 6) {
				SubjectDAO.personalSub();
			}
		}
	}
}

public class Q2_03_스태틱_실습_학생관리 {
	public static void main(String[] args) {
		// 학생추가 , 학생삭제(과목도 같이 삭제) , 과목추가 , 과목삭제 , 과목수정
		StudentController controller = new StudentController();
	}
}