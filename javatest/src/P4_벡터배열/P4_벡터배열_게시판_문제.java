package P4_���͹迭;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Stack;

public class P4_���͹迭_�Խ���_���� {
	/*
	 * # �ܼ� �Խ���
	 * 1. [����] �Ǵ� [����] ��ư�� ������ ������ ��ȣ�� ����ȴ�.
	 * 2. ���� ������ ��ȣ�� �ش�Ǵ� �Խñ۸� �� �� �ִ�.
	 * 3. 2���� �迭 board�� 0������ ������ 1������ �Խñ��� ������ �����Ѵ�.
	 * 4. ����������� ���� �����Ͱ� ����ȴ�.
	 * 5. ����Ǿ� �ִ� ������ �����Ѵٸ�, ������ �ҷ������� �����Ѵ�.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        String fileName = "src/P4_���͹迭/board.txt";

		String[][] board = null;
		int count = 0;				// ��ü �Խñ� ��
		int pageSize = 5;			// �� �������� ������ �Խñ� ��
		int curPageNum = 1;			// ���� ������ ��ȣ
		int pageCount = 0;			// ��ü ������ ����
		int startRow = 0;			// ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0;				// ���� �������� �Խñ� ������ ��ȣ
		
		while(true) {
			pageCount = count / pageSize;
			if(count % pageSize > 0) {
				pageCount += 1;
			}
			startRow = (curPageNum - 1) * pageSize;
			endRow = startRow + pageSize;
			if(endRow > count) {
				endRow = count;
			}
			System.out.println("��ü �Խñ� �� : " + count);
			for(int i = startRow; i < endRow; i++) {
				System.out.println("(" + (i + 1) + ")" + board[i][0]);
			}
			for(int i = 1; i < pageCount + 1; i++) {
				if(i == curPageNum) {
					System.out.print("[*]");
				}else {
					System.out.print("[" + i + "]");
				}
			}
			if(count > 0) {
				System.out.println();
			}
			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("[6]����");
			System.out.println("[7]�ε�");

			int choice = scan.nextInt();
			
			if(choice == 1) {
				if(curPageNum == 1) {
					continue;
				}
				curPageNum -= 1;
			}
			else if(choice == 2) {
				if(curPageNum >= pageCount) {
					continue;
				}
				curPageNum += 1;
			}
			else if(choice == 3) {
				if(count == 0) {
					board = new String[count + 1][2];
				}else if(count > 0) {
					String temp[][] = board;
					board = new String[count + 1][2];
					for(int i = 0; i < count; i++) {
						board[i] = temp[i];
					}
					temp = null;
				}
				System.out.println("���� �Է� : ");
				board[count][0] = scan.next();
				System.out.println("���� �Է� : ");
				board[count][1] = scan.next();
				count += 1;
			}
			else if(choice == 4) {
				System.out.println("������ �Խñ� ��ȣ �Է� : ");
				int delnum = scan.nextInt();
				delnum -= 1;
				if(startRow > delnum || endRow <= delnum) {
					System.out.println("�ش���ġ�� �Խñ� �ѹ��� �ƴմϴ�.");
					continue;
				}
				if(count == 1) {
					board = null;
				}else if(count > 1) {
					String temp[][] = board;
					board = new String[count - 1][2];
					int j = 0;
					for(int i = 0; i < count; i++) {
						if(i != delnum) {
							board[j] = temp[i];
							j += 1;
						}
					}
					temp = null;
				}
				count -= 1;
			}
			else if(choice == 5) {
				System.out.println("Ȯ���� �Խñ� ��ȣ �Է� : ");
				int checknum = scan.nextInt();
				checknum -= 1;
				if(checknum < startRow || checknum >= endRow) {
					System.out.println("�ش���ġ�� �Խñ� �ѹ��� �ƴմϴ�.");
					continue;
				}
				System.out.println("�� �� ��");
				System.out.println(board[checknum][1]);
			}
			else if(choice == 6) {
				String data = "";
				data += count;
				data += "\n";
				for(int i = 0; i < count; i++) {
					data += board[i][0];
					data += ",";
					data += board[i][1];
					data += "\n";
				}
				data = data.substring(0 , data.length() - 1);
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(choice == 7) {
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					String size = br.readLine();
					if(size != null) {
						count = Integer.parseInt(size);
					}
					String data = "";
					for(int i = 0; i < count; i++) {
						data += br.readLine();
						data += "\n";
					}
					data = data.substring(0, data.length() - 1);
					if(count > 0) {
						String tokens[] = data.split("\n");
						board = new String[count][2];
						for(int i = 0; i < count; i++) {
							String tokens2[] = tokens[i].split(",");
							board[i][0] = tokens2[0];
							board[i][1] = tokens2[1];
						}
					}
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}


	}
}