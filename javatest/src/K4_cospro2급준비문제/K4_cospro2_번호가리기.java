package K4_cospro2���غ���;

import java.util.Random;

public class K4_cospro2_��ȣ������ {
	public static void main(String[] args) {
		Random ran = new Random();
		// ����) ���� 10000(�ϸ�) ~ 100000000(�Ͼ�) ������ ���ڸ� �������� �����ϰ� ���
		
		// ����) �ǵ��� 4�ڸ��� ���ڴ� * �� ǥ��
		
		// ��) 10000 ==> 1****
		// ��) 67456445 ==> 6745****
		int r = ran.nextInt(100000001) + 10000;
		int check = r / 10000;
		System.out.println(r);
		System.out.println(check + "****");
	}
}