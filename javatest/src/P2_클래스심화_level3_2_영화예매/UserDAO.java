package P2_클래스심화_level3_2_영화예매;

public class UserDAO {
	User[] userList; 
	int userCount;
	
	void init() {
		String userData = "qwer/1234,asdf/4321";
		String[] userTokens = userData.split(",");
		userCount = userTokens.length;
		userList = new User[userCount];
		for(int i = 0; i < userList.length; i++) {
			userList[i] = new User();
			String[] userTokens2 = userTokens[i].split("/");
			userList[i].setData(userTokens2[0], userTokens2[1]);
		}
	}
	
	void printUserList() {
		for(int i = 0; i < userCount; i++) {
			System.out.println(userList[i].id + " " + userList[i].pw);
		}
	}
	
	String checkLog(String id , String pw) {
		for(int i = 0; i < userCount; i++) {
			if(userList[i].checkLog(id, pw)) {				
				return id;
			}
		}	
		return null;
	}	
}
