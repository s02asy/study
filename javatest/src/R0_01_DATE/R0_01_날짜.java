package R0_01_DATE;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class R0_01_날짜 {

	public static void main(String[] args) {
		// System.currentTimeMillis(); 1970년1월1일 부터 현재까지 초로 계산후 * 1000 
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		long time2 = time1 / 1000;
		System.out.println(time2);
		long time3 = time2 / 60;
		System.out.println(time3);
		long time4 = time3 / 60;
		System.out.println(time4);
		// 현재 컴퓨터 시스템의 날짜와 시간을 얻어온다.
		Date date = new Date();
		// Fri Mar 06 12:45:17 KST 2020
		System.out.println(date);
		String temp = String.valueOf(date);
		System.out.println(temp);
		String tokens[] = date.toString().split(" ");
		System.out.println(Arrays.toString(tokens));
		/*
		 * 	[1] 날짜 및 시간 출력 서식 지정 방법
		 *  	. 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
		 *  	. Date date = new Date();
		 *  	. SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식");
		 *  [2] 날짜 및 시간 서식 적용 방법
		 *  	. sdf.format(date);
		 *  [3] 날짜 및 시작 출력 서식 문자의 종류
		 *  	. 구글에서 "simpledateformat 날짜 형식" 라고 검색하기
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm");
		System.out.println(sdf2.format(date));
		
		/*
		 * System.currentTimeMillis()
		 * . 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 * . 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
		 */

		// int time = System.currentTimeMillis();		// 에러 발생
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.out.println(sdf2.format(time));
		
		Date a = new Date();
		SimpleDateFormat b = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초");
		System.out.println(b.format(a));
		
	}

}