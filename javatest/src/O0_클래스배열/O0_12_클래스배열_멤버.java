package O0_Ŭ�����迭;

class Member{
	int number; String id; String name; int score;
}
public class O0_12_Ŭ�����迭_��� {
	public static void main(String[] args) {
		
		String data = "1001/qwer/��ö��/10";		
		String arr[] = {"1001" , "qwer" , "��ö��" , "10"};
		
		Member member = new Member();
		member.number = 1001;
		member.id = "qwer";
		member.name = "��ö��";
		member.score = 10;
				
		String arr2[][] ={
				{"1001" , "qwer" , "��ö��" , "10"},
				{"1001" , "qwer" , "��ö��" , "10"},
		};
		
		Member[] memberList = new Member[2];
		memberList[0] = new Member();
		memberList[1] = new Member();
		
	}
}
