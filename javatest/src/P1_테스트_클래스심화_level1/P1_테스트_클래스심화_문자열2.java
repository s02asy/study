package P1_테스트_클래스심화_level1;

class Test{
	int num;
	int size;
	char[] data;
	void print() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
public class P1_테스트_클래스심화_문자열2 {
	public static void main(String[] args) {
		String data ="";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	
		
		String data2[] = data.split("\n");
		Test[] t;	
        // data의 정보를 클래스배열에 저장.
		t = new Test[data2.length];
		for(int i = 0; i < data2.length; i++) {
			String data3[] = data2[i].split("/");
			t[i] = new Test();
			t[i].num = Integer.parseInt(data3[0]);
			t[i].size = Integer.parseInt(data3[1]);
			t[i].data = new char[t[i].size];
			for(int j = 0; j < t[i].data.length; j++) {
				t[i].data[j] = data3[2 + j].charAt(0);
			}
		}
		for(int i = 0; i < t.length; i++) {
			t[i].print();
		}
	}

}