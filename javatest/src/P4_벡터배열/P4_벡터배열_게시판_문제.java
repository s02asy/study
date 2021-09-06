package P4_벡터배열;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Stack;

public class P4_벡터배열_게시판_문제 {
	/*
	 * # 콘솔 게시판
	 * 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다.
	 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수 있다.
	 * 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다.
	 * 4. 파일입출력을 통해 데이터가 저장된다.
	 * 5. 저장되어 있는 파일이 존재한다면, 파일을 불러오도록 설계한다.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        String fileName = "src/P4_벡터배열/board.txt";

		String[][] board = null;
		int count = 0;				// 전체 게시글 수
		int pageSize = 5;			// 한 페이지에 보여줄 게시글 수
		int curPageNum = 1;			// 현재 페이지 번호
		int pageCount = 0;			// 전체 페이지 개수
		int startRow = 0;			// 현재 페이지의 게시글 시작 번호
		int endRow = 0;				// 현재 페이지의 게시글 마지막 번호
		
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
			System.out.println("전체 게시글 수 : " + count);
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
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");
			System.out.println("[6]저장");
			System.out.println("[7]로드");

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
				System.out.println("제목 입력 : ");
				board[count][0] = scan.next();
				System.out.println("내용 입력 : ");
				board[count][1] = scan.next();
				count += 1;
			}
			else if(choice == 4) {
				System.out.println("삭제할 게시글 번호 입력 : ");
				int delnum = scan.nextInt();
				delnum -= 1;
				if(startRow > delnum || endRow <= delnum) {
					System.out.println("해당위치의 게시글 넘버가 아닙니다.");
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
				System.out.println("확인할 게시글 번호 입력 : ");
				int checknum = scan.nextInt();
				checknum -= 1;
				if(checknum < startRow || checknum >= endRow) {
					System.out.println("해당위치의 게시글 넘버가 아닙니다.");
					continue;
				}
				System.out.println("글 내 용");
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