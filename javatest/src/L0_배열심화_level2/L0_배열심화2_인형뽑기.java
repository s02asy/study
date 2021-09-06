package L0_�迭��ȭ_level2;

import java.util.Arrays;

public class L0_�迭��ȭ2_�����̱� {
	public static void main(String[] args) {		
		int machine[][] = {
				{0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3},
		};
		int input[] = {1,0,0,3,3,4,4};
		/*
		 * �� �����ʹ� �����̱� ����� ������ �̴�. (7 x 5) ������
		 * [������ȣ] 
		 * [1 : ȣ����] [2 : ��] [3 : ����] [4 : �⸰]
		 * -------------------------------------------------
		 * [1] ���� 0 �� ����ִ°������Ѵ�.
		 * [2] ���� 0 �� �ƴѰ��� ������ �ִ°��� ���ϰ� �� ���ڴ� ������ȣ(1~4)�̴�.
		 * [3] input�� �����ʹ� ���� �մԵ��� ������ ������ �ε�����ȣ�̴�.
		 * [4] ���δ����� �Ѷ����̰�, �ε�����ȣ�� ���η� ������ �ȴ�. (�� 0~4������ ����)
		 * [5] ������ �����κ� ������������ �����Եȴ�. 
		 * ��) input ==> 1 ==> 2,1,4,1,1 �����̰� ������ 2�� 0�̵ȴ�.
		 * [6] ���࿡ ������ �������� ���� 0�� ������ �����ϰԵǸ�, "��" ��� 
		 * [7] ���� �Ǹŵ� ���� �̸��� ����Ͻÿ�. 
		 * ��) 
		 *    1 ==> [2:��]
		 *    0 ==> [3:����]
		 *    0 ==> [1:ȣ����]
		 *    3 ==> [3:����]
		 *    3 ==> [0:��]
		 *    4 ==> [3:����]
		 *    4 ==> [3:����]	 
		 *    
		 * [8](����) ���� �ѹ��� �Ǹŵ������� ������ ����Ͻÿ�. [�⸰]
		 */
		String animal[] = {"[0 : ��]","[1 : ȣ����]", "[2 : ��]", "[3 : ����]", "[4 : �⸰]"};
		int count[] = new int[animal.length];
		int inputid = 0;
		while(true) {
			for(int i = 0; i < machine.length; i++) {
				if(machine[i][input[inputid]] != 0) {
					System.out.println(animal[machine[i][input[inputid]]]);
					count[machine[i][input[inputid]]] += 1;
					machine[i][input[inputid]] = 0;
					break;
				}
				if(machine[machine.length - 1][input[inputid]] == 0) {
					System.out.println(animal[machine[machine.length - 1][input[inputid]]]);
					count[machine[machine.length - 1][input[inputid]]] += 1;
					break;
				}
			}
			inputid += 1;
			if(inputid == 7) {
				break;
			}
		}
		System.out.println(Arrays.toString(count));
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 0) {
				System.out.println("�Ǹŵ��� ���� ���� : " + animal[i]);
			}
		}
	}
}