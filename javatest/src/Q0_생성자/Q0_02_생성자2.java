package Q0_생성자;
/*
 * # 생성자 오버로딩
 * 1. 생성자도 메서드이기 때문에 같은 이름으로 여러개 만들 수 있다.
 * 2. 단, 메서드와 마찬가지로 매개변수(parameter)를 서로 다르게 해야한다.
 */


class Product {
	String name;
	int price;
	
	Product() {
		name = "박스";
		price = 1000;
		System.out.println("기본 생성자");
	}
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void printProduct() {
		System.out.println(name + " : " + price);
	}
}

public class Q0_02_생성자2 {
public static void main(String[] args) {
		
		//  기본 생성자 호출
		Product p1 = new Product();
		p1.printProduct();
		
		//               생성자 오버로딩
		Product p2 = new Product("빈박스", 2000);
		p2.printProduct();
	}
}