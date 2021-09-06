package R2_콜렉션종류;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;

class avb implements Comparable<avb>{
	private int price;
	private String name;
	public avb() {}
	public avb(int price, String name){
		this.price = price;
		this.name = name;
	}
	@Override
	public int compareTo(avb o) {
		int check = 0;
		if(price - o.price > 0) check = -1;
		else check = 1;
		return check;
	}
	@Override
	public String toString(){
		return name + " : " + price;
	}
	public void Print() {
		System.out.println(name + ":" + price);
	}
}


public class asdasd {
	public static void main(String[] args) {
		ArrayList<avb> aList = new ArrayList<avb>();
		
		aList.add(new avb(3000,"오과"));
		aList.add(new avb(3200,"사과"));
		aList.add(new avb(2000,"과나"));
		aList.add(new avb(1000,"니과"));
		aList.add(new avb(5200,"유과"));
		aList.add(new avb(8000,"육과"));
		
		Collections.sort(aList);
		for(int i = 0; i < aList.size(); i++) {
			aList.get(i).Print();
		}
	}
}
