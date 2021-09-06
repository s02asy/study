package J4_배열_level4;
public class J4_배열4_기념일 {
	public static void main(String[] args) {
		int monthList[] =
			{31, 28, 31, 30, 
			 31, 30, 31, 31, 
			 30, 31, 30, 31};
		int day = 3;
		int month = 3;			
			// 철수와 영희는 3월 3일에 만났다. 		
			// 철수는 영희와 100일 기념일에 축하파티를 할려고한다.
			// 만난지 100일뒤는  몇월몇일인가?			
		int allDay = 0;
		
		for(int i = 0; i < month - 1; i++) {
			allDay += monthList[i];
		}		
		allDay += day;
		allDay += 100;
		allDay -= 1;		
		System.out.println(allDay);
		
		int temp = allDay;
		int nextMonth = 0;
		int nextDay = 0;
		for(int i = 0; i < 12; i++) {
			if(temp < 0) {
				nextMonth = i;
				break;
			}else {
				nextDay = temp;
			}
			temp -= monthList[i];
		}
		System.out.println(nextMonth);
		System.out.println(nextDay);
	}
}