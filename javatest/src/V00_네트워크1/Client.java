package V00_��Ʈ��ũ1;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	private Socket clientSocket;
	private DataOutputStream dataOutputStream;
	
	public Client() {
		try {
			System.out.println("���� �õ�");
			clientSocket = new Socket(Server.ip, Server.port);					
			System.out.println("���� �Ϸ�");		
			dataOutputStream =
					new DataOutputStream(clientSocket.getOutputStream());
			
			String sendData = "Ŭ���̾�Ʈ���� ������ �޼���";
			dataOutputStream.writeUTF(sendData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
