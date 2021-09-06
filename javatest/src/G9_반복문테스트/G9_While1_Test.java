package G9_반복문테스트;

public class G9_While1_Test {
	public static void main(String[] args) {

			
		   // 다음 내용을 보고 직접 식과 답을 구해보세요. (while)
		   /*
		        문제1)
	
			        자전거는 1분에 4칼로리가 소모되고, 
			        줄넘기는 1분에 9칼로리가 소모된다.
	
			        지후는 95분 동안 505 칼로리를 소모했다. 
			        지후가 각 운도에 사용한 시간은 각각 얼마인가?
		   */
			int 자전거 = 4;
			int 줄넘기 = 9;
			int 시간1 = 95;
			int 시간2 = 0;
			int 칼로리 = 505;
			boolean run = true;
			while(run) {
				if(시간1 * 자전거 + 시간2 * 줄넘기 == 칼로리) {
					break;
				}
				시간1 -= 1;
				시간2 += 1;
			}
			System.out.println("자전거 : " + 시간1 + "분");
			System.out.println("줄넘기 : " + 시간2 + "분");

		   /*
			     선호네 반 학생 25명이 체험학습을 하러 가기위해
			     버스를 탔는데 , 총요금이 19400원이였다.
	
			     교통카드를 사용하면 720원이고 , 
			     현금으로 지불하면 1000원일때, 
	
			     교통카드를 사용한 학생수와 현금을 사용한 학생수는 
			     각각 얼마인가?
		   */
			int 학생1 = 25;
			int 학생2 = 0;
			int 총요금 = 19400;
			int 교통카드 = 720;
			int 현금 = 1000;
			run = true;
			while(run) {
				if(학생1 * 교통카드 + 학생2 * 현금 == 총요금) {
					break;
				}
				학생1 -= 1;
				학생2 += 1;
			}
			System.out.println("교통카드 사용 학생 : " + 학생1 + "명");
			System.out.println("현금 사용 학생 : " + 학생2 + "명");
	} 
}