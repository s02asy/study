package D0_if_�̷�;

import java.util.Random;

/*
	package D0_if_�̷�;	
	public class D_if4_���� {
        public static void main(String[] args){
        }
	}	
 */
public class D_if4_���� {
	public static void main(String[] args) {
		/*
		 * # ����
		 *  1) import java.util.Random; �߰�
		 *  2) Random ran = new Random(); �߰� 
		 *  3) ���� main �żҵ�ȿ���  int r = ran.netInt(��������); 
		 *  4) ( 0 ~ ��������-1 )  ���̰��� ���´�. 
		 */		
		Random ran = new Random();
		// ��) 0 ~ 2 ������ ����
		int rNum = ran.nextInt(3);
		System.out.println(rNum);

		// ���� 1) 1 ~ 5 ������ ����
		rNum = ran.nextInt(5) + 1; // [0 ~ 4] + 1
		System.out.println(rNum);

		// ���� 2) -3 ~ 3 ������ ����
		rNum = ran.nextInt(7) - 3; // [0 ~ 6] - 3
		System.out.println(rNum);	
	}
}
