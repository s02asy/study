package P1_테스트_클래스심화_level1;

class Student{
	String name;
	int score;
	void print() {
		System.out.println(name + " : " + score);
	}

}

public class P1_테스트_클래스심화_문자열1 {
	public static void main(String[] args) {
		String data = ""; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		
		
		System.out.println(data);

		Student[] studentList;
		//문제1)data에 있는 내용을 잘라서  studentList 에 저장후 출력 
		String data2[] = data.split("\n");
		studentList = new Student[data2.length];
		for(int i = 0; i < data2.length; i++) {
			String []data3 = data2[i].split("/");
			studentList[i] = new Student();
			studentList[i].name = data3[0];
			studentList[i].score = Integer.parseInt(data3[1]);
		}
		for(int i = 0; i < studentList.length; i++) {
			studentList[i].print();
		}
		//문제2)꼴등 삭제후 다시 data에 저장
		int check = studentList[0].score;
		int id = 0;
		for(int i = 0; i < studentList.length; i++) {
			if(check > studentList[i].score) {
				check = studentList[i].score;
				id = i;
			}
		}
		data = "";
		for(int i = 0; i < studentList.length; i++) {
			if(id != i) {
				data += studentList[i].name + "/" + String.valueOf(studentList[i].score) + "\n";
			}
		}
		data.substring(0,data.length() - 1);
		System.out.println(data);
	}

}