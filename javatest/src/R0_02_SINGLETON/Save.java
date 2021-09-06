package R0_02_SINGLETON;

import java.io.FileWriter;

public class Save {
	private Save() {}
	static private Save save = new Save();
	static public Save getSave() {
		return save;
	}
	public void run() {
		String filename1 = "src/R0_02_SINGLETON/subjectdata.txt";
		String filename2 = "src/R0_02_SINGLETON/studentdata.txt";
		FileWriter fw1 = null;
		String data = "";
		try {
			fw1 = new FileWriter(filename1);
			data += SubjectDAO.getInstance().getSubjectList().size();
			if(SubjectDAO.getInstance().getSubjectList().size() > 0) {
				data += "\n";
			}
			for(int i = 0; i < SubjectDAO.getInstance().getSubjectList().size(); i++) {
				data += SubjectDAO.getInstance().getSubjectList().get(i).getStudentNum();
				data += "/";
				data += SubjectDAO.getInstance().getSubjectList().get(i).getSubject();
				data += "/";
				data += SubjectDAO.getInstance().getSubjectList().get(i).getScore();
				if(i < SubjectDAO.getInstance().getSubjectList().size() - 1) {
					data += "\n";
				}
			}
			fw1.write(data);
			fw1.close();
			fw1 = new FileWriter(filename2);
			data = "";
			data += StudentDAO.getInstance().getStudentList().size();
			if(StudentDAO.getInstance().getStudentList().size() > 0) {
				data += "\n";
			}
			for(int i = 0; i < StudentDAO.getInstance().getStudentList().size(); i++) {
				data += StudentDAO.getInstance().getStudentList().get(i).getStudentId();
				data += "/";
				data += StudentDAO.getInstance().getStudentList().get(i).getStudentNum();
				if(i < StudentDAO.getInstance().getStudentList().size() - 1) {
					data += "\n";
				}
			}
			fw1.write(data);
			fw1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
