package P7_콜렉션벡터_level2_학생관리;

import java.util.Scanner;
import java.util.Vector;


public class SubjectDAO {
	Scanner scan;
	Vector<Subject> subjectList;
	
	void init() {
		scan = new Scanner(System.in);
		subjectList = new Vector<Subject>();
	}

	boolean checkSubject(int studentNum, String subject) {
		for(int i = 0; i< subjectList.size(); i++) {
			Subject  sub = subjectList.get(i);
			
			if(sub.studentNum == studentNum && sub.subject.equals(subject)) {
				return true;
			}
		}
		
		
		return false;
	}

	void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	Vector<Subject> getOneStudentSubjectList(int studentNum) {
		Vector<Subject> oneStudentSubjectList = new Vector<Subject>();
		
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).studentNum == studentNum) {
				oneStudentSubjectList.add(subjectList.get(i));				
			}
		}
		
		return oneStudentSubjectList;
			
	}

	void printSubjectList(Subject[] subjectList) {
		for (int i = 0; i < subjectList.length; i++) {
			subjectList[i].printSubject();
		}
	}
	void insertSubject(StudentDAO studentDAO) {
		System.out.println("[과목추가] 학생 아이디 입력 : ");
		String id = scan.next();
		Student student = studentDAO.checkId(id);
		if (student == null) {
			System.out.println("찾는 학생이 없습니다. ");
		} else {
			System.out.println("[과목추가] 과목 이름 입력 : ");
			String subjectName = scan.next();
			boolean check = checkSubject(student.studentNum, subjectName);
			if (check == true) {
				System.out.println("[메세지] 중복 과목입니다.");
			} else {						
				System.out.println("[점수추가] 점수 입력 : ");
				int score = scan.nextInt();
				Subject subject = new Subject();
				subject.score = score;
				subject.studentNum = student.studentNum;
				subject.subject = subjectName;
				addSubject(subject);
				System.out.println("과목추가 성공.");
			}
		}

	}
	
}