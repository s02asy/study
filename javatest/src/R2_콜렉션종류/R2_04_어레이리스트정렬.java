package R2_콜렉션종류;

import java.util.ArrayList;
import java.util.Collections;

class Fruit implements Comparable<Fruit>{

	private String name;
	private int price;
	
	public Fruit() {}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit fruit) {
		
//		# 정수 비교
		int check = 0;
		if(price - fruit.price > 0) check = 1;
		else if(price - fruit.price < 0) check = -1;
 		return check;
		
//		#문자 비교
		//return name.compareTo(fruit.name);
	}

	@Override
	public String toString() {
		return name + " : " + price;
	}
}


public class R2_04_어레이리스트정렬 {
	public static void main(String[] args) {

		ArrayList<Fruit> list = new ArrayList<>();
		
		list.add(new Fruit("사과", 3000));
		list.add(new Fruit("귤", 1000));
		list.add(new Fruit("오렌지", 2000));
		
		Collections.sort(list);
		
		System.out.println(list);
	

	}
}