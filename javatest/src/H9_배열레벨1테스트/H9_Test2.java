package H9_�迭����1�׽�Ʈ;

import java.util.Random;

public class H9_Test2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int page = 20;
		int arr[] = {3,2,5,3,1};
		
		// �����۸� �Ǿտ������� �ڷ� ���������� �����ٷ��� �Ѵ�. 
		
		// �迭�� ������ ���� �������� �ʿ��� �����̴�.
		
		// �������� �ε������� �Է¹ް� ���� page�� ��� 
		
		// ��) 4 ==> ������ �ٵ������Ƿ� ==> 20 - (3+2+5+3+1)
		
		// ��) 0 ==> 20 - 3 
		
		// ��) 1 ==> 20 - (3+2)
		int r_index = ran.nextInt(5);
		System.out.println(r_index);
		for(int i = 0; i <= r_index; i++) {
			page -= arr[i];
		}
		System.out.println("���� ������ �� : " + page);
	}
}