package L1_�׽�Ʈ_�迭��ȭ_level2;

import java.util.Arrays;

public class L1_�׽�Ʈ_�迭��ȭ2_��ǲ�߰����� {

	public static void main(String[] args) {
		
		int arr[] = {0,0,0};
		int count = 0;
			
		int input[] = {10,20,30,10,30,30,10,20,30,20,30,20,11,30,11,11,10,10};		
		
		//1) arr �迭�� ������3�̴�.		
		//2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		//3) ¦���ε����� ���� "�߰�" �̰�, 
		//4) Ȧ���ε����� ���� "����" �̴�. 
		//   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		//5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		//6) input�� ������ ���� ó���ϰ� ó��������� 
		
		//��)
		// 10 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,0,0};
		// 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		// 30 ==> ¦���ε����̹Ƿ� �߰� ==> arr[] = {10,30,0};
		// 10 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {30,0,0};
		// 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		// 30 ==> Ȧ���ε����̹Ƿ� ���� ==> arr[] = {0,0,0};
		
		for(int i = 0; i < input.length; i++) {
			if(i % 2 == 0) {
				System.out.print(input[i] + " ==> " + "¦���ε����̹Ƿ� �߰� ==> ");
				boolean check = false;
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] == input[i]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					arr[count] = input[i];
					System.out.print("arr[] = " + Arrays.toString(arr));
					count += 1;
				}else {
					System.out.print(input[i] + "�� �̹� ����Ǿ == > �ߺ��˴ϴ�.");
				}
			}
			else if(i % 2 == 1) {
				System.out.print(input[i] + " ==> " + "Ȧ���ε����̹Ƿ� ���� ==> ");
				boolean check = false;
				int arrid = -1;
				for(int j = 0; j < arr.length; j++) {
					if(input[i] == arr[j]) {
						check = true;
						arrid = j;
						break;
					}
				}
				if(check == true) {
					arr[arrid] = 0;
					count -= 1;
					for(int j = arrid; j < arr.length - 1; j++) {
						arr[j] = arr[j + 1];
					}
					arr[count] = 0;
					System.out.print("arr[] = " + Arrays.toString(arr));
				}else {
					System.out.print(input[i] + "�� �����Ƿ� ==> ������ ���� �����ϴ�." );
				}
				
			}
			System.out.println();
		}
	}

}