package E9_Test1;

import java.util.Scanner;

public class E9_if1_Test {
	public static void main(String[] args) {
		/*
		 문제) 시험점수 입력받고 학점출력 
		  아래는 점수표이다.
		  100~90 ==> A
		  89~80 ==> B
		  79~70 ==> C
		  69이하                      ==> 재시험 
		 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		 예) 100 ==> A+
		 예) 98 ==> A+
		 예) 83 ==> B
		 예) 79 ==> C+
		 예) 66 ==> "재시험"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("시험점수를 입력하세요.");
		int 점수 = scan.nextInt();
		int 일 = 점수 % 10;
		String 등급 = "";
		if(점수 >= 90 && 점수 < 100) {
			등급 = "A";
			if(일 >= 7) {
				등급 = "A+";
			}
		}
		else if(점수 <= 89 && 점수 >= 80 ) {
			등급 = "B";
			if(일 >= 7) {
				등급 = "B+";
			}
		}
		else if(점수 <= 79 && 점수 >= 70 ) {
			등급 = "C";
			if(일 >= 7) {
				등급 = "C+";
			}
		}
		else if(점수 <= 60) {
			System.out.println("재시험");
		}
		else if(점수 == 100) {
			등급 = "A+";
		}
		System.out.println(점수);
		System.out.println(등급);
	}
}