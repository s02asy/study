package Q1_01_ĸ��ȭ;

class Student1 {
	private String name;
	private int age;
	
	Student1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}	
}

class Student2{
	String name;
	int age;
}


public class Q1_02_ĸ��ȭ2 {
	public static void main(String[] args) {
				
		Student1 hgd = new Student1("ȫ�浿", 11);

		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		hgd.setName("�̸���");
		hgd.setAge(20);
				
		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		// hgd.name = "aaa"; ���������� �Ұ��ϴ�.
		
		// �Ʒ��� �ξ� ���ѵ� �� ���� ���� ����ұ�? ������ ���� 
		Student2 s2 = new Student2();
		s2.name = "�̿���";
		s2.age = 10;
		
		
		
	}
}