package Q5_추상화;
class Parent {
	public int a;
}

class Child extends Parent {
	public int b;
}

class Test1{
	int d;
	int arr[] = new int[3];
	int b;
	int c;
}

class Test2{
	int a1;
	int b1;
}

class Test3 extends Test2{
	int a2;
	int a3;
}

public class Q5_02_클래스형변환 {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		
		Test3 t3 = new Test3();
		Test2 t22 = new Test3();
		
		Test3 t33 = (Test3) t22;
		
		
		
		
		
		
		// Override를 쓰는이유
		// 여러 클래스를 한배열에 담기위한 장치
		Parent p1 = new Parent(); // new Parent(); 는  부모만 생성되기때문에 child 에 담을수없다. 
		 Child tempChild = null;
		 Parent tempParent = null;
		 
		// Child c1 = new Parent(); 	 // 이렇게 하면 에러가 발생된다. 	
		// tempChild = (Child)p1; // 이렇게 하면 에러가 발생된다. 
		
		
		
		//new Child(); 는 Parent , Child 둘다 생성되므로  
		//어느 변수에나 담을수 있다.
		Child c2 = new Child();   
		Parent p2 = new Child();  
		
		tempParent = (Parent)c2; //당연히 서로 형변환도 가능하다. 
		tempChild = (Child)p2; //
		
		System.out.println("-----------------------------------");
		
		// instanceof 키워드를 사용하면 좀더 확실히 예외처리 할수있다.
		
		if(p1 instanceof Child) {
			tempChild = (Child)p1;
		}else {
			System.out.println("형변환 불가1");
		}
		
		
		if(p2 instanceof Parent) {
			tempParent = (Parent)p2;
		}else {
			System.out.println("형변환 불가2");
		}
			
				
		if(c2 instanceof Child) {
			tempChild = (Child)c2;
		}else {
			System.out.println("형변환 불가3");
		}
			
	}
}