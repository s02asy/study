package K3_�׽�Ʈ_�迭��ȭ_level1;

import java.util.Arrays;

public class K3_�׽�Ʈ_�迭��ȭ1_��ǲ�����̵� {
	public static void main(String[] args) {
		
		// [�����̵�����]
		
		// [1] 8�� �÷��̾��̴�
		// [2] 0�� �̵��Ҽ��ִ� ���̴�.
		// [3] 1�� �̵��Ҽ����� ���̴�. 
		int move[] = {1,0,0,0,8,0,0,0,1};
		int player = 4;
		int input[] = {1,1,1,1,2,2,2};
		
		// input �迭�� ������ ���������� �����Ͻÿ�.
		// input�ǰ��� 1�� �����̵� , 2�� �������̵��̴�. 
		// ������ �̵��ϸ� ==> "�̵��Ҽ������ϴ�" ��� 
		
		// ����ȭ�� ==> {1,0,0,0,8,0,0,0,1};
		// 1 ==> {1,0,0,8,0,0,0,0,1};
		// 1 ==> {1,0,8,0,0,0,0,0,1};
		// 1 ==> {1,8,0,0,0,0,0,0,1};
		// 1 ==> "�̵��Ҽ������ϴ�"
		// 2 ==> {1,0,8,0,0,0,0,0,1};
		// 2 ==> {1,0,0,8,0,0,0,0,1};
		// 2 ==> {1,0,0,0,8,0,0,0,1};
		
		System.out.print("����ȭ�� == >");
		System.out.println(Arrays.toString(move));
		for(int i = 0; i < input.length; i ++) {
			if(input[i] == 1) {
				System.out.print(input[i] + " ==> ");
				player -= 1;
				if(move[player] != 1) {
					move[player] = 8;
					move[player + 1] = 0;
					System.out.println(Arrays.toString(move));
				}
				else {
					player += 1;
					System.out.print("�̵��Ҽ������ϴ�.");
					System.out.println();
				}
			}
			else if(input[i] == 2) {
				System.out.print(input[i] + " ==> ");
				player += 1;
				if(move[player] != 1) {
					move[player] = 8;
					move[player - 1] = 0;
					System.out.println(Arrays.toString(move));
				}
			}
		}
	}
}