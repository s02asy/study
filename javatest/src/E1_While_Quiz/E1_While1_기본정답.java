package E1_While_Quiz;

public class E1_While1_�⺻���� {

	public static void main(String[] args) {
		//���� 1) 1~10���� ���
		//����) 1,2,3,4,5,6,7,8,9,10
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 1; // i++
		}
		System.out.println();
		System.out.println();
		//����2) 5~-4���� �Ųٷ� ���
		//����) 5,4,3,2,1,0,-1,-2,-3,-4
		int a = 5;
		while(a >= -4) {
			System.out.print(a + " ");
			a -= 1; // i--
		}
		System.out.println();
		System.out.println("---------------------------");
		//����3) 1~10���� �ݺ��� 5~9��� (if�����)
		//����) 5,6,7,8,9
		int b = 1;
		while(b <= 10) {
			if(b >= 5 && b <= 9) {
				System.out.print(b + " ");
			}
			b++;
		}
		System.out.println();
		System.out.println("---------------------------");
		//����4) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		//����) 6,5,4,3
		int c = 10;
		while(c >= 1) {
			if(c <= 6 && c >= 3) {
				System.out.print(c + " ");
			}
			c--;
		}
		System.out.println();
		System.out.println("---------------------------");
		//����5) 1~10���� �ݺ��� ¦���� ���
		//����) 2,4,6,8,10
		int d = 1;
		while(d <= 10) {
			if(d % 2 == 0) {
				System.out.print(d + " ");
			}
			d++;
		}
	}
}
