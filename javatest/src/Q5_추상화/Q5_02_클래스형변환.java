package Q5_�߻�ȭ;
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

public class Q5_02_Ŭ��������ȯ {
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		
		Test3 t3 = new Test3();
		Test2 t22 = new Test3();
		
		Test3 t33 = (Test3) t22;
		
		
		
		
		
		
		// Override�� ��������
		// ���� Ŭ������ �ѹ迭�� ������� ��ġ
		Parent p1 = new Parent(); // new Parent(); ��  �θ� �����Ǳ⶧���� child �� ����������. 
		 Child tempChild = null;
		 Parent tempParent = null;
		 
		// Child c1 = new Parent(); 	 // �̷��� �ϸ� ������ �߻��ȴ�. 	
		// tempChild = (Child)p1; // �̷��� �ϸ� ������ �߻��ȴ�. 
		
		
		
		//new Child(); �� Parent , Child �Ѵ� �����ǹǷ�  
		//��� �������� ������ �ִ�.
		Child c2 = new Child();   
		Parent p2 = new Child();  
		
		tempParent = (Parent)c2; //�翬�� ���� ����ȯ�� �����ϴ�. 
		tempChild = (Child)p2; //
		
		System.out.println("-----------------------------------");
		
		// instanceof Ű���带 ����ϸ� ���� Ȯ���� ����ó�� �Ҽ��ִ�.
		
		if(p1 instanceof Child) {
			tempChild = (Child)p1;
		}else {
			System.out.println("����ȯ �Ұ�1");
		}
		
		
		if(p2 instanceof Parent) {
			tempParent = (Parent)p2;
		}else {
			System.out.println("����ȯ �Ұ�2");
		}
			
				
		if(c2 instanceof Child) {
			tempChild = (Child)c2;
		}else {
			System.out.println("����ȯ �Ұ�3");
		}
			
	}
}