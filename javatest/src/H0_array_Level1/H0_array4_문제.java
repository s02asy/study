package H0_array_Level1;

public class H0_array4_문제 {
	public static void main(String[] args) {
		// 문제1)  a의 값과 b의 값을 번갈아가면서 c에 저장
		// 예) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int index = 0;
		for(int i = 0; i < 3; i++) {
			c[index] = a[i];
			c[index + 1] = b[i];
			index += 2;
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		//문제2) d의 값을 번갈아가면서 e , f 에 각각 저장 
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index_1 = 0;
		int index_2 = 0;
		// e = {10,30,50}`
		// f = {20,40,60};
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				e[index_1] = d[i];
				index_1 += 1;
			}
			else if(i % 2 == 1) {
				f[index_2] = d[i];
				index_2 += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.print(f[i] + " ");
		}
	}
}