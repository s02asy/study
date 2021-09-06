package P0_변수테스트;
class User{
	String name;
	int score;
	void printUser() {
		System.out.println(name + " " + score);
	}
}
class UserDAO{
	User[] userList;
	void printList() {
		for(int i = 0; i < userList.length; i++) {
			userList[i].printUser();
		}
	}
}
class UserManager{
	UserDAO userDAO;	
	void printDAO() {		
		userDAO.printList();
	}
}
public class P0_01_변수의종류2 {
	public static void main(String[] args) {
		String [] nameList = {"aa" , "bb"};
		int [] scoreList = {10,20};
		System.out.println("----------------------------");
		User[] userList = new User[2];
		for(int i = 0; i < 2; i++) {
			userList[i] = new User();
			userList[i].name = nameList[i];
			userList[i].score = scoreList[i];
		}	
		System.out.println("---------------------------");
		UserDAO userDAO = new UserDAO();
		userDAO.userList = new User[2];
		for(int i = 0; i < 2; i++) {
			userDAO.userList[i] = new User();
			userDAO.userList[i].name = nameList[i];
			userDAO.userList[i].score = scoreList[i];
		}	
		UserManager um = new UserManager();
		um.userDAO = userDAO;
		um.printDAO();
		
	}
}