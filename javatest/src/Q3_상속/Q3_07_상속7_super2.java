package Q3_상속;
// [super]
// -상속받은 자식클래스에서 부모의 자원을 사용할때 사용함.
class Test07{	
	int num;
	String name;
	Test07(int num, String name){
		this.num = num;
		this.name = name;
	}
}
class Test07Child extends Test07{
	int score;	
	Test07Child(int num , String name , int score){
		super(num , name); // 부모의 생성자호출하는법 ()만붙여주면된다.
		this.score = score;
	}
}
public class Q3_07_상속7_super2 {
	public static void main(String[] args) {
		Test07Child t7 = new Test07Child(1001, "이만수" , 23);
		
	}
}