package O3_�ż���_level1;

class Test2 {
	int total;
	int cnt;
	void printSum(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.total += arr[i];
		}
		System.out.println(this.total);
	}
	void printSumMultiple4(int[] arr) {
		this.total = 0;
		System.out.print("4�� ��� : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				this.total += arr[i];
				this.cnt += 1;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	void printCountMultiple4(int[] arr) {
		this.cnt = 0;
		System.out.print("arr�� ¦�� : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				this.cnt += 1;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}

public class O3_�޼���1_02_��������2 {
	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		Test2 t2 = new Test2();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		t2.printSum(arr);
		
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		t2.printSumMultiple4(arr);
		System.out.println("4�� ����� �� : " + t2.total);
		
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		System.out.println("4�� ����� ���� : " + t2.cnt);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		t2.printCountMultiple4(arr);
		System.out.println("¦���� ���� : " + t2.cnt);
	}
}