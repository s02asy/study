package B1_Variable_Quiz;

public class B1_Variable2_문제 {
	public static void main(String[] args) {

			int money = 174900;
			
			// [문제] 위 돈 (174900원 )을 화폐매수별로 출력해보세요.
			
			// 오만원  : 3 , 일만원 : 2 , 오천원 : 0 , 일천원 : 4 , 오백원  : 1 , 일백원 : 4
			
			int 돈 = 174900;
			int 오만원 = 돈 / 50000;
			int 일만원 = 돈 % 50000 / 10000;
			int 오천원 = 돈 % 10000 / 5000;
			int 일천원 = 돈 % 5000 / 1000;
			int 오백원 = 돈 % 1000 / 500;
			int 일백원 = 돈 % 500 / 100;

			System.out.println("오만원 : " + 오만원 );
			System.out.println("일만원 : " + 일만원 );
			System.out.println("오천원 : " + 오천원 );
			System.out.println("일천원 : " + 일천원 );
			System.out.println("오백원 : " + 오백원 );
			System.out.println("일백원 : " + 일백원 );
     }
}
