package _07_Ŭ������ȭ2;

import javax.xml.crypto.Data;

class Student {
	int number;
	String id;
	String name;
	int score;
}
class StudentDAO {
	Student[] stList;
	
	void print() {
		for(int i = 0; i < stList.length; i++) {
			System.out.print(stList[i].number + " ");
			System.out.print(stList[i].id + " ");
			System.out.print(stList[i].name + " ");
			System.out.println(stList[i].score + " ");
		}
	}
}

public class _07_Ŭ�����迭_���2 {
	public static void main(String[] args) {
		String data = "";
		data += "1001,qwer,��ö��,10\n";
		data += "1002,asdf,������,3\n";
		data += "1003,zxcv,�̸���,30";

		System.out.println(data);
		// �� �����͸� StudentDAO �� ������ ���
		
		String tokens[] = data.split("\n");
		int size = tokens.length;
		
		StudentDAO DAO = new StudentDAO();
		DAO.stList = new Student[size];
		
		for(int i = 0; i < size; i++) {
			String tokens2[] = tokens[i].split(",");
			DAO.stList[i] = new Student();
			DAO.stList[i].number = Integer.parseInt(tokens2[0]);
			DAO.stList[i].id = tokens2[1];
			DAO.stList[i].name = tokens2[2];
			DAO.stList[i].score = Integer.parseInt(tokens2[3]);
		}
		DAO.print();
	}
}