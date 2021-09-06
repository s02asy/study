package Q4_02_접근제어자실습2;



import Q4_01_접근제어자실습1.Q4_01_접근제어자종류;

// a 는 private 이므로 사용불가
// b 는 public 이므로 어느클래스에서나 사용가능
// c 는 protected 이므로 자식클래스인 Test클래스 내부에서만 사용가능 
// d 는 default 는 패키지가 달라지면 private 이므로 사용불가 
class Test extends Q4_01_접근제어자종류{
	
	public Test(){
		b = 10; // b는 public 이므로 사용가능
		c = 10; // c는 protected 이므로 자식클래스에서는 사용가능하다.
	}
}

public class Q4_02_접근제어자실습 {
	public static void main(String[] args) {
		Test test = new Test();	
		test.b = 10; // b는 public 이므로 사용가능.
		// 여기서는 오직 b만 사용가능하다. 
	}
}