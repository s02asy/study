package I0_배열_level2;
public class I0_배열_종류 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		double farr[] = {1.1, 2.2, 3.3, 4.4};
		boolean barr[] = {false, false , true , true};
		
		// char[] 배열은 한글자씩 저장가능하고 '' 홑따옴표를 사용한다.	
		//char[] 배열은 너무 불편하다. 
		// 한사람의 이름 자체가 배열이기때문에 한명이상 저장할수없다.  
		char carr[] = {'m' ,'i' , 'k' , 'e'}; 		
		
		
		// char대신에 문자열을 저장할수있는 String 이 만들어졌다.
		// 추후 자세히 다룬다.
		String name = "이영희";
		System.out.println(name);	
		String sarr[] = {"김철수" , "mike" , "이만수" , "jake"};
					
		System.out.println("--------------------------------");
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(farr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(barr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(carr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(sarr[i] + " ");
		}
		System.out.println();
	}

}