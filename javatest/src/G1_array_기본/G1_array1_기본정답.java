package G1_array_�⺻;

public class G1_array1_�⺻���� {

	public static void main(String[] args) {

		int[] arr = new int[5];
		
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		System.out.println(">>>����1");
		for(int i=0; i<5; i++) {
			arr[i] = 10 * (i+1);
		}
				
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		// ����2) ��ü �� ���
		// ����2) 150
		System.out.println(">>>����2");			
		int total = 0;
		for(int i=0; i<5; i++) {
			total += arr[i];
		}
		System.out.println("��ü �� : " + total);

	}

}