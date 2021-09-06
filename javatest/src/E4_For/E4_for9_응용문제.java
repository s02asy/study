package E4_For;

import java.util.Random;

public class E4_for9_응용문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		//문제1) 무한반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
		//       1) 랜덤숫자중  가장큰수와 번호를 출력
	    //           (번호는 출력순서이다.)
		//       2) 가장큰수가 여러개있다면 가장마지막번호를 출력 
		//      예) 1, 7, 4, 7, 5 ==>   가장큰수 : 7 ,
	    //      번호 : 4  ==> 가장큰수가 2개지만 마지막번호를 출력
		int max = 0;
		int count = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r + " ");
			if(max <= r) {
				max = r;
				count = i;
			}
		}
		System.out.println();
		System.out.println("가장큰수 : " + max);
		System.out.println("마지막 번호 : " + count);
		System.out.println("-----------------------------");
	    //문제2) 무한반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
		//       1) 랜덤숫자중  가장큰수와 번호를 출력
	    //           (번호는 출력순서이다.)
		//       2) 가장큰수가 여러개있다면 가장첫번째 번호를 출력 
		//      예) 1, 7, 4, 7, 5 ==>   가장큰수 : 7 ,
	    //      번호 : 2  ==> 가장큰수가 2개지만 첫번째번호를 출력
		max = 0;
		count = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r + " ");
			if(max < r) {
				max = r;
				count = i;
			}
		}
		System.out.println();
		System.out.println("가장큰수 : " + max);
		System.out.println("첫번째 번호 : " + count);
		System.out.println("-----------------------------");
		//문제3) 랜덤으로 1~10 를 10번출력하고 , 
		//      가장큰수가 여러번 나온경우 중복출력된 횟수출력
		max = 0;
		count = 0;
		for(int i = 1; i <= 10; i++) {
			int r = ran.nextInt(10) + 1;
			System.out.print(r + " ");
			if(max < r) {
				max = r;
				count = 1;
			}
			else if(max == r) {
				count += 1;
			}
		}
		System.out.println();
		System.out.println("가장큰수 : " + max);
		if(count >= 2) {
			System.out.println("중복 출력된 수 : " + count);
		}
	} 
}