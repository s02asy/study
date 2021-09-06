package Q1_01_캡슐화;

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

public class Q1_03_캡슐화3 {
	public static void main(String[] args) {
		// 캡슐화의 이점
		// 읽기와 쓰기를 구분 둘중 선택해서 구현할수있다.
		// [get set의 활용법]
		
		// 위 와같이 set메서드는  price만 만들어놓고 , 
		// 제조년과  상품이름의 set메서드를  만들지않으면 
		// 제조년과  상품이름은 처음 저장한 이후 변경이 절대로 불가능하다. 
		Product pr = new Product("20210420", "김치", 2000);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());
			
		pr.setPrice(1500);
		System.out.println(pr.getName());
		System.out.println(pr.getRegiDate());
		System.out.println(pr.getPrice());
		
	}
}