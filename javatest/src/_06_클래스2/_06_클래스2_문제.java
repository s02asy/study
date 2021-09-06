package _06_클래스2;


class Test{
	int numberList[];
	String idList [];
	String nameList[]; 
	int scoreList[];
}

public class _06_클래스2_문제 {
	public static void main(String[] args) {
		
		String data = "";
		data += "1001,qwer,김철민,10\n";
		data += "1002,asdf,우중현,35\n";
		data += "1003,zxcv,이만수,30";
				
		System.out.println(data);
		
		
		// 위 데이터를 Test 에 저장후 출력 
		String tokens[] = data.split("\n");
		int size = tokens.length;
		Test t = new Test();
		t.idList = new String[size];
		t.nameList = new String[size];
		t.numberList = new int[size];
		t.scoreList = new int[size];
		for(int i = 0; i < size; i++) {
			String tokens2[] = tokens[i].split(",");
			t.numberList[i] = Integer.parseInt(tokens2[0]);
			t.idList[i] = tokens2[1];
			t.nameList[i] = tokens2[2];
			t.scoreList[i] = Integer.parseInt(tokens2[3]);
		}
		for(int i = 0; i < size; i++) {
			System.out.print(t.numberList[i] + " ");
			System.out.print(t.idList[i] + " ");
			System.out.print(t.nameList[i] + " ");
			System.out.println(t.scoreList[i] + " ");
		}
	}
}