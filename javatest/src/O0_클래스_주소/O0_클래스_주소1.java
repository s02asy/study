package O0_클래스_주소;

public class O0_클래스_주소1 {
	public static void main(String[] args) {
		// 변수 의 종류 (1)값저장 (2)주소저장 
		int a = 10;
		int [] arr;
		arr = new int[3];
		System.out.println(arr);
		
		int [] temp;
		temp = arr;
		
		//int[][] temp2;
		//temp2 = arr;
		
		int [][] darr = new int[3][];
		darr[0] = new int[3];
		
		int[][] temp2 = darr;
		
		
	}
}