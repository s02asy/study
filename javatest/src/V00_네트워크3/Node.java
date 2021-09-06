package V00_네트워크3;

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
						System.out.println("[메세지수신 성공]"  + 
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
