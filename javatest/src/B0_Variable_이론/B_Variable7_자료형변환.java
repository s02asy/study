package B0_Variable_�̷�;

public class B_Variable7_�ڷ�����ȯ {
	public static void main(String[] args) {

		//[�ڷ�����ȯ] 
		
		
		//�ڹٴ� ����Ÿ�Գ����� ������ �Ҽ��ִ�.
		// ���� + ����
		// �Ǽ� + �Ǽ� 
		
		
		// 1) �ڵ�����ȯ 
		// ���࿡ �Ǽ� + ���� �� �ϸ� ���������� ������ �Ǽ��� ����ȯ�� �Ѵ�.
		// ��) 10 + 3.0 ==> 10.0 + 3.0
		System.out.println("[�ڵ� ����ȯ]");
		System.out.println(10 + 3);
		System.out.println(10 + 3.0);
		
		
		// 2) ��������ȯ (�������� �����Ҷ� �ʿ�)
		// ����ڰ� ���� ����ȯ ��Ű�°�.
		// �ڷ����� �ٸ� �������� ������ �ʿ��Ҷ��� ���� ����ȯ�� �ؾ��Ѵ�.  
		// ����ȯ �ϴ¹� ==> (����ȯŸ��)����;	
		System.out.println("[���� ����ȯ]");
		int a = 10;
		System.out.println(a);
		double b = (double)a ; // ���� ����ȯ 
		System.out.println(b);
		int c = (int) b; // ���� ����ȯ 
		System.out.println(c);
		
		
		// int f = d + e; // ����������.
		int d = 10;
		double e = 143.23;
		int f = d + (int)e; 
		System.out.println(f);
		
     }
}
