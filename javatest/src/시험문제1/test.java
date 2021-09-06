package 시험문제1;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int input[] = {1,3,3,1,3,2,2,2,2,3,1,2,3,4,4};
		int a [] = new int[10];	
		// [1] input 의 데이터를 a 에 순차적으로 저장한다.
		// [2] 단, 저장하기전 a의 마지막 값과 지금 저장할려고 하는값이 같으면,  둘다 삭제 
        //        다르면 그냥 저장 		
		// 예) input = {1,3,3,2,1,1,4}	
		// 1  ==> a[] = {1}
		// 3  ==> a[] = {1,3}
		// 3  ==> a[] = {1,3,3} ==> {1}
		// 2  ==> a[] = {1,2}
		// 1  ==> a[] = {1,2,1}
		// 1  ==> a[] = {1,2,1,1} ==> {1,2}
		// 4  ==> a[] = {1,2,4}
		a[0] = input[0];
		int index = 0;
		System.out.println(Arrays.toString(a));
		for(int i = 1;i < input.length; i++) {
			if(a[index] == input[i]) {
				a[index] = 0;
				if(index > 0) {
					index -= 1;
				}
			}else {
				if(a[index] == 0 && index == 0) {
					index -= 1;
				}
				index += 1;
				a[index] = input[i];
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("---------------------------------");
		System.out.println(Arrays.toString(a));
	}

}

