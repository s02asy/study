package J4_�迭_level4;
public class J4_�迭4_����� {
	public static void main(String[] args) {
		int monthList[] =
			{31, 28, 31, 30, 
			 31, 30, 31, 31, 
			 30, 31, 30, 31};
		int day = 3;
		int month = 3;			
			// ö���� ����� 3�� 3�Ͽ� ������. 		
			// ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�.
			// ������ 100�ϵڴ�  ��������ΰ�?			
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