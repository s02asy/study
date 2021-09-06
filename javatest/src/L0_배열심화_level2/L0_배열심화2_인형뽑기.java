package L0_배열심화_level2;

import java.util.Arrays;

public class L0_배열심화2_인형뽑기 {
	public static void main(String[] args) {		
		int machine[][] = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3},
		};
		int input[] = {1,0,0,3,3,4,4};
		/*
		 * 위 데이터는 인형뽑기 기계의 데이터 이다. (7 x 5) 사이즈
		 * [인형번호] 
		 * [1 : 호랑이] [2 : 곰] [3 : 사자] [4 : 기린]
		 * -------------------------------------------------
		 * [1] 숫자 0 은 비어있는것을뜻한다.
		 * [2] 숫자 0 이 아닌곳은 인형이 있는것을 뜻하고 각 숫자는 인형번호(1~4)이다.
		 * [3] input의 데이터는 오늘 손님들이 인형을 선택한 인덱스번호이다.
		 * [4] 세로단위로 한라인이고, 인덱스번호는 가로로 선택이 된다. (예 0~4번까지 가능)
		 * [5] 인형은 각라인별 맨위에서부터 뽑히게된다. 
		 * 예) input ==> 1 ==> 2,1,4,1,1 라인이고 맨위의 2가 0이된다.
		 * [6] 만약에 라인의 각값들이 전부 0인 라인을 선택하게되면, "꽝" 출력 
		 * [7] 오늘 판매된 인형 이름을 출력하시요. 
		 * 예) 
		 *    1 ==> [2:곰]
		 *    0 ==> [3:사자]
		 *    0 ==> [1:호랑이]
		 *    3 ==> [3:사자]
		 *    3 ==> [0:꽝]
		 *    4 ==> [3:사자]
		 *    4 ==> [3:사자]	 
		 *    
		 * [8](응용) 오늘 한번도 판매되지않은 동물을 출력하시요. [기린]
		 */
		String animal[] = {"[0 : 꽝]","[1 : 호랑이]", "[2 : 곰]", "[3 : 사자]", "[4 : 기린]"};
		int count[] = new int[animal.length];
		int inputid = 0;
		while(true) {
			for(int i = 0; i < machine.length; i++) {
				if(machine[i][input[inputid]] != 0) {
					System.out.println(animal[machine[i][input[inputid]]]);
					count[machine[i][input[inputid]]] += 1;
					machine[i][input[inputid]] = 0;
					break;
				}
				if(machine[machine.length - 1][input[inputid]] == 0) {
					System.out.println(animal[machine[machine.length - 1][input[inputid]]]);
					count[machine[machine.length - 1][input[inputid]]] += 1;
					break;
				}
			}
			inputid += 1;
			if(inputid == 7) {
				break;
			}
		}
		System.out.println(Arrays.toString(count));
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 0) {
				System.out.println("판매되지 않은 동물 : " + animal[i]);
			}
		}
	}
}