package K4_cospro2급준비문제;

import java.util.Random;

public class K4_cospro2_번호가리기 {
	public static void main(String[] args) {
		Random ran = new Random();
		// 문제) 숫자 10000(일만) ~ 100000000(일억) 사이의 숫자를 랜덤으로 저장하고 출력
		
		// 조건) 맨뒤의 4자리의 숫자는 * 로 표시
		
		// 예) 10000 ==> 1****
		// 예) 67456445 ==> 6745****
		int r = ran.nextInt(100000001) + 10000;
		int check = r / 10000;
		System.out.println(r);
		System.out.println(check + "****");
	}
}