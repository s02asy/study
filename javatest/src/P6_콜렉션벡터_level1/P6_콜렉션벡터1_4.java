package P6_�ݷ��Ǻ���_level1;

import java.util.Scanner;
import java.util.Vector;

public class P6_�ݷ��Ǻ���1_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		// [1] Thread.sleep(�и�������)
		// [2] () �ȿ� ���� ����ŭ �Ͻ������ȴ�. 
		// [3] �и��������̱⶧���� 1000 �� 1���̴�. 
		// [4] �̰�Ȱ���ؼ� �������α׷��� ������ִ�. (�ܼ��� �Ұ�)
		
		
		System.out.println("����");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("����");
	}
}