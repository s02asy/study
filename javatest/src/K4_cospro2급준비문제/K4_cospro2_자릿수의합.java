package K4_cospro2���غ���;

import java.util.Random;

public class K4_cospro2_�ڸ������� {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 1~1000 ������ �������ڸ� �����ϰ� �� �ڸ����� ���� ��� 
		
		// ��) 8 ==> 8
		// ��) 28 ==> 2 + 8
		// ��) 999 ==> 9 + 9 + 9
		int division = 1;
		int remainder = 10;
		int r = ran.nextInt(1000) + 1;
		int total = 0;
		int cnt = 0;
		System.out.print(r + " ==> ");
		while(true) {
			if(r / division == 0) {
				division = 1;
				break;
			}
			cnt += 1;
			division *= 10;
		}
		int arrid = cnt - 1;
		int arr[] = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			int sum = r % remainder / division;
			arr[arrid] = sum;
			arrid -= 1;
			remainder *= 10;
			division *= 10;
		}
		for(int i = 0; i < cnt; i++) {
			total += arr[i];
			System.out.print(arr[i]);
			if(i < cnt - 1) {
				System.out.print(" + ");
			}
		}
		System.out.println();
		System.out.println("total : " + total);
	}
}