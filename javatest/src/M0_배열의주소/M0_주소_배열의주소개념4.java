package M0_배열의주소;

public class M0_주소_배열의주소개념4 {
	public static void main(String[] args) {
		
		int [][] arr = {
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		
		//위와같은 각 열의 크기가 다른 2차원배열을 반복문으로 만들기
		
		int low = arr.length;
		int [][] test = new int[low][];
		int []list = new int[low];
		for(int i = 0; i < low; i++) {
			list[i] = arr[i].length;
		}
		for(int i = 0; i < low; i++) {
			int[] temp = new int[list[i]];
			for(int j =0; j < list[i]; j++) {
				temp[j] = arr[i][j];
			}
			test[i] = temp;
		}
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}