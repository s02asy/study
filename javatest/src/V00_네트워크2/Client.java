package V00_네트워크2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public Client() {
		connect();
		send();
		receive();
	}

	public void connect() {
		try {
			System.out.println("접속 시도");
			clientSocket = new Socket(Server.ip , Server.port);
			System.out.println("접속 완료");

			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());

		} catch (Exception e) {
			e.printStackTrace();
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
							System.out.println("상대방 : " + recvData);
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
