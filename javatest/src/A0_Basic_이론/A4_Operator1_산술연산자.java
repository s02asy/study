package A0_Basic_�̷�;
/*
 * # ������(operator)
 * 1. ��� ������
 * 1) ���ϱ�			+
 * 2) ����			-
 * 3) ���ϱ�			*
 * 4) ������			/
 * 5) ������			%
 */	
public class A4_Operator1_��������� {
	public static void main(String[] args) {
		System.out.println("[���������] +  -  *  /  %  ");
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);   // ���� / ���� = ����  (�Ҽ����� �������. ���̵�.)
		System.out.println(10 % 3);   // ������
		System.out.println(10 / 3.0); // �Ǽ� / ���� = �Ǽ�  (�Ҽ����� ����.)		
		
		
/*
     ���� ) ���ϱ�� �������  ���ϱ� ���� ���� �켱������ ����. 
 	        �׷���  ���ϱ⳪ ���⸦ ���ϱ� �� ������ ���� ���� �ϰ������ 
 	    () �Ұ�ȣ �� �̿��ؾ� �Ѵ�. 	 	 
 	 
		 10 + 3 * 3    	==> 19
		(10 + 3) * 3 	==> 39
		
		[����] ==> ������ ���̿��� �켱������ �ִ�.
		1) ()
		2) * / %
		3) + -
 */
		System.out.println("[�����ڿ켱����]");
		System.out.println( 10 + 3  * 3);
		System.out.println( (10 + 3)  * 3);
		
		
	}
}
