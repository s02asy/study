package _04_���ڿ�;

public class _04_02_���ڿ�1 {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String[] tokens;
		int user = 1003;
				
		/*
		 * 1) userData �� �ִ� �����͸� split �� �̿��� tokens �� ������ 
		 * 2) user �� �ִ� ���� ���ؼ� ���� ������ "o" , ������ "x";
		 * 
		 */
		tokens = userData.split(",");
		for(int i = 0; i < tokens.length; i++) {
			if(tokens[i].equals(String.valueOf(user))) {
				System.out.println(tokens[i] + " : o");
			}else {
				System.out.println(tokens[i] + " : x");
			}
		}
	}
}