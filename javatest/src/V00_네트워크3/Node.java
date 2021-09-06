package V00_��Ʈ��ũ3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Node {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public Node(Socket s) {
		
		setting(s);	
		receive();
		
	}
	
	public void setting(Socket s) {
		try {
			this.clientSocket = s;
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (Exception e) {
		}
	}
	
	public void receive() {
		new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						String recvData = dataInputStream.readUTF();
						System.out.println("[�޼������� ����]"  + 
								clientSocket.getRemoteSocketAddress() + ": " + 
										 Thread.currentThread().getName());
						for (Node client : Server.nodeList) {
							client.send(Thread.currentThread().getName() + ":" + recvData);
						}
					}
				} catch (Exception e) {}
			}
		}).start();
	}

	public void send(String message) {
		new Thread(new Runnable() {
			public void run(){
				try {
					dataOutputStream.writeUTF(message);
				}catch(Exception e) {}
			}
		}).start();
	}
}
