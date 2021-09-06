package R0_02_SINGLETON;

import java.util.Scanner;
import java.util.Vector;

public class SubjectDAO {
	private SubjectDAO() {}	
	static private SubjectDAO instance = new SubjectDAO();
	static public SubjectDAO getInstance() {
		return instance;
	}
	
	
	private Vector<Subject> subjectList;
	private Scanner scan;
	
	public void init() {
		scan = new Scanner(System.in);
		subjectList = new Vector<Subject>();
	}

	
	public Vector<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Vector<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	
	public boolean checkSubject(int studentNum, String subject) {
		for(int i = 0; i< subjectList.size(); i++) {
			Subject  sub = subjectList.get(i);
			
			if(sub.getStudentNum() == studentNum && sub.getSubject().equals(subject)) {
				return true;
			}
		}
		
		
		return false;
	}

	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	public Vector<Subject> getOneStudentSubjectList(int studentNum) {
		Vector<Subject> oneStudentSubjectList = new Vector<Subject>();
		
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getStudentNum() == studentNum) {
				oneStudentSubjectList.add(subjectList.get(i));				
			}
		}
		
		return oneStudentSubjectList;
			
	}

	public void printSubjectList(Subject[] subjectList) {
		for (int i = 0; i < subjectList.length; i++) {
			subjectList[i].printSubject();
		}
	}
	
	public void insertSubject() {
		System.out.println("[�����߰�] �л� ���̵� �Է� : ");
		String id = scan.next();
		Student student = StudentDAO.getInstance().checkId(id);
		if (student == null) {
			System.out.println("ã�� �л��� �����ϴ�. ");
		} else {
			System.out.println("[�����߰�] ���� �̸� �Է� : ");
			String subjectName = scan.next();
			boolean check = checkSubject(student.getStudentNum(), subjectName);
			if (check == true) {
				System.out.println("[�޼���] �ߺ� �����Դϴ�.");
			} else {						
				System.out.println("[�����߰�] ���� �Է� : ");
				int score = scan.nextInt();
				Subject subject = new Subject();
				subject.setScore(score);
				subject.setStudentNum(student.getStudentNum());
				subject.setSubject(subjectName);
				addSubject(subject);
				System.out.println("�����߰� ����.");
			}
		}
	}
	
	public void remove() {
		System.out.println("[�������] �л� ���̵� �Է� : ");
		String id = scan.next();
		Student student = StudentDAO.getInstance().checkId(id);
		if(student == null) {
			System.out.println("ã�� �л��� �����ϴ�.");
		}else {
			System.out.println("[�������] ���� ���� �Է� : ");
			String sub = scan.next();
			int num = StudentDAO.getInstance().getNum(id);
			boolean check = checkSubject(num, sub);
			if(check == true) {
				for(int i = 0; i < subjectList.size(); i++) {
					if(subjectList.get(i).getStudentNum() == num && subjectList.get(i).getSubject().equals(sub)) {
						subjectList.remove(i);
					}
				}
				System.out.println("������� ����.");
			}else {
				System.out.println("ã�� ������ �����ϴ�.");
			}
		}
	}
	
	public void remove(int num) {
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getStudentNum() == num) {
				subjectList.remove(i);
				i -= 1;
			}
		}
	}
}