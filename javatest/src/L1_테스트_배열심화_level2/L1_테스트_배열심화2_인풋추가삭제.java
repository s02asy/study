package L1_테스트_배열심화_level2;

import java.util.Arrays;

public class L1_테스트_배열심화2_인풋추가삭제 {

	public static void main(String[] args) {
		
		int arr[] = {0,0,0};
		int count = 0;
			
		int input[] = {10,20,30,10,30,30,10,20,30,20,30,20,11,30,11,11,10,10};		
		
		//1) arr 배열은 사이즈3이다.		
		//2) input 배열 안의 값들은  추가와 삭제를 반복할 값들이다.		
		//3) 짝수인덱스의 값은 "추가" 이고, 
		//4) 홀수인덱스의 값은 "삭제" 이다. 
		//   [조건] 삭제한자리는 뒤에서부터 앞으로 밀어내고 0으로 표시 한다. 	
		//5) 중복된값은 "추가" 할수없고 , 없는값은 "삭제"할수없다.
		//6) input의 값들을 전부 처리하고 처리과정출력 
		
		//예)
		// 10 ==> 짝수인덱스이므로 추가 ==> arr[] = {10,0,0};
		// 20 ==> 홀수인덱스이므로 삭제 ==> 20은 없으므로 ==> "삭제할값이 없습니다"
		// 30 ==> 짝수인덱스이므로 추가 ==> arr[] = {10,30,0};
		// 10 ==> 홀수인덱스이므로 삭제 ==> arr[] = {30,0,0};
		// 30 ==> 짝수인덱스이므로 추가 ==> 30 은이미 저장되어서 ==> "중복됩니다"
		// 30 ==> 홀수인덱스이므로 삭제 ==> arr[] = {0,0,0};
		
		for(int i = 0; i < input.length; i++) {
			if(i % 2 == 0) {
				System.out.print(input[i] + " ==> " + "짝수인덱스이므로 추가 ==> ");
				boolean check = false;
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] == input[i]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					arr[count] = input[i];
					System.out.print("arr[] = " + Arrays.toString(arr));
					count += 1;
				}else {
					System.out.print(input[i] + "은 이미 저장되어서 == > 중복됩니다.");
				}
			}
			else if(i % 2 == 1) {
				System.out.print(input[i] + " ==> " + "홀수인덱스이므로 삭제 ==> ");
				boolean check = false;
				int arrid = -1;
				for(int j = 0; j < arr.length; j++) {
					if(input[i] == arr[j]) {
						check = true;
						arrid = j;
						break;
					}
				}
				if(check == true) {
					arr[arrid] = 0;
					count -= 1;
					for(int j = arrid; j < arr.length - 1; j++) {
						arr[j] = arr[j + 1];
					}
					arr[count] = 0;
					System.out.print("arr[] = " + Arrays.toString(arr));
				}else {
					System.out.print(input[i] + "은 없으므로 ==> 삭제할 값이 없습니다." );
				}
				
			}
			System.out.println();
		}
	}

}