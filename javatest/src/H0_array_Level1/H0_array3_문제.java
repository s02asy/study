package H0_array_Level1;

public class H0_array3_문제 {
	public static void main(String[] args) {
		// 문제1) d 배열의 값을 e 배열에 하나씩 저장하는데 순서를 거꾸로 저장 
		int d[] = { 1,2,3,4,5 };
		int e[] = { 0,0,0,0,0 };
		int lastindex = 4;
		//예)  ={5,4,3,2,1};
		for(int i = 0; i < 5; i++) {
			e[i] = d[lastindex];
			lastindex -= 1;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(e[i] + " ");
		}
	}
}