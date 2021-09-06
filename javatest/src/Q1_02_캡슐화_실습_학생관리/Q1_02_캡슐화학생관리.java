package Q1_02_캡슐화_실습_학생관리;

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
	
	String getId() {
		return studentId;
	}
	
	int getNum() {
		return studentNum;
	}
	
	void setId(String id) {
		studentId = id;
	}
	
	void setNum(int num) {
		studentNum = num;
	}
}

class StudentDAO {
	int num;
	Vector<Student> studentList;
	
	StudentDAO(){
		studentList = new Vector<Student>();
		num = 1000;
	}
	
	int checkId(String id) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return - 1;
	}
	
	void setIdAndNum(Student student) {
		studentList.add(student);
	}
	
	void join(String id) {
		Student student = new Student();
		student.setId(id);
		student.setNum(num);
		num += 1;
		studentList.add(student);
	}
	
	void remove(int index) {
		studentList.remove(index);
	}
}

class Subject {
	private int studentNum;
	private String subject;
	private int score;

	void printSubject() {
		System.out.println("num : " + studentNum + " name : " + subject + " score : " + score);
	}
	
	int getNum() {
		return studentNum;
	}
	
	String getSub() {
		return subject;
	}
	
	void setNum(int num) {
		studentNum = num;
	}
	
	void setSub(String sub) {
		subject = sub;
	}
	
	void setScore(int score) {
		this.score = score;
	}
}

class SubjectDAO {
	Vector<Subject> subjectList;
	Random ran;
	
	SubjectDAO(){
		subjectList = new Vector<Subject>();
		ran = new Random();
	}
	
	void removeSub(int num) {
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getNum() == num) {
				subjectList.remove(i);
				i -= 1;
			}
		}
	}
	
	void setSub(int num , String sub) {
		Subject subject = new Subject();
		subject.setNum(num);
		subject.setSub(sub);
		subject.setScore(ran.nextInt(100) + 1);
		subjectList.add(subject);
	}
	
	void removeSub(int num , String sub) {
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getNum() == num && subjectList.get(i).getSub().equals(sub)) {
				subjectList.remove(i);
				i -= 1;
			}
		}
	}
	
	int indexGetSubEndCheck(int num , String sub) {
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getNum() == num && subjectList.get(i).getSub().equals(sub)) {
				return i;
			}
		}
		return - 1;
	}
	
	void changeSub(int num , int index , String sub) {
		Subject subject = new Subject();
		subject.setNum(num);
		subject.setSub(sub);
		subject.setScore(ran.nextInt(100) + 1);
		subjectList.set(index, subject);
	}
	
}

class StudentCotrller {
	Scanner scan;
	StudentDAO studentDAO;
	SubjectDAO subjectDAO;
	
	StudentCotrller(){
		scan = new Scanner(System.in);
		studentDAO = new StudentDAO();
		subjectDAO = new SubjectDAO();
		run();
		end();
	}
	
	void end() {
		scan.close();
	}
	
	void run() {
		while(true) {
			for(int i = 0; i < studentDAO.studentList.size(); i++) {
				studentDAO.studentList.get(i).printStudent();
			}
			for(int i = 0; i < subjectDAO.subjectList.size(); i++) {
				subjectDAO.subjectList.get(i).printSubject();
			}
			System.out.println("[1]학생추가");
			System.out.println("[2]학생삭제");
			System.out.println("[3]과목추가");
			System.out.println("[4]과목삭제");
			System.out.println("[5]과목수정");
			System.out.println("[0]종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("[학생추가]ID 입력 : ");
				String id = scan.next();
				if(studentDAO.checkId(id) == -1) {
					studentDAO.join(id);
				}else {
					System.out.println("중복된 아이디 입니다.");
				}
			}else if(sel == 2) {
				System.out.println("[학생삭제]ID 입력 : ");
				String id = scan.next();
				if(studentDAO.checkId(id) == -1) {
					System.out.println("없는 아이디 입니다.");
				}else {
					subjectDAO.removeSub(studentDAO.studentList.get(studentDAO.checkId(id)).getNum());
					studentDAO.remove(studentDAO.checkId(id));
				}
			}else if(sel == 3) {
				System.out.println("[과목추가]ID 입력 : ");
				String id = scan.next();
				if(studentDAO.checkId(id) == -1) {
					System.out.println("없는 아이디 입니다.");
				}else {
					System.out.println("[과목추가]과목 명 : ");
					String sub = scan.next();
					subjectDAO.setSub(studentDAO.studentList.get(studentDAO.checkId(id)).getNum(), sub);
				}
			}else if(sel == 4) {
				System.out.println("[과목삭제]ID 입력 : ");
				String id = scan.next();
				if(studentDAO.checkId(id) == -1) {
					System.out.println("없는 아이디 입니다.");
				}else {
					System.out.println("[과목삭제]과목 명 : ");
					String sub = scan.next();
					if(subjectDAO.indexGetSubEndCheck(studentDAO.studentList.get(studentDAO.checkId(id)).getNum() , sub) == -1) {
						System.out.println("과목 명이 없습니다");
					}else {
						subjectDAO.removeSub(studentDAO.studentList.get(studentDAO.checkId(id)).getNum() , sub);
					}
				}
			}else if(sel == 5) {
				System.out.println("[과목수정]ID 입력 : ");
				String id = scan.next();
				if(studentDAO.checkId(id) == -1) {
					System.out.println("없는 아이디 입니다.");
				}else {
					System.out.println("[과목수정]과목 명 : ");
					String sub = scan.next();
					if(subjectDAO.indexGetSubEndCheck(studentDAO.studentList.get(studentDAO.checkId(id)).getNum() , sub) == -1) {
						System.out.println("과목 명이 없습니다");
					}else {
						System.out.println("[과목수정]수정 과목 명 : ");
						String sub2 = scan.next();
						subjectDAO.changeSub(studentDAO.studentList.get(studentDAO.checkId(id)).getNum(), subjectDAO.indexGetSubEndCheck(studentDAO.studentList.get(studentDAO.checkId(id)).getNum() , sub) , sub2);
					}
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}

public class Q1_02_캡슐화학생관리 {
	public static void main(String[] args) {
	    // 학생추가 , 학생삭제(과목도 같이 삭제) , 과목추가 , 과목삭제 , 과목수정
		StudentCotrller a = new StudentCotrller();
	}
}