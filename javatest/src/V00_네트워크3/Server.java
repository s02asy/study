package V00_��Ʈ��ũ3;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
	public static Vector<Node> nodeList = new Vector<>();
	ServerSocket serverSocket;
	public static String ip = "127.0.0.1";
	public static int port= 6677;
	
	Server(){
		serverSetting();
		run();
	}
	
	public void run() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						nodeList.add(new Node(socket));
						System.out.println("[Ŭ���̾�Ʈ ����]" + socket.getRemoteSocketAddress() + ":  "
								+ Thread.currentThread().getName());
					} catch (Exception e) {
					}
				}
			}
		}).start();
	}
	public void serverSetting() {
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ip, port));
			String msg = ""; 
			msg += "[��������]" + " " +  ip + " : " + port  + "\n";
			System.out.println(msg);
			
		} catch (Exception e) {

		}
	}

}
