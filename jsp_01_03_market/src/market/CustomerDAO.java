package market;

import java.util.ArrayList;
import java.util.Date;

public class CustomerDAO {
	private CustomerDAO(){};
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {return instance; }
	
	
	private ArrayList<CustomerDTO> customerList;
	public void init() {
		customerList = new ArrayList<CustomerDTO>();
		sampleData();
	}
	
	public void sampleData() {
		CustomerDTO customer = new CustomerDTO();
		customer.setId("a");
		customer.setPw("a");
		customer.setName("a");
		customer.setEmail("a@a");
		Date date = new Date();
		customer.setReg_date(date.toString());
		customer.setTel("011-1111-1111");
		customerList.add(customer);
	}
	
	public String findId(String name, String email) {
		String id = null;
		
		for(int i = 0; i < customerList.size(); i++) {
			if(customerList.get(i).getEmail().equals(email)  && 
					customerList.get(i).getName().equals(name)) {
				id = customerList.get(i).getId();
			}
		}
		
		
		return id;
	}
	public String findPW(String name, String id, String email) {
		String pw = "";
		for(int i = 0; i < customerList.size(); i++) {
			if(customerList.get(i).getEmail().equals(email)  && 
					customerList.get(i).getName().equals(name)&&
					customerList.get(i).getId().equals(id)) {
				pw = customerList.get(i).getPw();
			}
		}
		
		return pw;
	}
	public CustomerDTO getCustomerInfo(String id) {
		for(CustomerDTO cu : customerList) {
			if(cu.getId().equals(id)) {
				return cu;
			}
		}	
		return null;
	}
	public int userCheck(String id, String pw) {
		for(CustomerDTO cu : customerList) {
			if(cu.getId().equals(id) && cu.getPw().equals(pw)) {
				return 1;
			}
		}	
		return -1;
	}
	public int checkDoubleID(String id) {
		for(CustomerDTO cu : customerList) {
			if(cu.getId().equals(id) ) {
				return 1;
			}
		}	
		return -1;
	}
	
	public int checkDoubleEmail(String email) {
		if(customerList.size() <= 0) return -1;
		for(CustomerDTO cu : customerList) {
			
			if(cu.getEmail().equals(email) ) {
				return 2;
			}
		}	
		return -1;
	}
	
	public void insertMember(CustomerDTO customer) {
		customerList.add(customer);
	}
	
}