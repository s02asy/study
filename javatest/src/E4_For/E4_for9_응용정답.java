package E4_For;

import java.util.Random;

public class E4_for9_응용정답 {
	public static void main(String[] args) {
		//문제1) 무한반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
		//       1) 랜덤숫자중  가장큰수와 번호를 출력
	    //           (번호는 출력순서이다.)
		//       2) 가장큰수가 여러개있다면 가장마지막번호를 출력 
		//      예) 1, 7, 4, 7, 5 ==>   가장큰수 : 7 ,
	    //      번호 : 4  ==> 가장큰수가 2개지만 마지막번호를 출력
		Random ran = new Random();
		int max = 0;
		int maxNumber = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r +  " ");
			if(max <= r) {
				max = r;
				maxNumber = i;
			}		
		}
		System.out.println();
		System.out.println("max : " + max);
		System.out.println(maxNumber +" 번");
	    //문제2) 무한반복문을 사용하여 랜덤숫자 1~9 을 5번출력한다. 
		//       1) 랜덤숫자중  가장큰수와 번호를 출력
	    //           (번호는 출력순서이다.)
		//       2) 가장큰수가 여러개있다면 가장첫번째 번호를 출력 
		//      예) 1, 7, 4, 7, 5 ==>   가장큰수 : 7 ,
	    //      번호 : 2  ==> 가장큰수가 2개지만 첫번째번호를 출력
		System.out.println("-------------------------");
		max = 0;
		maxNumber = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r +  " ");
			if(max < r) {
				max = r;
				maxNumber = i;
			}		
		}
		System.out.println();
		System.out.println("max : " + max);
		System.out.println(maxNumber +" 번");
		System.out.println("-------------------------");
		//문제3) 랜덤으로 1~10 를 10번출력하고 , 
		//      가장큰수가 여러번 나온경우 중복출력된 횟수출력 	
		max = 0;
		int count = 0;
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
		System.out.println("max : " + max);
		System.out.println("중복개수 : " + count);
	}
}