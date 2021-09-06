package M7_테스트_문자열_level5;

import java.util.Arrays;

public class M7_테스트_문자열5_05_도서연체 {

	public static void main(String[] args) {
		String rentalData = "";		
		rentalData += "책번호/책제목/대여날짜/회원번호\n";
		rentalData += "20122/연필로쓰기/2020-11-25/1001\n";
		rentalData += "40143/외국어 공부의 감각/2020-11-27/1003\n";
		rentalData += "54321/컴퓨터활용능력/2020-11-27/1041\n";
		rentalData += "26543/아무튼,외국어/2020-12-01/1034";
		
		
		String userData = "";
		userData += "회원번호/책번호/대여일수(day)\n";
		userData += "1001/20122/10\n";
		userData += "1003/40143/8\n";
		userData += "1041/54321/5\n";
		userData += "1034/26543/2";
		
		
		//위 데이터는 도서관 책 대여 데이터이다.
		// 오늘은 12월4일 이라고했을때 연체한 회원번호 출력
		
		String rentalData2[] = rentalData.split("\n");
		String rentalData3[][] = new String[rentalData2.length - 1][];
		int id = 0;
		for(int i = 1; i < rentalData2.length; i++) {
			rentalData3[id] = rentalData2[i].split("/");
			id += 1;
		}
		String rentalData4[][] = new String[rentalData3.length][];
		for(int i = 0; i < rentalData3.length; i++) {
			rentalData4[i] = rentalData3[i][2].split("-");
		}
		String userData2[] = userData.split("\n");
		String userData3[][] = new String[userData2.length - 1][];
		int id2 = 0;
		for(int i = 1; i < userData2.length; i++) {
			userData3[id2] = userData2[i].split("/");
			id2 += 1;
		}
		System.out.println("연체자 회원번호 리스트");
		for(int i = 0; i < rentalData4.length; i++) {
			if(Integer.parseInt(rentalData4[i][2]) + Integer.parseInt(userData3[i][2]) > 34) {
				System.out.println(userData3[i][0]);
			}
		}
	}
}