package L3_�迭����;

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
			//����������
			for(int i=0;i<width;i++) {
				board[a][b]=num;
				num+=1;
				b+=1;
			}
			b-=1;//size���� Ŀ���� �ٿ��ֱ�
			a+=1;//�����ٺ��� �����ؾ��ϴ� ����
			height-=1;//������ �� ���� ��ĭ�� ���̰� �پ��
			//�Ʒ���
			for(int i=0;i<height;i++) {
				board[a][b]=num;
				num+=1;
				a+=1;
			}
			a-=1;
			b-=1;
			width-=1;//������ �� ���� ��ĭ�� ���̰� �پ��
			//��������
			for(int i=0;i<width;i++) {
				board[a][b]=num;
				num+=1;
				b-=1;
			}
			b+=1;
			a-=1;
			height-=1;
			//����
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