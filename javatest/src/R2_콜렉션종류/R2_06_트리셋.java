package R2_콜렉션종류;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class R2_06_트리셋 {
	public static void main(String[] args) {

		// 트리셋은 중복을 허용하지않는다. 
		// 그외는 일반 리스트와 비슷하다. 
		// 활용법 주로 알고리즘 이용으로 사용한다.
		
		// 문제1) arr 배열의 각 숫자별개수 출력 
		
		 int arr[] = {1,2,3,4,4,3,100,2,3};
		
		
		TreeSet<Integer> numSet = new TreeSet<Integer>();
		// TreeSet은 배열과 다르다 붙어있지 않고 하나하나 다 떨어져 있으므로 반복문을 돌릴수 없다.
		// 그래서 만든것이 Iterator이다.
		for(int i = 0; i < arr.length; i++) {
			numSet.add(arr[i]);
		}
		System.out.println(numSet.size());
		
		int tempList [] = new int[numSet.size()];
		int countList[] = new int[numSet.size()];
		
		int i = 0;
		Iterator<Integer> iter = numSet.iterator();	
		while(iter.hasNext()) {
		  
		    tempList[i] = iter.next();
		    System.out.println(tempList[i] );
		    i += 1;
		}
		
		for( i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < tempList.length; j++) {
				if(arr[i] == tempList[j]) {
					countList[j] += 1;
				}
			}
		}
		
		System.out.println(Arrays.toString(tempList));
		System.out.println(Arrays.toString(countList));
		
	}
}