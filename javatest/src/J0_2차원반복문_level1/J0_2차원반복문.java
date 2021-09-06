package J0_2차원반복문_level1;

public class J0_2차원반복문 {
	public static void main(String[] args) {
		// 중첩 if문 처럼 중첩 반복문이 있다.
		// 반복문 2개를 사용해서 직사각형의 데이터를 표현할수있다.
		// 1) 첫번째  반복문 (i) 가 세로를 담당한다.
		// 2) 두번째  반복문 (j) 가 가로를 담당한다.
		
		for(int i=0; i<4; i++) { 
			for(int j=0; j<3; j++) {
				System.out.println("[i] = " + i + " [j] = " + j);
			}
		}
		
	}
		

}