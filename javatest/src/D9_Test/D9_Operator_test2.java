package D9_Test;

public class D9_Operator_test2 {
	public static void main(String[] args) {
		
		// ���� 1) ����
		// 3������ ����� 60�� �̻��̸�, true
		// ��, ��� �� �����̶� 50�� �̸��̸�, false
		int kor = 100;
		int eng = 87;
		int math = 41;
		int avg = kor + eng + math / 3;
		System.out.println(avg >= 60 && kor >= 50 && eng >= 50 && math >= 50);
		
		// ���� 2) ��� 100���̰ų� ������ 100���̸� ���л�(True) ���. 
		int ���� = 100;
		int ���� = 99;
		System.out.println(���� == 100 || ���� == 100);
		
		//���� 3)  ���ΰ� 4�̰� ���ΰ� 6�� �ﰢ�� ���̰� ¦���̸鼭 4�� ����̸� True ���.
		int ���� = 4;
		int ���� = 6;
		int ���� = ���� * ���� / 2;
		System.out.println(���� % 2 == 0 && ���� % 4 ==0);
					
		//���� 4) �۳� ������ 970 ���̴� ���ش� 11 ���� �λ��� �Ǿ���. 
		//      ���� �츮 ȸ�� ��� ������ 91 ���̴�. 
		//  	������  �������� ������ �츮ȸ�� ��� �������� ũ�� True ��� 
		int �۳⿬�� = 970;
		double ���ؿ��� = �۳⿬�� * 1.1; 
		int ��տ��� = 91;
		int ��տ��� = 91*12;
		
		System.out.println(���ؿ��� > ��տ���);
	}
}
