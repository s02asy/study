package market;

import java.util.ArrayList;


public class ManagerDAO {
	private ManagerDAO() {}
	private static ManagerDAO instance = new ManagerDAO();
	public static ManagerDAO getInstance() {return instance;}
	
	ArrayList<ManagerDTO> managerList;
	
	public void init() {
		managerList = new ArrayList<ManagerDTO>();
		ManagerDTO dto = new ManagerDTO();
		dto.setId("admin");
		dto.setPw("admin");
		dto.setName("admin");
		managerList.add(dto);
	
	}
	
	public ManagerDTO getManagerInfo(String id) {
		for(ManagerDTO ma : managerList) {
			if(ma.getId().equals(id)) {
				return ma;
			}
		}	
		return null;
	}
	
	public int checkManager(String id, String pw){
		for(ManagerDTO ma : managerList) {
			if(ma.getId().equals(id) && ma.getPw().equals(pw)) {
				return 1;
			}
		}	
		return -1;
	}
}