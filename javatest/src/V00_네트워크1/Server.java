package V00_��Ʈ��ũ1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	public static int port = 9876;
	public static String ip = "127.0.0.1";
	Server() {
		try {			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ip , port));
			System.out.println("���� ����");
			
			clientSocket = serverSocket.accept();
			 System.out.println("Ŭ���̾�Ʈ ���� ����");
			
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
			String recvData = dataInputStream.readUTF();
			System.out.println("���� : " + recvData);

		} catch (Exception e) {
		} finally {
			try {
				serverSocket.close();
				clientSocket.close();
				dataInputStream.close();
				dataOutputStream.close();
			}catch (Exception e) {}
		}
	}
}
