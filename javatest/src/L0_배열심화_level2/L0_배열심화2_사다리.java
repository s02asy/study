package L0_�迭��ȭ_level2;
import java.util.Arrays;
import java.util.Scanner;
public class L0_�迭��ȭ2_��ٸ� {
/*
 * # ��ٸ� ����
 * 1. �ε��� 0~4�� �ϳ������Ѵ�. (���ΰ����� 5��)
 * 2. ���� 0 �� ������ �׳� �Ʒ��� ��������.
 * 3. ���� 1 �� ������ ���������� �̵��� ��������.
 * 4. ���� 2 �� ������ �������� �̵��� ��������.
 * 5. ������ �޴� ��� 
 * 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{0,0,0,0,0}};
		System.out.println("=== �� �� �� ===");
		for(int i = 0 ; i < ladder.length; i++) {
			System.out.println(Arrays.toString(ladder[i]));
		}
		System.out.println("�ε��� 0~4�� �ϳ� ����");
		int sel = scan.nextInt();
		for(int i = 0; i < ladder.length; i++) {
			if(ladder[i][sel] == 1) {
				sel += 1;
			}else if(ladder[i][sel] == 2) {
				sel -= 1;
			}
		}
		System.out.println(menu[sel]);
	}
}