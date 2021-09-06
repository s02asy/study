package Q1_01_캡슐화;

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


public class Q1_02_캡슐화2 {
	public static void main(String[] args) {
				
		Student1 hgd = new Student1("홍길동", 11);

		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		hgd.setName("이만수");
		hgd.setAge(20);
				
		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		// hgd.name = "aaa"; 직접접근을 불가하다.
		
		// 아래가 훨씬 편한데 왜 위와 같이 사용할까? 다음에 설명 
		Student2 s2 = new Student2();
		s2.name = "이영희";
		s2.age = 10;
		
		
		
	}
}