package P7_콜렉션벡터_level2_학생관리;

import java.util.Scanner;
import java.util.Vector;



public class Controller {
	Scanner scan;
	StudentDAO studentDAO;
	SubjectDAO subjectDAO;

	void init() {
		scan = new Scanner(System.in);
		studentDAO = new StudentDAO();
		subjectDAO = new SubjectDAO();
		studentDAO.init();
		subjectDAO.init();
	}

	void play() {
		while (true) {
			System.out.println("1)학생추가");
			System.out.println("2)학생삭제"); 
			System.out.println("3)과목추가");
			System.out.println("4)과목삭제");
			System.out.println("5)전체출력");
			System.out.println("8)저장");
			System.out.println("9)로드");
			System.out.println("0)종료");
			int sel = scan.nextInt();
			if (sel == 0) {
				System.out.println("[종료]");
				break;
			} else if (sel == 1) {				
				studentDAO.join();						
			} else if (sel == 3) {
				subjectDAO.insertSubject(studentDAO);
			} else if (sel == 5) {
				studentDAO.printStudentList(subjectDAO);
			}
		}
	}
}