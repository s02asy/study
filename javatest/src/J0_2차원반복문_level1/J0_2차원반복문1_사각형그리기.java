package J0_2차원반복문_level1;
public class J0_2차원반복문1_사각형그리기 {
	public static void main(String[] args) {
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		System.out.println();

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
		
}