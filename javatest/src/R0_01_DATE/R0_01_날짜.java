package R0_01_DATE;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class R0_01_��¥ {

	public static void main(String[] args) {
		// System.currentTimeMillis(); 1970��1��1�� ���� ������� �ʷ� ����� * 1000 
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		long time2 = time1 / 1000;
		System.out.println(time2);
		long time3 = time2 / 60;
		System.out.println(time3);
		long time4 = time3 / 60;
		System.out.println(time4);
		// ���� ��ǻ�� �ý����� ��¥�� �ð��� ���´�.
		Date date = new Date();
		// Fri Mar 06 12:45:17 KST 2020
		System.out.println(date);
		String temp = String.valueOf(date);
		System.out.println(temp);
		String tokens[] = date.toString().split(" ");
		System.out.println(Arrays.toString(tokens));
		/*
		 * 	[1] ��¥ �� �ð� ��� ���� ���� ���
		 *  	. ��¥ �� �ð� ���Ŀ� ���Ǵ� �����ڸ� ������ ������ ���ڴ� �Է��ϴ� �״�� ��µȴ�.
		 *  	. Date date = new Date();
		 *  	. SimpleDateFormat sdf = new SimpleDateFormat("��¥ �� �ð� ����");
		 *  [2] ��¥ �� �ð� ���� ���� ���
		 *  	. sdf.format(date);
		 *  [3] ��¥ �� ���� ��� ���� ������ ����
		 *  	. ���ۿ��� "simpledateformat ��¥ ����" ��� �˻��ϱ�
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		/*
		 * System.currentTimeMillis()
		 * . 1970�� 1�� 1�� ���� ���� �� �޼ҵ尡 ����Ǵ� �������� ������ �ð��� �и���(1/1000��) ������ ���´�.
		 * . 13�ڸ��� ���ڸ� ������ ������ int�� ó���ϸ� ������ �߻��ǹǷ� long�� ó���ؾ� �Ѵ�.
		 */

		// int time = System.currentTimeMillis();		// ���� �߻�
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf2.format(time));
		
		Date a = new Date();
		SimpleDateFormat b = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a HH�� mm�� ss��");
		System.out.println(b.format(a));
		
	}

}