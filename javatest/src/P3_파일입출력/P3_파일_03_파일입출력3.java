package P3_���������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class P3_����_03_���������3 {
	public static void main(String[] args) {
		
		String[] names = { "��ö��", "�̸���", "�̿���" };
		int[] ages = { 20, 30, 40 };

		String fileName = "src/P3_���������/file03.txt";

		String data = "";
		int size = names.length;
		
		// ����1) ��ö��/20,�̸���/30,�̿���/40 
		//       �̷��� ����� �������� 
		for(int i = 0; i < size; i++) {
			data += names[i];
			data += "/";
			data += ages[i];
			data += ",";
		}
		System.out.println(data);
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		
		
		
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ����2) ������ �ҷ��ͼ� �Ʒ� �迭�� ���� 
		data = "";
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			data = br.readLine();
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(data);
		
		String[] file1 = new String[size];
		int file2[] = new int[size];
		
		String [] tokens = data.split(",");
		
		for(int i = 0; i < size; i++) {
			String[] tokens2 = tokens[i].split("/");
			file1[i] = tokens2[0];
			file2[i] = Integer.parseInt(tokens2[1]) ;
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println(file1[i] + " " + file2[i]);
		}

	}
}