package P3_파일입출력;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class P3_파일_03_파일입출력3 {
	public static void main(String[] args) {
		
		String[] names = { "김철수", "이만수", "이영희" };
		int[] ages = { 20, 30, 40 };

		String fileName = "src/P3_파일입출력/file03.txt";

		String data = "";
		int size = names.length;
		
		// 문제1) 김철수/20,이만수/30,이영희/40 
		//       이렇게 만들고 파일저장 
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
		
		// 문제2) 파일을 불러와서 아래 배열에 저장 
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