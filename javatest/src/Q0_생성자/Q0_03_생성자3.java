package Q0_생성자;


class Fruit {
	String name;
	int price;
	
	// 기본 생성자
	Fruit(){}
	
	// 생성자 오버로딩(overloading)
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(name + "(" + price + "원)");
	}
}

public class Q0_03_생성자3 {
	public static void main(String[] args) {
		
		// # 인스턴스 변수 초기화방법 3가지
		Fruit apple = new Fruit();
		// # 방법1) .으로 접근해 초기화
		apple.name = "사과";
		apple.price = 1000;
		apple.printData();
		
		Fruit banana = new Fruit();
		// # 방법2) 메서드를 만들어 초기화
		banana.setData("바나나", 2000);
		banana.printData();
		
		// # 방법3) 생성자를 활용해 초기화
		Fruit melon = new Fruit("멜론", 3000);
		melon.printData();
	}
}