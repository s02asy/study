package G9_반복문테스트;

import java.util.Random;

public class G9_While2_Test {
	public static void main(String[] args) {
		Random ran = new Random();

		//문제1) 무한반복문을 사용해서 
		//       랜덤으로 1~10을 출력하다가 그합이 100 이상이되면 종료.
		int total = 0;
		boolean run = true;
		while(run) {
			int r = ran.nextInt(10) + 1;
			System.out.print(r + " ");
			total = total + r;
			if(total >= 100) {
				System.out.println("total : " + total);
				run = false;
			}
		}
		//문제2) 무한반복문을 사용해서 랜덤으로 1~10을 출력을 계속하다.
		//  "짝수" 가 5번나오면 종료.
		int count = 0;
		for(int i = 0; i == 0;) {
			int r = ran.nextInt(10) + 1;
			System.out.println(r);
			if(r % 2 == 0) {
				count += 1;
				System.out.println("짝수 : " + r);
			}
			if(count == 5) {
				break;
			}
		}
	} 
}