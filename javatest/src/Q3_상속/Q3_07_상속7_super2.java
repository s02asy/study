package Q3_���;
// [super]
// -��ӹ��� �ڽ�Ŭ�������� �θ��� �ڿ��� ����Ҷ� �����.
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
		super(num , name); // �θ��� ������ȣ���ϴ¹� ()���ٿ��ָ�ȴ�.
		this.score = score;
	}
}
public class Q3_07_���7_super2 {
	public static void main(String[] args) {
		Test07Child t7 = new Test07Child(1001, "�̸���" , 23);
		
	}
}