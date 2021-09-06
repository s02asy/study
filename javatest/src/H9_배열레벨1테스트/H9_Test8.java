package H9_배열레벨1테스트;

public class H9_Test8 {
	public static void main(String[] args) {
		
		
		// 문제 1) aa 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 bb의  값을 저장 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// 예) aa = {20,30,40,50,90};
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				aa[i] = bb;
			}
			else {
				aa[i] = aa[i + 1];
			}
		}
		System.out.print("aa[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		// 문제 2) cc 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 dd의 값을 저장 
		// 선언된 배열은 그대로 이기떄문에 뒤로 하나씩 밀어 낼때에는 뒤에서 부터 값을 넣어줘야 한다.
		int cc[] = { 10,20,30,40,50 }; 
		int dd = 60;				   
		// 예) cc[] = {60,10,20,30,40};
		for(int i = 4; i >= 0; i--) {
			if(i == 0) {
				cc[i] = dd;
			}
			else {
				cc[i] = cc[i - 1];
			}
		}
		System.out.print("cc[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(cc[i] + " ");
		}
		System.out.print("}");
	}
}