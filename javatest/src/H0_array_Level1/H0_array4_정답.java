package H0_array_Level1;

public class H0_array4_정답 {
	public static void main(String[] args) {
		// 문제1)  a의 값과 b의 값을 번갈아가면서 c에 저장
		// 예) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int cindex = 0;
		for(int i = 0; i < 3; i++) {
			c[cindex] = a[i];
			c[cindex + 1] = b[i];
			cindex += 2;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(c[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int j = 0;
		int k = 0;
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				e[j] = d[i];
				j += 1;
			}else if(i % 2 == 1) {
				f[k] = d[i];
				k += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.print(f[i] + " ");
		}
		System.out.println();
	}
}