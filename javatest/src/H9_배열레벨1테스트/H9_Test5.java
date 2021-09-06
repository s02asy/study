package H9_배열레벨1테스트;

public class H9_Test5 {
	public static void main(String[] args) {
	
		//아래 배열은 각반 의 학생수이다. 
		//에어컨 한대당 30명의 학생을 시원하게 할수있다. 
		//4반 학생전부를 시원하게 할려면 에어컨은 총 몇대가 필요한가?
		//예) 80명이면 총3대가 필요하다.
		int arr[] = {80, 45, 33, 20};
		int student = 30;
		int 에어컨 = 0;
		for(int i = 0; i < 4; i++) {
			에어컨 += arr[i] / student;
			if(arr[i] % student != 0) {
				에어컨 += 1;
			}
		}
		System.out.println("에어컨 : " + 에어컨 + "대");
	}
}