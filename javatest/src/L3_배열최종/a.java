package L3_배열최종;

import java.util.Arrays;

public class a {

	public static void main(String[] args) {
		int size=5;
		int board[][]=new int[size][size];
		int num=1;
		int last=size*size;
		int a=0,b=0;
		int width=size;
		int height=size;
		while(num<=last) {
			//오른쪽으로
			for(int i=0;i<width;i++) {
				board[a][b]=num;
				num+=1;
				b+=1;
			}
			b-=1;//size보다 커져서 줄여주기
			a+=1;//다음줄부터 저장해야하니 증가
			height-=1;//한줄이 꽉 차서 빈칸의 높이가 줄어듬
			//아래로
			for(int i=0;i<height;i++) {
				board[a][b]=num;
				num+=1;
				a+=1;
			}
			a-=1;
			b-=1;
			width-=1;//한줄이 꽉 차서 빈칸의 넓이가 줄어듬
			//왼쪽으로
			for(int i=0;i<width;i++) {
				board[a][b]=num;
				num+=1;
				b-=1;
			}
			b+=1;
			a-=1;
			height-=1;
			//위로
			for(int i=0;i<height;i++) {
				board[a][b]=num;
				num+=1;
				a-=1;
			}
			a+=1;
			b+=1;
			width-=1;
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.printf("[%3d]",board[i][j]);
			}
			System.out.println();
		}
	}
}