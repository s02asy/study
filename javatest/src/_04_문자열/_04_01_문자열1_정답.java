package _04_���ڿ�;

public class _04_01_���ڿ�1_���� {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc"};
		
		String find = "aaaa";
		
		/*
		 * 1) id[] ��  ���̵� �����س��� �迭�̴�.
		 * 2) find ��  �α����� ���̵� �̴�.
		 * 3) find �� ���� id[] �� ������ "o" , ������ "x" ���.
		 */
		boolean check = false;
		for(int i = 0; i < id.length; i++) {
			if(find.equals(id[i])) {
				System.out.println("o");
				check = true;
			}
		}
		
		if(check == false) {
			System.out.println("x");
		}
	}
}