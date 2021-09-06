package P6_콜렉션벡터_level1;

import java.util.Random;
import java.util.Vector;

public class P6_콜렉션벡터1_중복삭제 {
	public static void main(String[] args) {
		int arr[] = {1,1,3,2,2,3,3,4,4,5,5,4};		
		Random ran= new Random();	
		int r = ran.nextInt(5) + 1;
		Vector<Integer> vec = new Vector<>();
		for(int i = 0; i < arr.length; i++) {			
				vec.add(arr[i]);			
		}		
		//1) arr의 값을 Vector 에 모두 저장한다. 
		//2) Vector의 값은 1~5사이이다.
		//3) 변수 r 에 랜덤 으로 1~5를 저장한다, 
		//문제) vector 안의 값들은 변수 r의 값 모두 삭제 
			
		/*
			//문제 발생 ) 깨끗하게 삭제되지않는다. 
			// 이유는 vec 크기가 변해서 인덱스가 변해버린다.
		System.out.println("ran : " + r);
		for(int i = 0; i < vec.size(); i++) {
			if(vec.get(i) == r) {
				vec.remove(i);
			}
		}	
		System.out.println(vec.toString());		

		*/					
		
		//해결방법) 삭제시 size 가 줄기때문에 i 를 1 감소 시킨다.		
		System.out.println("ran : " + r);
		for(int i = 0; i < vec.size(); i++) {
			if(vec.get(i) == r) {
				vec.remove(i);
				i -= 1;
			}
		}	
		System.out.println(vec.toString());		
	
	}
}