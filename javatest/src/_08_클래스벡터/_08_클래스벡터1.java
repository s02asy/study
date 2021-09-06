package _08_클래스벡터;
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
public class _08_클래스벡터1 {
	public static void main(String[] args) {
		// 1. 클래스 안의 배열 
		// 2. 클래스 배열 		
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
		// 실제로 사용하지않는다, 다만 클래스배열 직전에 클래스 연습을 위해서 연습한것
	}
	
}