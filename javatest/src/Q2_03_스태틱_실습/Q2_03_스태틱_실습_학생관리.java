package Q2_03_����ƽ_�ǽ�;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

// �Ʒ� ������ ĸ��ȭ�� �ٲ㺸����.
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
		System.out.println("[�л��߰�]ID�� �Է��ϼ���.");
		String id = scan.next();
		Student student = new Student();
		student.setStudentId(id);
		student.setStudentNum(num);
		studentList.add(student);
		num += 1;
		System.out.println("[�л��߰�]����.");
	}
	
	static void removeSd() {
		System.out.println("[�л�����]ID�� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[�л�����]Num�� �Է��ϼ���.");
		int num = scan.nextInt();
		int index = getIndex(id, num);
		if(index == -1) {
			System.out.println("���� ID�̰ų� Ʋ�� Num�Դϴ�.");
		}else {
			SubjectDAO.removeSubject(studentList.get(index).getStudeuntNum());
			studentList.remove(index);
			System.out.println("[�л�����]����.");
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
		System.out.println("[�����߰�]ID�� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[�����߰�]Num�� �Է��ϼ���.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("���� ID�̰ų� Ʋ�� Num�Դϴ�.");
		}else {
			System.out.println("[�����߰�]������� �Է��ϼ���.");
			String sub = scan.next();
			if(checkSubject(num, sub) == -1) {
				Subject subject = new Subject();
				subject.setStudentNum(num);
				subject.setSubject(sub);
				subject.setScore(ran.nextInt(101));
				subjectList.add(subject);
				System.out.println("[�����߰�]����.");
			}else {
				System.out.println("�̹� �������� �����Դϴ�.");
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
		System.out.println("[�������]ID�� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[�������]Num�� �Է��ϼ���.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("���� ID�̰ų� Ʋ�� Num�Դϴ�.");
		}else {
			System.out.println("[�������]������� �Է����ּ���.");
			String sub = scan.next();
			if(checkSubject(num, sub) != -1) {
				subjectList.remove(checkSubject(num, sub));
				System.out.println("[�������]����.");
			}else {
				System.out.println("���������� ���� �����Դϴ�.");
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
		System.out.println("[�������]ID�� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[�������]Num�� �Է��ϼ���.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("���� ID�̰ų� Ʋ�� Num�Դϴ�.");
		}else {
			System.out.println("[�������]������� �Է��ϼ���.");
			String subject = scan.next();
			if(checkSubject(num,subject) != -1) {
				System.out.println("[�������]�����Ͻ� ������� �Է��ϼ���.");
				String subject2 = scan.next();
				Subject sub = new Subject();
				sub.setStudentNum(num);
				sub.setSubject(subject2);
				sub.setScore(ran.nextInt(101));
				int index2 = checkSubject(num, subject);
				subjectList.set(index2, sub);
				System.out.println("[�������]����.");
			}else {
				System.out.println("�������� ������ �ƴմϴ�.");
			}
		}
	}
	
	static void personalSub() {
		Vector<Subject> sub = new Vector<Subject>();
		System.out.println("[��ȸ]ID�� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("[��ȸ]Num�� �Է��ϼ���.");
		int num = scan.nextInt();
		int index = StudentDAO.getIndex(id, num);
		if(index == -1) {
			System.out.println("���� ID�̰ų� Ʋ�� Num�Դϴ�.");
		}else {
			for(int i = 0; i < subjectList.size(); i++) {
				if(subjectList.get(i).getStudentNum() == num) {
					sub.add(subjectList.get(i));
				}
			}
			System.out.println(id + "�� �������� ���� ���.");
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
			System.out.println("[1]�л��߰� [2]�л����� [3]�����߰� [4]������� [5]������� [6]��ȸ");
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

public class Q2_03_����ƽ_�ǽ�_�л����� {
	public static void main(String[] args) {
		// �л��߰� , �л�����(���� ���� ����) , �����߰� , ������� , �������
		StudentController controller = new StudentController();
	}
}