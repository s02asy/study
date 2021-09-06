package V00_네트워크3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private Socket socket;
	
	Client() {
		
		setting();
		receive();
		send();
	}
	
	public void setting() {
		try {
			socket = new Socket(Server.ip, Server.port);
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
		}
	}
	
	public void receive() {
		new Thread(new Runnable() {
			boolean isThread = true;

			@Override
			public void run() {
				while (isThread) {
					try {
						String recvData = dataInputStream.readUTF();
						if (recvData.equals("/quit"))
							isThread = false;
						else
							System.out.println("[메세지] : " + recvData);
					} catch (Exception e) {
					}
				}
			}
		}).start();

	}
	public void send() {
		new Thread(new Runnable() {
			Scanner in = new Scanner(System.in);
			boolean isThread = true;
			@Override
			public void run() {
				while (isThread) {
					try {
						String sendData = in.nextLine();
						if (sendData.equals("/quit"))
							isThread = false;
						else
							dataOutputStream.writeUTF(sendData);
					} catch (Exception e) {
					}
				}
			}
		}).start();
	}
}
