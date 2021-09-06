package P4_���͹迭;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class �Խ��ǿ��� {
	public static void main(String[] args) {
		String board[][] = null;
		Scanner scan = new Scanner(System.in);
		String filename = "src/P4_���͹迭/test.txt";
		int count = 0;
		int NowPage = 1;
		int PageSize = 5;
		int PageCount = 0;
		int Start = 0;
		int Last = 0;
		
		while(true) {
			PageCount = count / PageSize;
			if(count % PageSize > 0) {
				PageCount += 1;
			}
			Start = (NowPage - 1) * PageSize;
			Last = Start + PageSize;
			if(Last > count) {
				Last = count;
			}
			System.out.println("��ü �� ���� : " + count);
			for(int i = Start; i < Last; i++) {
				System.out.println("(" + (i + 1) + ")" + board[i][0]);
			}
			for(int i = 1; i <= PageCount; i++) {
				if(i == NowPage) {
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
			System.out.println("[0]����");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(NowPage > 1) {
					NowPage -= 1;
				}else {
					System.out.println("ù��° ������ �Դϴ�.");
				}
			}else if(sel == 2) {
				if(NowPage < PageCount) {
					NowPage += 1;
				}else {
					System.out.println("������ ������ �Դϴ�.");
				}
			}else if(sel == 3) {
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
				System.out.println("������ �Է��ϼ���.");
				String title = scan.next();
				System.out.println("������ �Է��ϼ���.");
				String in = scan.next();
				board[count][0] = title;
				board[count][1] = in;
				count += 1;
			}else if(sel == 4) {
				System.out.println("������ �۹�ȣ�� �Է��ϼ���");
				int choice = scan.nextInt();
				choice -= 1;
				if(choice < Start || choice >= Last) {
					System.out.println("���� �������� ���� ��ȣ�Դϴ�.");
					continue;
				}
				if(count == 1) {
					board = null;
				}else if(count > 1) {
					String temp[][] = board;
					board = new String[count - 1][2];
					int index = 0;
					for(int i = 0; i < count; i++) {
						if(choice != i) {
							board[index] = temp[i];
							index += 1;
						}
					}
					temp = null;
				}
				count -= 1;
			}else if(sel == 5) {
				System.out.println("Ȯ���� �۹�ȣ�� �Է��ϼ���");
				int choice = scan.nextInt();
				choice -= 1;
				if(choice < Start || choice >= Last) {
					System.out.println("���� �������� ���� ��ȣ�Դϴ�.");
					continue;
				}
				System.out.println("(" + (choice + 1) + ")" + board[choice][1]);
			}else if(sel == 6) {
				if(count == 0) {
					System.out.println("������ �����Ͱ� �����ϴ�.");
					continue;
				}
				String data = "";
				if(count > 0) {
					data += count;
					data += "\n";
				}
				for(int i = 0; i < count; i++) {
					data += board[i][0];
					data += "/";
					data += board[i][1];
					if(i != count - 1) {
						data += "\n";
					}
				}
				FileWriter fw = null;
				try {
					fw = new FileWriter(filename);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if(sel == 7) {
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader(filename);
					br = new BufferedReader(fr);
					String size = br.readLine();
					if(size != null) {
						count = Integer.parseInt(size);
					}
					board = new String[count][2];
					for(int i = 0; i < count; i++) {
						String tokens[] = br.readLine().split("/");
						board[i][0] = tokens[0];
						board[i][1] = tokens[1];
					}
					fr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}
