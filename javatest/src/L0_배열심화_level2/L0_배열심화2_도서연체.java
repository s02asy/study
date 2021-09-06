package L0_배열심화_level2;

import java.util.Arrays;

public class L0_배열심화2_도서연체 {
	public static void main(String[] args) {
		int 대여기간 = 34;
		int [] 대여일 = {2020 , 12, 29};
		int [] 오늘 = {2021, 1, 12};
		
		int 올해달[] = {31, 28, 31, 30, 31, 31, 30, 31 , 30 , 31 , 30 , 31};
		
		// 위와 같은데이터일때 도서를 연체여부 출력(단, 윤년은 계산하지않는다)
		대여일[2] += 대여기간;
		while(true) {
			boolean check = false;
			for(int i = 0; i < 올해달.length; i++) {
				if(i + 1 == 대여일[1] && 올해달[i] < 대여일[2]) {
					check = true;
					대여일[1] += 1;
					대여일[2] -= 올해달[i];
					if(대여일[1] > 올해달.length) {
						대여일[1] -= 올해달.length;
						대여일[0] += 1;
					}
				}
			}
			if(check == false) {
				break;
			}
		}
		String year[] = {"년","월","일"}; 
		System.out.println("대여기한");
		for(int i = 0; i < 대여일.length; i++) {
			System.out.print(대여일[i] + "" + year[i] + " ");
		}
		System.out.println();
		System.out.println("오늘");
		for(int i = 0; i < 대여일.length; i++) {
			System.out.print(오늘[i] + "" + year[i] + " ");
		}
		System.out.println();
		if(대여일[0] < 오늘[0]) {
			int day1 = 0;
			int day2 = 0;
			for(int i = 0; i < 대여일[0]; i++) {
				for(int j = 0; j < 올해달.length; j++) {
					day1 += 올해달[j];
				}
			}
			for(int i = 0; i < 대여일[1] - 1; i++) {
				day1 += 올해달[i];
			}
			day1 += 대여일[2];
			for(int i = 0; i < 오늘[0]; i++) {
				for(int j = 0; j < 올해달.length; j++) {
					day2 += 올해달[j];
				}
			}
			for(int i = 0; i < 오늘[1] - 1; i++) {
				day2 += 올해달[i];
			}
			day2 += 오늘[2];
			System.out.println(day2 - day1 + "일 연체");
		}else if(대여일[0] == 오늘[0] && 대여일[1] < 오늘[1]) {
			int day1 = 0;
			int day2 = 0;
			for(int i = 0; i < 대여일[1] - 1; i++) {
				day1 += 올해달[i];
			}
			day1 += 대여일[2];
			for(int i = 0; i < 오늘[1] - 1; i++) {
				day2 += 올해달[i];
			}
			day2 += 오늘[2];
			System.out.println(day2 - day1 + "일 연체");
		}else if(대여일[0] == 오늘[0] && 대여일[1] == 오늘[1] && 대여일[2] < 오늘[2]) {
			System.out.println(오늘[2] - 대여일[2] + "일 연체");
		}else {
			int day1 = 0;
			int day2 = 0;
			for(int i = 0; i < 대여일[0]; i++) {
				for(int j = 0; j < 올해달.length; j++) {
					day1 += 올해달[j];
				}
			}
			for(int i = 0; i < 대여일[1] - 1; i++) {
				day1 += 올해달[i];
			}
			day1 += 대여일[2];
			for(int i = 0; i < 오늘[0]; i++) {
				for(int j = 0; j < 올해달.length; j++) {
					day2 += 올해달[j];
				}
			}
			for(int i = 0; i < 오늘[1] - 1; i++) {
				day2 += 올해달[i];
			}
			day2 += 오늘[2];
			System.out.println("남은기간 " + (day1 - day2) + "일");
		}
	}
}