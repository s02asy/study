package V00_≥◊∆Æøˆ≈©4;

import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Vector;

public class Server {
	static Random ran = new Random();
	public static Vector<Node> nodeList = new Vector<>();
	ServerSocket serverSocket;
	public static String ip = "127.0.0.1";
	public static int port = 6677;
		
	private static Vector<String> quizList = new Vector<String>();
	public static String currentQuiz = "";
	private DataOutputStream dataOutputStream;
	
	Server() {
		serverSetting();
		quizSetting();	
		setNextQuiz();
		run();
	}
	public static boolean checkResult(String word) {
		if(word.equals(currentQuiz)) {		
			return true;
		}else {
			return false;
		}
	}
	
	public static String getNextQuiz() {		
		currentQuiz = quizList.get(ran.nextInt(quizList.size()));	
		return currentQuiz;
	}
	
	
	public static void setNextQuiz() {	
		currentQuiz = quizList.get(ran.nextInt(quizList.size()));
	}
	
	public synchronized static void setMsg(String msg) {
		for(Node node : nodeList) {
			node.send(msg);
		}		
	}
	
	public void run() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						dataOutputStream = new DataOutputStream(socket.getOutputStream());
						nodeList.add(new Node(socket));
						System.out.println("[?Å¥?ùº?ù¥?ñ∏?ä∏ ?†ë?Üç]" + socket.getRemoteSocketAddress() + ":  "
								+ Thread.currentThread().getName());
						
						String quiz = getNextQuiz();
						dataOutputStream.writeUTF(quiz);
						
					} catch (Exception e) {
					}
				}
			}
		}).start();
	}
	public void quizSetting() {
		quizList.clear();
		String sample[] = { "java", "spring", "jsp",  "html", "css" };
		for (int i = 0; i < sample.length; i++) {
			quizList.add(sample[i]);
		}		
	}
	public void serverSetting() {
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(ip, port));
			String msg = "";
			msg += "[?ÑúÎ≤ÑÏãú?ûë]" + " " + ip + " : " + port + "\n";
			System.out.println(msg);
		} catch (Exception e) {

		}
	}

}
