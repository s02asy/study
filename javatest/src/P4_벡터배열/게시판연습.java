package P4_벡터배열;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class 게시판연습 {
	public static void main(String[] args) {
		String board[][] = null;
		Scanner scan = new Scanner(System.in);
		String filename = "src/P4_벡터배열/test.txt";
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
			System.out.println("전체 글 개수 : " + count);
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
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");
			System.out.println("[6]저장");
			System.out.println("[7]로드");
			System.out.println("[0]종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(NowPage > 1) {
					NowPage -= 1;
				}else {
					System.out.println("첫번째 페이지 입니다.");
				}
			}else if(sel == 2) {
				if(NowPage < PageCount) {
					NowPage += 1;
				}else {
					System.out.println("마지막 페이지 입니다.");
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
				System.out.println("제목을 입력하세요.");
				String title = scan.next();
				System.out.println("내용을 입력하세요.");
				String in = scan.next();
				board[count][0] = title;
				board[count][1] = in;
				count += 1;
			}else if(sel == 4) {
				System.out.println("삭제할 글번호를 입력하세요");
				int choice = scan.nextInt();
				choice -= 1;
				if(choice < Start || choice >= Last) {
					System.out.println("현재 페이지에 없는 번호입니다.");
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
				System.out.println("확인할 글번호를 입력하세요");
				int choice = scan.nextInt();
				choice -= 1;
				if(choice < Start || choice >= Last) {
					System.out.println("현재 페이지에 없는 번호입니다.");
					continue;
				}
				System.out.println("(" + (choice + 1) + ")" + board[choice][1]);
			}else if(sel == 6) {
				if(count == 0) {
					System.out.println("저장할 데이터가 없습니다.");
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
