package D0_if_�̷�;
/*
 * 
 * # ���ǹ� if
 * 
 * 1) if ==> Ű����
 * 2) (���ǽ�) ==> ������ ����̸� ��� ����
 * 3) {���}  ==> ��� ���� 
 * 
 * if(���ǽ�){
 * 		���ǽ��� ��(true)�� �� ������ ����;
 * }
 * 
 */

public class D_if1_���ǹ� {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("���� O");
		}
		
		if(a != b) {
			System.out.println("���� X");  // �̺κ��� ������ �ȵȴ�. 
		}		
		// ��) Ȧ¦
		int num = 8;	
		if(num % 2 == 0) {
			System.out.println("¦��");
		}
		if(num % 2 == 1) {
			System.out.println("Ȧ��");  // �̺κ��� ������ �ȵȴ�. 
		}
		
	}
}
