package V00_��Ʈ��ũ2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	public static String ip = "127.0.0.1";
	public static int port = 8765;

	public Server() {
		serverSetting();
		dataRead();
		dataSend();
	}

	void serverSetting() {
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ip, port));
			System.out.println("���� ����");
			clientSocket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
				clientSocket.close();
				dataInputStream.close();
				dataOutputStream.close();
			}catch (Exception e) {}
		}
	}

	void dataRead() {
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
							System.out.println("���� : " + recvData);

					} catch (Exception e) {
					}
				}
			}
		}).start();
	}

	void dataSend() {
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
