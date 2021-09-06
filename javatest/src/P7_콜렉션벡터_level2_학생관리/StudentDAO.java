package P7_콜렉션벡터_level2_학생관리;

import java.util.Scanner;
import java.util.Vector;


public class StudentDAO {
	Scanner scan;
	int num;
	Vector<Student> studentList;
	
	void init() {
		scan = new Scanner(System.in);
		num = 1000;
		studentList = new Vector<Student>();
	}

	Student checkId(String id) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).studentId.equals(id)) {
				return studentList.get(i);
			}
		}	
		return null;
	}
	int getNextNum() {
		num += 1;
		return num;
	}

	void addStudent(Student student) {
		
		studentList.add(student);
		System.out.println("추가완료.");
	}
	int getStudentListSize() {
		return studentList.size();
	}
	
	
	void printStudentList(SubjectDAO subjectDAO) {
		int studentCount = getStudentListSize();
		if (studentCount == 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}		
		for (int i = 0; i < studentCount; i++) {					
			Student student = studentList.get(i);
			student.printStudent();
			Vector<Subject> subList = subjectDAO.getOneStudentSubjectList(student.studentNum);
			for(int j = 0; j < subList.size(); j++) {
				subList.get(j).printSubject();
			}
		}
	}
	
	void join() {
		System.out.println("[학생추가] 아이디 입력 : ");
		String id = scan.next();
		Student student = checkId(id);
		if (student == null) {
			student = new Student();
			student.studentNum = getNextNum();
			student.studentId = id;
			addStudent(student);
			System.out.println("회원가입 성공.");
		} else {
			System.out.println("중복아이디입니다. ");
		}
	}
}