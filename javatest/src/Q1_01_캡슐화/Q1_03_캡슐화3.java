package Q1_01_ĸ��ȭ;

class Product {
	private String regiDate;
	private String name;
	private int price;
	
	Product (String date , String name , int price){
		this.regiDate = date;
		this.name = name;
		this.price = price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	String getRegiDate() {
		return regiDate;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
}

public class Q1_03_ĸ��ȭ3 {
	public static void main(String[] args) {
		// ĸ��ȭ�� ����
		// �б�� ���⸦ ���� ���� �����ؼ� �����Ҽ��ִ�.
		// [get set�� Ȱ���]
		
		// �� �Ͱ��� set�޼����  price�� �������� , 
		// �������  ��ǰ�̸��� set�޼��带  ������������ 
		// �������  ��ǰ�̸��� ó�� ������ ���� ������ ����� �Ұ����ϴ�. 
		Product pr = new Product("20210420", "��ġ", 2000);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());
			
		pr.setPrice(1500);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());
		
	}
}