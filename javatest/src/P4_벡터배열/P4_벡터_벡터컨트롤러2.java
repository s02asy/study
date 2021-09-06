package P4_벡터배열;

import java.util.Scanner;

public class P4_벡터_벡터컨트롤러2 {
	
	// 2차원배열 컨트롤러
	
	// 데이터 저장 방식 : 번호 + 점수3개 
	// 예) {1001, 20, 30, 40};
	// 예) {1002, 40, 60, 60};
	// 예) {1003, 10, 20, 30};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] dataList = null;
		int count = 0;
		int num = 1001;
		while(true) {
			
			for(int i=0; i<count; i++) {
				for(int j= 0; j < dataList[i].length; j++) {
					System.out.print(dataList[i][j] + " ");
				}
				System.out.println();				
			}
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(학생번호)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count == 0) {
					dataList = new int[count + 1][];
				}else if(count > 0){
					int[][] temp = dataList;
					dataList = new int[count + 1][];
					
					for(int i=0; i<count; i++) {
						dataList[i] = temp[i];
					}
					
					temp = null;
				}
				dataList[count] = new int[4];
				dataList[count][0] = num; // 번호추가 
				num += 1;
				
				// 번호제외하고 다음부터 저장 
				for(int i = 1; i < 4; i++) {
					System.out.print("[추가]성적 입력 : ");
					int data = scan.nextInt();				
					dataList[count][i] = data;
				}
				count += 1;
			}
			else if(sel == 2) {
				System.out.println("[삭제]인덱스 입력 : ");
				int index = scan.nextInt();
				if(index < 0 || index > count - 1) {
					System.out.println("삭제할수 있는 범위가 아닙니다.");
					continue;
				}
				if(count == 1) {
					dataList = null;
				}else if(count > 1) {
					int temp[][] = dataList;
					dataList = new int[count - 1][];
					for(int i = 0; i < index; i++) {
						dataList[i] = temp[i];
					}
					for(int i = index; i < count - 1; i++) {
						dataList[i] = temp[i + 1];
					}
					temp = null;
				}
				count -= 1;
			}
			else if(sel == 3) {
				System.out.println("[삭제]학생번호 입력 : ");
				int hakbun = scan.nextInt();
				int delindex = -1;
				for(int i = 0; i < count; i++) {
					if(hakbun == dataList[i][0]) {
						delindex = i;
					}
				}
				if(delindex == -1) {
					System.out.println("학번을 찾을수 없습니다.");
					continue;
				}
				if(count == 1) {
					dataList = null;
				}else if(count > 1) {
					int temp[][] = dataList;
					dataList = new int[count - 1][];
					for(int i = 0; i < delindex; i++) {
						dataList[i] = temp[i];
					}
					for(int i = delindex; i < count - 1; i++) {
						dataList[i] = temp[i + 1];
					}
					temp = null;
				}
				count -= 1;
			}
			else if(sel == 4) {
				System.out.println("[삽입]인덱스 입력 : ");
				int index = scan.nextInt();
				if(index < 0 || count < index) {
					System.out.println("해당위치는 삽입할수 없습니다.");
					continue;
				}
				if(count == 0) {
					dataList = new int[count + 1][];
				}else if(count > 1) {
					int temp[][] = dataList;
					dataList = new int[count + 1][];
					int j = 0;
					for(int i = 0; i < count + 1; i++) {
						if(i != index) {
							dataList[i] = temp[j];
							j += 1;
						}
					}
					temp = null;
				}
				dataList[index] = new int[4];
				dataList[index][0] = num;
				num += 1;
				for(int i = 1; i < 4; i++) {
					System.out.println("성적 입력 : ");
					int score = scan.nextInt();
					dataList[index][i] = score;
				}
				count += 1;
			}
			else if(sel == 0) {
				break;
			}
		}

	}
}