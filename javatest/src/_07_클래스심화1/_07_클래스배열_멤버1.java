package _07_Ŭ������ȭ1;

class Member{
	int number;
	String id;
	String name;
	int score;
}

public class _07_Ŭ�����迭_���1 {
	public static void main(String[] args) {
		
		int numberList[] = {1001,1002,1003};
		String idList [] = {"qwer" , "asdf" ,"zxcv"};
		String nameList[] = {"��ö��" , "������" , "�̸���"};
		int scoreList[] = {10,3,30};
		
				
		//���� �� �����͸� �Ʒ�Ŭ�����迭�� ��ȯ�غ���
		Member[] memberList = null;
		int size = numberList.length;
		
		memberList = new Member[size];
		for(int i = 0; i < size; i++) {
			memberList[i] = new Member();
			memberList[i].number = numberList[i];
			memberList[i].id = idList[i];
			memberList[i].name = nameList[i];
			memberList[i].score = scoreList[i];
		}
		for(int i = 0; i < size; i++) {
			System.out.print(memberList[i].number + " ");
			System.out.print(memberList[i].id + " ");
			System.out.print(memberList[i].name + " ");
			System.out.println(memberList[i].score + " ");
		}
	}
}