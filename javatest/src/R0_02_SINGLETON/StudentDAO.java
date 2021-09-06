package R0_02_SINGLETON;

import java.util.Scanner;
import java.util.Vector;

public class StudentDAO {
	private StudentDAO() {}	
	static private StudentDAO instance = new StudentDAO();
	static public StudentDAO getInstance() {
		return instance;
	}
	
	public Scanner scan;
	private int num;
	private Vector<Student> studentList;
	

	public void init() {
		scan = new Scanner(System.in);
		num = 1000;
		studentList = new Vector<Student>();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Vector<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Vector<Student> studentList) {
		this.studentList = studentList;
	}
	
	public Student checkId(String id) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentId().equals(id)) {
				return studentList.get(i);
			}
		}	
		return null;
	}
	public int getNextNum() {
		num += 1;
		return num;
	}

	public void addStudent(Student student) {		
		studentList.add(student);
		System.out.println("�߰��Ϸ�.");
	}
	public int getStudentListSize() {
		return studentList.size();
	}
	
	public void printStudentList() {
		int studentCount = getStudentListSize();
		if (studentCount == 0) {
			System.out.println("��ϵ� �л��� �����ϴ�.");
			return;
		}		
		Vector<Student> studentList = getStudentList();				
		for (int i = 0; i < studentCount; i++) {					
			Student student = studentList.get(i);
			student.printStudent();
			Vector<Subject> subList = SubjectDAO.getInstance().getOneStudentSubjectList(student.getStudentNum());
			for(int j = 0; j < subList.size(); j++) {
				subList.get(j).printSubject();
			}
		}
	}
	
	public void join() {
		System.out.println("[�л��߰�] ���̵� �Է� : ");
		String id = scan.next();
		Student student = checkId(id);
		if (student == null) {
			student = new Student();
			student.setStudentNum(getNextNum());
			student.setStudentId(id);
			addStudent(student);
			printStudentList();
			System.out.println("ȸ������ ����.");

		} else {
			System.out.println("�ߺ����̵��Դϴ�. ");
		}
	}
	
	public int getNum(String id) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentId().equals(id)) {
				return studentList.get(i).getStudentNum();
			}
		}
		return -1;
	}
	public void remove() {
		System.out.println("[�л�����] ���̵� �Է� : ");
		String id = scan.next();
		Student student = checkId(id);
		if(student != null) {
			SubjectDAO.getInstance().remove(getNum(id));
			for(int i = 0; i < studentList.size(); i++) {
				if(studentList.get(i).getStudentId().equals(id)) {
					studentList.remove(i);
				}
			}
			System.out.println("�л����� ����.");
		}else {
			System.out.println("���������ʴ� ���̵��Դϴ�.");
		}
	}
}