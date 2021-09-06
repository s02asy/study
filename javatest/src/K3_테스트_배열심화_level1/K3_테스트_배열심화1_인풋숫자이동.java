package K3_테스트_배열심화_level1;

import java.util.Arrays;

public class K3_테스트_배열심화1_인풋숫자이동 {
	public static void main(String[] args) {
		
		// [숫자이동게임]
		
		// [1] 8은 플레이어이다
		// [2] 0은 이동할수있는 길이다.
		// [3] 1은 이동할수없는 벽이다. 
		int move[] = {1,0,0,0,8,0,0,0,1};
		int player = 4;
		int input[] = {1,1,1,1,2,2,2};
		
		// input 배열의 내용을 순차적으로 실행하시요.
		// input의값중 1은 왼쪽이동 , 2는 오른쪽이동이다. 
		// 벽에서 이동하면 ==> "이동할수없습니다" 출력 
		
		// 현재화면 ==> {1,0,0,0,8,0,0,0,1};
		// 1 ==> {1,0,0,8,0,0,0,0,1};
		// 1 ==> {1,0,8,0,0,0,0,0,1};
		// 1 ==> {1,8,0,0,0,0,0,0,1};
		// 1 ==> "이동할수없습니다"
		// 2 ==> {1,0,8,0,0,0,0,0,1};
		// 2 ==> {1,0,0,8,0,0,0,0,1};
		// 2 ==> {1,0,0,0,8,0,0,0,1};
		
		System.out.print("현재화면 == >");
		System.out.println(Arrays.toString(move));
		for(int i = 0; i < input.length; i ++) {
			if(input[i] == 1) {
				System.out.print(input[i] + " ==> ");
				player -= 1;
				if(move[player] != 1) {
					move[player] = 8;
					move[player + 1] = 0;
					System.out.println(Arrays.toString(move));
				}
				else {
					player += 1;
					System.out.print("이동할수없습니다.");
					System.out.println();
				}
			}
			else if(input[i] == 2) {
				System.out.print(input[i] + " ==> ");
				player += 1;
				if(move[player] != 1) {
					move[player] = 8;
					move[player - 1] = 0;
					System.out.println(Arrays.toString(move));
				}
			}
		}
	}
}