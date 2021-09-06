package P0_클래스심화_level1;

class Test{
	int a;
}

public class P0_02_01_변수생명주기 {
	public static void main(String[] args) {
		int a = 10;
		int arr2[];
		{
			int b = 20;
			int arr[] = new int[3];
			Test t = new Test();
			
			arr2 = new int[3];
		}
		System.out.println("------------");
		
	}
}