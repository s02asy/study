package _05_���ڿ���ȭ;

public class _05_01_���ڿ���ȭ1 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc"};
		int score[] = {100,23,43};
		
		String data = "";
		
		/*
		 * 1) id �� score �� data �� ���� 
		 * 2) �����ڴ� / �� , �� �̿��Ѵ�. 
		 * 
		 * 	- ��) "qwer/100,asdf/23,zxc/43"
		 * 
		 */
		for(int i = 0; i < id.length; i++) {
			data += id[i];
			data += "/";
			data += String.valueOf(score[i]);
			data += ",";
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
	}
}