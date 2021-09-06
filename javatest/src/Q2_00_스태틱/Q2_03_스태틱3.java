package Q2_00_����ƽ;

import java.util.Vector;

class Client{	
	private int number;
	private String name;
}
class StaticClientDAO{
	static Vector<Client> clientList = new Vector<Client>();	
	static void addClient(Client c) {
		clientList.add(c);
	}	
}

class ClientDAO{
	Vector<Client> clientList = new Vector<Client>();
	void addClient(Client c) {
		clientList.add(c);
	}	
}

public class Q2_03_����ƽ3 {
public static void main(String[] args) {
		
		// static Ȱ�� (2) DAO�� static ���� ����� ���ϴ�.
		for(int i = 0; i < 10; i++) {
			StaticClientDAO.addClient(new Client());
		}
		
		System.out.println("-----------------------------------");		
		ClientDAO clientDAO = new ClientDAO();	
		for(int i = 0; i < 10; i++) {
			clientDAO.addClient(new Client());
		}
		
	}
}