package E2_While_Quiz;
/*
 * # 369����[2�ܰ�]
 * 1. 1~50���� �ݺ��� �Ѵ�.
 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */
public class E2_While6_369���ӹ��� {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 50) {
			int count = 0;
			int �� = i / 10;
			int �� = i % 10;
			if(�� % 3 == 0 && �� != 0) {
				count += 1;
			}
			if(�� % 3 == 0 && �� != 0) {
				count += 1;
			}
			if(count == 1) {
				System.out.print("¦" + " ");
			}
			else if(count == 2) {
				System.out.print("¦¦" + " ");
			}
			else {
				System.out.print(i + " ");
			}
			i += 1;
		}
		System.out.println();
	}

}