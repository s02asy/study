package L0_배열심화_level2;
import java.util.Arrays;
import java.util.Scanner;
public class L0_배열심화2_사다리 {
/*
 * # 사다리 게임
 * 1. 인덱스 0~4를 하나선택한다. (가로개수가 5개)
 * 2. 숫자 0 을 만나면 그냥 아래로 내려간다.
 * 3. 숫자 1 을 만나면 오른쪽으로 이동후 내려간다.
 * 4. 숫자 2 를 만나면 완쪽으로 이동후 내려간다.
 * 5. 오늘의 메뉴 출력 
 * 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String menu[] = {"떡라면" , "돈까스" ,"짜장면" , "쫄면" , "된장찌개"};
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{0,0,0,0,0}};
		System.out.println("=== 빙 고 판 ===");
		for(int i = 0 ; i < ladder.length; i++) {
			System.out.println(Arrays.toString(ladder[i]));
		}
		System.out.println("인덱스 0~4중 하나 선택");
		int sel = scan.nextInt();
		for(int i = 0; i < ladder.length; i++) {
			if(ladder[i][sel] == 1) {
				sel += 1;
			}else if(ladder[i][sel] == 2) {
				sel -= 1;
			}
		}
		System.out.println(menu[sel]);
	}
}