package K4_cospro2���غ���;

import java.util.Arrays;
import java.util.Random;

public class K4_cospro2_������ȣ {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		// �������� 0~9 �� ���ڸ� �Է¹ް� ���ڸ�ŭ ���ڸ� ������ �о�� ��� 
		
		// 3 ==> {4,5,6,7,8,9,1,2,3};
		// 5 ==> {6,7,8,9,1,2,3,4,5};
		
		int r = ran.nextInt(10);
		System.out.print(r + " ==> ");
		int arrid = 0;
		int num = 1;
		for(int i = r; i < arr.length; i++) {
			arr[arrid] = arr[i];
			arrid += 1;
		}
		for(int i = arrid; i < arr.length; i++) {
			arr[i] = num;
			num += 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}