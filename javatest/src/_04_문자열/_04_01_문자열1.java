package _04_���ڿ�;

public class _04_01_���ڿ�1 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc"};
		
		String find = "asdf";
		
		/*
		 * 1) id[] ��  ���̵� �����س��� �迭�̴�.
		 * 
		 * 2) find ��  �α����� ���̵� �̴�.
		 * 
		 * 3) find �� ���� id[] �� ������ "o" , ������ "x" ���.
		 * 
		 * 
		 */
		for(int i = 0; i < id.length; i++) {
			if(id[i].equals(find)) {
				System.out.println(id[i] + " : o");
			}else {
				System.out.println(id[i] + " : x");
			}
		}
	}
}