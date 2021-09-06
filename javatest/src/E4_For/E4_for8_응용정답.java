package E4_For;

public class E4_for8_응용정답{
	public static void main(String[] args) {

			
		//문제) 아래 내용들을 보고 적당한 식 과 답  만들어보세요.(반복문)
	    //      (조건) while 를 사용하시오.
	    /*
	        문제1) 
	        한번에 500 kg 까지 운반할수 있는 승강기가 있다.
	        몸무게가 80kg인 배달원이 이 승강기를 타고 
	        하나의 무게가 30kg인 상자를 운반하려고 할 때,
	        한번에 최대 몇 상자까지 운반할 수 있는지 알아보자.
	    */
		int 승강기 = 500;
		int 배달원 = 80;
		int 상자 = 30;
		int 상자개수 = 0;
		int 임시상자 = 0;
		for(int i = 0; i == 0;) {
			int 무게 = 배달원 + 상자 * 임시상자;
			if(승강기 < 무게) {
				System.out.println(상자개수 + "개");
				break;
			}
			else {
				상자개수 = 임시상자;
				임시상자 += 1;
			}
		}
	    /*  
		 문제2) 
	        멜론음원사이트 에서는 정액제인 경우에는 10500원이고, 
	        한달간 무제한으로 내려받을수있고, 
	        정액제가 아닌경우에는 한 곡당 600원에 내려받을수있다.
	        최소 한달에 몇곡이상 내려받을때 정액제를 사용하는것이
	        좋을까? 
        */
		int 정액제 = 10500;
		int 한곡 = 600;
		int count = 0;
		for(int i = 0; i == 0;) {
			int 금액 = 한곡 * count;
			if(정액제 < 금액) {
				System.out.println(count + "곡");
				break;
			}
			count += 1;
		}
		
	    /*
	        문제3)
	        명수는 친구의 생일 선물로 4000원짜리 필통 1개 700원짜리 색연필 몇자루를 사려고 한다. 
	        명수는 13000원을 가지고있을때 색연필은 최대 몇자루
	        까지 구입할수있을까?
	    */
		int 잔고 = 13000;
		int 필통 = 4000;
		int 색연필 = 700;
		int max = 0;
		count = 0;
		for(int i = 0; i == 0;) {
			int 금액 = 필통 + 색연필 * count;
			if(잔고 < 금액) {
				System.out.println(max + "자루");
				break;
			}
			else {
				max = count;
				count += 1;
			}
		}
	    /*
	        문제4)
	        태윤이는 두번의 시험에서 각각 80점과 72점을 받았다.
	        세 번째 시험에서 최소 몇 점이상을 받아야 
	        세번의 시험성정의 평균이 82점이상이 될수 있을까?
	    */
		int a = 80;
		int b = 72;
		int c = 0;
		for(int i = 0; i == 0;) {
			if((a + b + c) / 3 >= 82) {
				System.out.println(c + "점");
				break;
			}
			c += 1;
		}
	} 
}