package _01_�迭1;
import java.util.Arrays;
import java.util.Random;
public class _01_04_�迭����_���� {
	public static void main(String[] args) {	
		int arr[] = {11,12,13,14,15};
		int count = 5;
		int random = 0;
		/*
		 * 0) arr�迭�� ���� 5���� ����Ǿ��ִ�. (11,12,13,14,15)  
		 * 		- count ������ ���� ���� �迭�� ����Ȱ��� ������ ǥ���Ѵ�.
		 * 1) random ������ 5~15������ ���ڸ� �������� �����Ѵ�.
		 * 2) random ������ ���� arr�迭�ǰ���� ���ؼ� ���� �������� ������ �װ��� �����Ѵ�.
		 *  	- �����ϴ¹���� �װ��� ���� ������ ������ ��ĭ�� ��������� ���������� 0 ���� �����Ѵ�. 
		 *  	
		 * 3) random ������ ���� arr�迭�ǰ���� ���ؼ� ���� �������� ������ "�����Ұ��� �����ϴ�" ��� 
		 * 
		 * 		- ��) 7 ==> "�����Ұ��� �����ϴ�"
		 * 		- ��) 13 ==> arr = {11,12,14,15,0}
		 * 
		 */
		Random ran = new Random();
		random = ran.nextInt(11) + 5;
		int index = 0;
		System.out.println("random : " + random);
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				check = true;
				index = i;
				break;
			}
		}
		if(check == true) {
			
			for(int i = index; i < arr.length-1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length-1] = 0;
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println(Arrays.toString(arr));
			System.out.println("�����Ұ��� �����ϴ�.");
		}
	}
}