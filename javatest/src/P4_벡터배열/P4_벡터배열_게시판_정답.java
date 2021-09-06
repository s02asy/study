package P4_���͹迭;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

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
		

		while (true) {

			pageCount = count / pageSize;
			if (count % pageSize > 0) {
				pageCount += 1;
			}

			startRow = (curPageNum - 1) * pageSize; // 0���� ����
			endRow = startRow + pageSize; // �̸�
			if (endRow > count) {
				endRow = count;
			}

			System.out.println("�Խ��� (" + count + ")��");
			System.out.println("���� ������ : " + curPageNum);
			for (int i = startRow; i < endRow; i++) {
				System.out.println("(" + (i + 1) + ")" + board[i][0]);
			}
			System.out.println();

			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]�߰��ϱ�");
			System.out.println("[4]�����ϱ�");
			System.out.println("[5]����Ȯ��");
			System.out.println("[6]����");
			System.out.println("[7]�ε�");

			int choice = scan.nextInt();

			if (choice == 1) {
				if (curPageNum == 1) {
					continue;
				}
				curPageNum -= 1;
			} else if (choice == 2) {
				if (curPageNum >= pageCount) {
					continue;
				}
				curPageNum += 1;
			} else if (choice == 3) {
				if (count == 0) {
					board = new String[count + 1][2];
				} else if (count > 0) {
					String[][] temp = board;

					board = new String[count + 1][2];
					for (int i = 0; i < count; i++) {
						board[i] = temp[i];
					}
					temp = null;
				}

				System.out.print("�Խñ� ������ �Է��ϼ��� : ");
				board[count][0] = scan.next();

				System.out.print("�Խñ� ������ �Է��ϼ��� : ");
				board[count][1] = scan.next();

				count += 1;

				
			} else if (choice == 4) {
				System.out.print("������ �Խñ� ��ȣ�� �Է��ϼ��� : ");
				int num = scan.nextInt();
				num -= 1;

				if (endRow <= num || num < startRow) {
					System.out.println("�ش� ��ġ�� �Խñ��� ������ �� �����ϴ�.");
					continue;
				}

				if (count == 1) {
					board = null;
				} else if (count > 1) {
					String[][] temp = board;

					board = new String[count - 1][2];
					int j = 0;
					for (int i = 0; i < count; i++) {
						if (i != num) {
							board[j] = temp[i];
							j += 1;
						}
					}
					temp = null;
				}
				count -= 1;

				
			} else if (choice == 5) {
				System.out.print("�Խñ� ��ȣ�� �Է��ϼ��� : ");
				int num = scan.nextInt();
				num -= 1;

				if (startRow <= num && num < endRow) {
					System.out.println("���� = " + board[num][1]);
				}
			} else if(choice == 6) {
				// # ���� �����ϱ�
				String data = "";
				data += count;
				data += "\n";

				for (int i = 0; i < count; i++) {
					data += board[i][0];
					data += "/";
					data += board[i][1];
					if (i != count - 1) {
						data += "\n";
					}
				}

				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				} 
				
			} else if(choice == 7) {
				// ���� �ε�
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
					for (int i = 0; i < count; i++) {
						data += br.readLine();
						if (i != count - 1) {
							data += "\n";
						}
					}

					if (count > 0) {
						String[] info = data.split("\n");
						board = new String[count][2];

						for (int i = 0; i < info.length; i++) {
							String[] temp = info[i].split("/");
							board[i][0] = temp[0];
							board[i][1] = temp[1];
						}
					}
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				} 

			} else if(choice == 0) {
				break;
			} 
		}

		scan.close();
	}
}