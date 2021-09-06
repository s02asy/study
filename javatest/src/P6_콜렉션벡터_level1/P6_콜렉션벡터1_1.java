package P6_콜렉션벡터_level1;

import java.util.Scanner;
import java.util.Vector;
/*
 * # 배열의 한계
 * - 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
 * - 가변배열을 직접 만들어서 사용했었지만,
 * - 자바에서는 Vector 클래스를 통해 가변배열을 제공한다. 
 * 
 *
 * # 특징 
 *	- 특이하게 <> 꺽쇠를 사용하는데 제네릭(generic)이라고 부른다. 
 *  - 저장할수 있는데이터는 클래스만 저장가능하다. 
 *  - int double 이런 기본자료형을 저장할수없기때문에 
 *     Integer , Double 같은 래퍼클래스를 이용해야한다. 
 *  
 *  선언하는법 
 *  Vector<Integer> vector = new Vector<Integer>();
    
    // ============ 주요 기능 ===============
	// 1) add    ==> 추가
	// 2) remove ==> 삭제
	// 3) clear  ==> 전부삭제
	// 4) size   ==> 개수
	// 5) get    ==> 값읽기 ==> 배열의 []에 해당 
	// 6) set    ==> 값수정
 
 */
public class P6_콜렉션벡터1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
				
		Vector<Integer> vector = new Vector<Integer>();		
		// 주요기능 
		
		//1) add(값) ==> 맨뒤에 값추가 		
		vector.add(10); 
		vector.add(20); 
		vector.add(30); 
		System.out.println(vector.get(0));
		System.out.println(vector.get(1));
		System.out.println(vector.get(2));
		System.out.println("vector 개수 : " + vector.size());
		
		//2) remove(인덱스) ==> 인덱스로 값삭제 		
		vector.remove(0);		
		//3) size()  ==> 개수
		System.out.println("vector 개수 : " + vector.size());
		 
		//4) get(인덱스) ==> 값가져오기 배열의 [인덱스] 와같다. 
		int value = vector.get(0);
		System.out.println("vector[0] : "  + value);
		
		//5) set(인덱스 , 수정값) ==> 수정 벡터는 특이하게 읽기 , 쓰기가 구분되어있다. 
		// 배열은 아래와 같은 내용이 가능하나, 벡터는 get , set 구분되어 있다.
		// 예)
		int arr[] = {10,20,30};
		arr[0] = 100;
		arr[0] = 200;
		// 벡터 예)
		//vector.get(0) = 100; // 이와같은 문법은 불가능하다.
		vector.set(0,  100); // 이와같이 수정해야한다. 
		
		//6) 전체 출력 
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
		System.out.println();
		
		//7)clear ==> 전부 삭제 
		vector.clear(); 
		System.out.println("vector 개수 : " + vector.size());
		
	}
}