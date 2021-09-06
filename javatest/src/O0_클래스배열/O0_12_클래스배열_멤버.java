package O0_Å¬·¡½º¹è¿­;

class Member{
	int number; String id; String name; int score;
}
public class O0_12_Å¬·¡½º¹è¿­_¸â¹ö {
	public static void main(String[] args) {
		
		String data = "1001/qwer/±èÃ¶¼ö/10";		
		String arr[] = {"1001" , "qwer" , "±èÃ¶¼ö" , "10"};
		
		Member member = new Member();
		member.number = 1001;
		member.id = "qwer";
		member.name = "±èÃ¶¼ö";
		member.score = 10;
				
		String arr2[][] ={
				{"1001" , "qwer" , "±èÃ¶¼ö" , "10"},
				{"1001" , "qwer" , "±èÃ¶¼ö" , "10"},
		};
		
		Member[] memberList = new Member[2];
		memberList[0] = new Member();
		memberList[1] = new Member();
		
	}
}
