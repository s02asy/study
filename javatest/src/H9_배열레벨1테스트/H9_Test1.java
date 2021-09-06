package H9_배열레벨1테스트;

public class H9_Test1 {
	public static void main(String[] args) {
		// 다양한 색깔의 장갑을 가지고 1쌍 씩 만들려고 한다. 
		// 다음배열은 장값의 종류를 번호로 표현한것이다 
		// 장값의 번호는 1,2,3 총 3종류이다. 
		
		// 장갑은 몇쌍  만들수있는가?
		int arr[] = {1,2,1,3,2,1,2,1};
		
		// 번호1번 장갑 2쌍 
		// 번호2번 장갑 1쌍
		
		// 총 3쌍 
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		for(int i = 0; i < 8; i++) {
			if(arr[i] == 1) {
				c1 += 1;
			}
			else if(arr[i] == 2) {
				c2 += 1;
			}
			else if(arr[i] == 3) {
				c3 += 1;
			}
		}
		System.out.println("1번장갑 : " + c1 + "개");
		System.out.println("2번장갑 : " + c2 + "개");
		System.out.println("3번장갑 : " + c3 + "개");
		c1 = c1 / 2;
		c2 = c2 / 2;
		c3 = c3 / 2;
		System.out.println("1번장갑 : " + c1 + "쌍");
		System.out.println("2번장갑 : " + c2 + "쌍");
		System.out.println("3번장갑 : " + c3 + "쌍");
	}
}