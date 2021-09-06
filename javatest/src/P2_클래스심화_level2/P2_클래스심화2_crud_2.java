package P2_클래스심화_level2;
import java.util.Scanner;
class Client{
	String id;
	String name;
}

class ClientDAO{
	Client[] clientList = new Client[100];
	int clientCount = 0;
	
	void insertClient(Client client) {
		clientList[clientCount] = client;
		clientCount += 1;
	}
	void removeClient(String id) {
		int index = -1;
		for(int i = 0; i < clientCount; i++) {
			if(clientList[i].id.equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("삭제없음");
		}else {
			for(int i = index; i < clientCount -1; i++) {
				clientList[i] = clientList[i + 1];
			}
			clientCount -= 1;
		}
	}
	void printClintList() {
		for(int i = 0; i < clientCount; i++) {
			System.out.println(clientList[i].id + " " +clientList[i].name);
		}
	}
}

public class P2_클래스심화2_crud_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClientDAO clientDAO = new ClientDAO();	
		while(true) {
			System.out.println("[1]추가 [2]삭제 [3]출력 [0]종료");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("아이디 입력 : ");
				String id = scan.next();
				System.out.println("이름 입력 : ");
				String name = scan.next();
				
				Client client = new Client();
				client.id = id;
				client.name = name;
				clientDAO.insertClient(client);
				
			}else if(sel == 2){
				System.out.println("아이디입력 : ");
				String id = scan.next();
				clientDAO.removeClient(id);
			}else if(sel == 3) {
				clientDAO.printClintList();
			}
		}		
	}
}