package O0_클래스;

import java.util.Arrays;
import java.util.Scanner;

class Test05{	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class O0_05_클래스문제3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test05 mega = new Test05();
		mega.name = "성적확인";
		while(true) {
			System.out.println("=== " + mega.name + " ===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.학번으로성적확인하기");
			System.out.println("5.종료하기");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println(Arrays.toString(mega.arHakbun));
				System.out.println(Arrays.toString(mega.arScore));
			}else if(sel == 2) {
				int max = 0;
				int id = 0;
				for(int i = 0; i < mega.arScore.length; i++) {
					if(max < mega.arScore[i]) {
						max = mega.arScore[i];
						id = i;
					}
				}
				System.out.println(mega.arHakbun[id]);
				System.out.println(mega.arScore[id]);
			}else if(sel == 3) {
				int min =  mega.arScore[0];
				int id = 0;
				for(int i = 0; i < mega.arScore.length; i++) {
					if(min > mega.arScore[i]) {
						min = mega.arScore[i];
						id = i;
					}
				}
				System.out.println(mega.arHakbun[id]);
				System.out.println(mega.arScore[id]);
			}else if(sel == 4) {
				System.out.println("학번 입력 : ");
				int hakbun = scan.nextInt();
				for(int i = 0; i < mega.arHakbun.length; i++) {
					if(hakbun == mega.arHakbun[i]) {
						System.out.println(mega.arScore[i]);
					}
				}
			}else if(sel == 5) {
				System.out.println("종료.");
				scan.close();
				break;
			}
		}
	}
}