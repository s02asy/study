package _08_Ŭ��������;
class StudentDAO{
	int[] numberList;
	int[] scoreList;
}
class User{
	int number;
	int score;
}
class UserDAO{
	User[] userList;
}
public class _08_Ŭ��������1 {
	public static void main(String[] args) {
		// 1. Ŭ���� ���� �迭 
		// 2. Ŭ���� �迭 		
		int scoreList[] = {10,34,2};
		int numberList[] = {1001,1002,1003};
		
		StudentDAO stDAO = new StudentDAO();
		stDAO.numberList = new int[scoreList.length];
		stDAO.scoreList = new int[numberList.length];
		
		for(int i = 0; i < scoreList.length; i++) {
			stDAO.numberList[i] = numberList[i];
			stDAO.scoreList[i] = scoreList[i];
		}
		System.out.println("---------------------------------");	
		// ������ ��������ʴ´�, �ٸ� Ŭ�����迭 ������ Ŭ���� ������ ���ؼ� �����Ѱ�
	}
	
}