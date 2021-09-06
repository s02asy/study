package L1_�׽�Ʈ_�迭��ȭ_level2;

import java.util.Arrays;
import java.util.Scanner;

public class L1_�׽�Ʈ_�迭��ȭ2_Ƽ�� {

	/* [��ȭ���¼�����]
	 * (1)ȸ������ (2)�α���  (0) ����
	 * 
	 * [ȸ������] ==> id �� ���� ==> �ߺ�ó�� 
	 * [�α�����] ==> (1) �α׾ƿ� (2) ���� (3) ����Ȯ��(���ΰ͸� �¼���ȣ��� ) 
	 *             (4) �������(���ΰ͸�) (0) �ڷΰ��� 
	 *
	 * 1) ȸ�������� 20����� �����ϴ�.
	 * 2) idList ���� ȸ������ id�� ���� 
	 * 3) �α������� �¼��� �����ϸ� seatList �� �����ѻ���� id ������ 
	 * 4) checkList ���� �¼��� �����ߴ��� ���� 
	 * 
	 */
	public static void main(String[] args) {
		int max = 20;
		int idList[] = new int[max];
		int count = 0;
		int seatList[][]= new int[3][4];
		int seatList2[][]= new int[3][4];
		int checkList[][] = new int[3][4];
		Scanner scan = new Scanner(System.in);
		int num = 1;
		for(int i = 0; i < seatList.length; i++) {
			for(int j = 0; j < seatList[i].length; j++) {
				seatList[i][j] += num;
				seatList2[i][j] += num;
				num += 1;
			}
		}
		while(true) {
			System.out.println("(1)ȸ������ (2)�α���  (0) ����");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count == max) {
					System.out.println("���̻� ���� �Ұ�.");
					continue;
				}
				while(true) {
					System.out.println("���� id �Է� (3�ڸ� �̻�)");
					int id = scan.nextInt();
					boolean check = false;
					if(id >= 100) {
						for(int i = 0; i < idList.length; i++) {
							if(idList[i] == id) {
								check = true;
								break;
							}
						}
						if(check == false) {
							idList[count] = id;
							count += 1;
							System.out.println("ȸ�����ԿϷ�.");
							break;
						}else {
							System.out.println("�ߺ��� ���̵��Դϴ�.");
						}
					}else {
						System.out.println("���̵� 3�ڸ� �̻����� �Է����ּ���.");
					}
				}
			}
			else if(sel == 2) {
				System.out.println("���̵� �Է�");
				int id = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i < idList.length; i++) {
					if(idList[i] == id) {
						check = true;
						index = i;
						break;
					}
				}
				if(check == true) {
					System.out.println(idList[index] + "�� ȯ���մϴ�.");
					while(true) {
						System.out.println("(1) �α׾ƿ� (2) ���� (3) ����Ȯ��(���ΰ͸� �¼���ȣ���) (4) �������(���ΰ͸�) (0) �ڷΰ���");
						int sel2 = scan.nextInt();
						if(sel2 == 1) {
							System.out.println("�α׾ƿ�");
							break;
						}
						else if(sel2 == 2) {
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(checkList[i][j] == 0) {
										System.out.print("[ ]");
									}else {
										System.out.print("[X]");
									}
								}
								System.out.println();
							}
							System.out.println("�����Ͻ� �ڸ��� �������ּ���.");
							int sel3 = scan.nextInt();
							if(sel3 < 1 || sel3 > 12) {
								System.out.println("�¼� ��ȣ�� �ƴմϴ�.");
								continue;
							}
							int index1 = -1;
							int index2 = -1;
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList2[i][j] == sel3) {
										index1 = i;
										index2 = j;
										break;
									}
								}
							}
							if(checkList[index1][index2] == 0) {
								checkList[index1][index2] = 1;
								seatList[index1][index2] = idList[index];
								for(int i = 0; i < seatList.length; i++) {
									for(int j = 0; j < seatList[i].length; j++) {
										if(checkList[i][j] == 0) {
											System.out.print("[ ]");
										}else {
											System.out.print("[X]");
										}
									}
									System.out.println();
								}
								System.out.println("���� �Ϸ�.");
							}else {
								System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
							}
						}else if(sel2 == 3) {
							System.out.println(idList[index] + "���� ���� �¼��� Ȯ���մϴ�.");
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList[i][j] == idList[index]) {
										System.out.println(seatList2[i][j] + "����" + " ");
									}
								}
							}
						}else if(sel2 == 4) {
							System.out.println(idList[index] + "���� ���� �¼��� Ȯ���մϴ�.");
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList[i][j] == idList[index]) {
										System.out.println(seatList2[i][j] + "����" + " ");
									}
								}
							}
							System.out.println("����Ͻ� �¼� ��ȣ�� �Է����ּ���.");
							int sel3 = scan.nextInt();
							boolean check1 = false;
							int index1 = -1;
							int index2 = -1;
							for(int i = 0; i < seatList.length; i++) {
								for(int j = 0; j < seatList[i].length; j++) {
									if(seatList2[i][j] == sel3 && idList[index] == seatList[i][j]) {
										check1 = true;
										index1 = i;
										index2 = j;
										break;
									}
								}
							}
							if(check1 == true) {
								checkList[index1][index2] = 0;
								seatList[index1][index2] = sel3;
								System.out.println("��ҿϷ�.");
							}else {
								System.out.println(idList[index] + "���� �����Ͻ� �¼��� �ƴմϴ�.");
							}
						}else if(sel2 == 0) {
							System.out.println("�ڷΰ���");
							break;
						}
					}
				}else {
					System.out.println("���̵� Ȯ�����ּ���.");
				}
			}else if(sel == 0) {
				System.out.println("����");
				break;
			}
		}
		
	}

}