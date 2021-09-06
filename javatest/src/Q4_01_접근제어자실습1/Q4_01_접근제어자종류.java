package Q4_01_접근제어자실습1;
// 1) 프로젝트는 원래 main이 한개만 있어야한다.
// 2) 한파일에는 클래스가 한개만 있어야한다.
// 3) 클래스명은 보통 대문자로 시작한다.
// 4) 메서드명은 보통 소문자로 시작한다.
// 5) 클래스, 메서드명은 이제 영어로 쓴다.
// 6) 다른 패키지의 클래스도 사용가능하다. (조건 : import)
// 접근제어자 종류
// 1) private : 내부 클래스에서만 사용가능 , 타클래스에서 사용불가 
// 2) public  : 모든 클래스에서 사용가능 
// 3) protected : 패키지가같으면 public 
//				  패키지가 다르면 자식클래스에서는  public 
//				  자식클래스가  아니면 private 

// 4) default : 패키지가 같으면 public , 패키지가 다르면 private 
//      [주의] : default 는 사용하지않는것이 좋다.

public class Q4_01_접근제어자종류 {
	private int a;
	public int b;
	protected int c;
	int d; // default 는 사용하지않는게 좋다.
}