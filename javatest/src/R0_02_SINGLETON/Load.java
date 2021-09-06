package R0_02_SINGLETON;

import java.io.BufferedReader;
import java.io.FileReader;

public class Load {
	private Load() {}
	static private Load load = new Load();
	static public Load getLoad() {
		return load;
	}
	
	public void run() {
		String filename1 = "src/R0_02_SINGLETON/subjectdata.txt";
		String filename2 = "src/R0_02_SINGLETON/studentdata.txt";
		FileReader fr1 = null;
		BufferedReader br1 = null;
		String data = "";
		try {
			fr1 = new FileReader(filename1);
			br1 = new BufferedReader(fr1);
			String temp = br1.readLine();
			int size = Integer.parseInt(temp);
			SubjectDAO.getInstance().init();
			for(int i = 0; i < size; i++) {
				temp = br1.readLine();
				String tokens[] = temp.split("/");
				Subject sub = new Subject();
				sub.setStudentNum(Integer.parseInt(tokens[0]));
				sub.setSubject(tokens[1]);
				sub.setScore(Integer.parseInt(tokens[2]));
				SubjectDAO.getInstance().getSubjectList().add(sub);
			}
			fr1.close();
			br1.close();
			fr1 = new FileReader(filename2);
			br1 = new BufferedReader(fr1);
			temp = br1.readLine();
			size = Integer.parseInt(temp);
			StudentDAO.getInstance().init();
			for(int i = 0; i < size; i++) {
				temp = br1.readLine();
				String tokens[] = temp.split("/");
				Student stu = new Student();
				stu.setStudentId(tokens[0]);
				stu.setStudentNum(Integer.parseInt(tokens[1]));
				StudentDAO.getInstance().getStudentList().add(stu);
			}
			fr1.close();
			br1.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
