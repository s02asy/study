package H9_배열레벨1테스트;

public class H9_Test8정답 {
	public static void main(String[] args) {
		// 채팅원리
		// 문제 1) aa 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 bb의  값을 저장 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// 예) aa = {20,30,40,50,90};
		
		for(int i = 0; i < 4; i++) {
			aa[i] = aa[i + 1];
		}
		aa[4] = bb;
		
		for(int i = 0; i < 5; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		// 문제 2) cc 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 dd의 값을 저장 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		// 예) cc[] = {60,10,20,30,40};
		
		/*
		for(int i = 1; i < 5; i++) {
			cc[i] = cc[i-1];
		}
		*/
		int lastindex = 4;
		for(int i = 0; i < 4; i++){
			cc[lastindex] = cc[lastindex-1];
			lastindex -= 1;
		}
		
		cc[0] = dd;
		
		for(int i = 0; i < 5; i++) {
			System.out.print(cc[i] + " ");
		}
		System.out.println();
	}
}