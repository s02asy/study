package O0_Ŭ����;


class Ex01{
	int x;
	int y;
}


public class O0_01_Ŭ�����̷�1 {
	/*
	 * # Ŭ����
	 * 1. ����(���赵)
	 * 	1) class	: Ű����
	 * 	2) Ex01		: Ŭ������
	 * 	3) {}		: �ڷ����� ����(�⺻ �ڷ����� ������ ����)
	 * 2. ����
	 * 	1) �ڷ���	 ������  = new �ڷ���();	
	 *  2) Ex01  e    = new Ex01(); 
	 */
public static void main(String[] args) {
				
		Ex01 e = new Ex01();	// Ŭ���� : ����� ���� �ڷ���(�����ڰ� ���� ����)
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);	// �ּҰ����´�. Ŭ������ �ּҺ����̴�. 
		System.out.println(e.x);
		System.out.println(e.y);
		// �Ʒ� �迭�� ������������ ����ϸ�ȴ�. 
		
		//----------------------------------------------------
		int arr[] = new int[3];
		System.out.println(arr);
		
	}



}