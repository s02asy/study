package R0_02_SINGLETON;

import java.util.Scanner;
import java.util.Vector;

public class Cotroller {
	public Scanner scan;
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;
	private Save save;
	private Load load;
	public void init() {
		scan = new Scanner(System.in);		
		studentDAO = StudentDAO.getInstance();
		subjectDAO = SubjectDAO.getInstance();
		save = Save.getSave();
		load = Load.getLoad();
		studentDAO.init();
		subjectDAO.init();
		play();
		
	}

	public void play() {
		while (true) {
			System.out.println("1)학생추가");
			System.out.println("2)학생삭제"); 
			System.out.println("3)과목추가");
			System.out.println("4)과목삭제");
			System.out.println("5)전체출력");
			System.out.println("6)저장");
			System.out.println("7)로드");
			System.out.println("0)종료");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				studentDAO.join();
			}else if(sel == 2) {
				studentDAO.remove();
			}else if(sel == 3) {
				subjectDAO.insertSubject();
			}else if(sel == 4) {
				subjectDAO.remove();
			}else if(sel == 5) {
				studentDAO.printStudentList();
			}else if(sel == 6) {
				save.run();
			}else if(sel == 7) {
				load.run();
			}else if(sel == 0) {
				break;
			}
		}
	}
}