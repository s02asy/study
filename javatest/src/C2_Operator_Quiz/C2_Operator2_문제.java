package C2_Operator_Quiz;

public class C2_Operator2_���� {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		// �Ʒ� ���� ���� True �� �������� ���� �����غ�����.
		
		System.out.println(a * d == c + b &&  a > b);
		a = 5;
	    b = 1;
	    c = 9;
	    d = 1;
		System.out.println(a / d + 3 == c - b &&  a > b);
		a = 7;
		b = 4;
		c = 4;
		d = 7;
		System.out.println(a % d == c % b &&  a > b);
		 a = 10;
		 b = 8;
		 c = 30;
		 d = 4;
		System.out.println((a - d) * 3 == c / 3 + b &&  a > b);
	}
}
