package Q2_00_����ƽ;


class Test01 {
	int a;
	static int b;
}

public class Q2_01_����ƽ1 {
public static void main(String[] args) {
		
		// static Ű���� 
		// ��������
		// static ��  �������ڸ��� �ٷ� �޸𸮿� �����̵Ǽ� 
	    // new �� �����ʾƵ� ����Ҽ��ִ�.
	
		// static���� ������ ������ �����ϴ¹�
        // Ŭ������.������  ==> Test01.b
	
		Test01.b = 10;
		System.out.println(Test01.b);
		System.out.println("-------------------------------------");
		// static���� ������ ������ new �� �Ҷ� ���� ���������ʴ´�. 
		
		Test01 t1 = new Test01();
		t1.a = 20;
		System.out.println(t1.a);
		System.out.println(t1.b); // ������������´�. Test01.b �� ����.
		System.out.println("-------------------------------------");
		Test01 t2 = new Test01();
		t2.a = 30;
		System.out.println(t2.a);
		System.out.println(t2.b); // ���� ����.
			
	}
}