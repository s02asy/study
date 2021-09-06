package H9_배열레벨1테스트;

public class H9_Test3 {
	public static void main(String[] args) {
	
		// 설 품목으로 사과상자들을  살려고 한다. 
		
		// 사과상자의 권장무게는 600 이고  무게 오차는 초과 미만 포함  10% 라면  적절한 사과상자이다.
		// 몇상자를 살수있을까? 
		int arr[] = {653, 670, 533, 541, 660};
		Double box = 600.0;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(box * 0.9 <= arr[i] && box * 1.1 >= arr[i]) {
				count += 1;
			}
		}
		System.out.println(count + "상자");
	}
}