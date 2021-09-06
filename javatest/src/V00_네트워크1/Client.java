package V00_네트워크1;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	private Socket clientSocket;
	private DataOutputStream dataOutputStream;
	
	public Client() {
		try {
			System.out.println("접속 시도");
			clientSocket = new Socket(Server.ip, Server.port);					
			System.out.println("접속 완료");		
			dataOutputStream =
					new DataOutputStream(clientSocket.getOutputStream());
			
			String sendData = "클라이언트에서 보내는 메세지";
			dataOutputStream.writeUTF(sendData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
