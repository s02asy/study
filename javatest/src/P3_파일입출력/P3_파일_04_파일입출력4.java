package P3_���������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class P3_����_04_���������4 {
	public static void main(String[] args) {
		String[] names = { "momk", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };
		String fileName = "src/P3_���������/file04.txt";
		String data = "";
		int size = names.length;
		//  ����1)  �������͸� �Ʒ��Ͱ��� ����.
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		for(int i = 0; i < size; i++) {
			data += names[i];
			data += "/";
			data += pws[i];
			data += "/";
			data += moneys[i];
			data += "\n";
		}
		
		System.out.println(data);
		data = data.substring(0, data.length()-1);
		System.out.println(data);	
		
		System.out.println("-----------------------------");
		
		try {
			FileWriter fw =new FileWriter(fileName);
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
			String temp = br.readLine();
			while(temp != null) {
				data += temp;
				data += "\n";
				temp = br.readLine();
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(data);
		data = data.substring(0 , data.length()-1);
		System.out.println(data);
		
		String[] file1 = new String[size];
		String[] file2 = new String[size];
		int[] file3 = new int[size];
		
		String tokens[] = data.split("\n");
		for(int i = 0; i < size; i++) {
			String tokens2[] = tokens[i].split("/");
			file1[i] = tokens2[0];
			file2[i] = tokens2[1];
			file3[i] = Integer.parseInt(tokens2[2]);
		}
		
		System.out.println(Arrays.toString(file1));
		System.out.println(Arrays.toString(file2));
		System.out.println(Arrays.toString(file3));
	}
}