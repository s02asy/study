package B1_Variable_Quiz;

public class B1_Variable2_정답 {
	public static void main(String[] args) {

			int money = 174900;
			
			// [문제] 위 돈 (174900원 )을 화폐매수별로 출력해보세요.
			
			// 오만원  : 3 , 일만원 : 2 , 오천원 : 0 , 일천원 : 4 , 오백원  : 1 , 일백원 : 4
			
			
			int _오만원 = money / 50000;
			int _일만원 = money % 50000 / 10000;
			int _오천원 = money % 10000 / 5000;
			int _일천원 = money % 5000 / 1000;
			int _오백원 = money %1000 / 500;
			int _일백원 = money % 500 / 100;
			
			System.out.println("_오만원 : " + _오만원 );
			System.out.println("_일만원 : " + _일만원 );
			System.out.println("_오천원 : " + _오천원 );
			System.out.println("_일천원 : " + _일천원 );
			System.out.println("_오백원 : " + _오백원 );
			System.out.println("_일백원 : " + _일백원 );
			
			
			
			
     }
}
