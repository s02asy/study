package R1_제네릭;

class MyVector2 {
	private Tv[] arr;
	private int count;

	public void add(Tv e) {
		if (count == 0) {
			arr = new Tv[count + 1];
		} else if (count > 0) {
			Tv[] temp = arr;

			arr = new Tv[count + 1];
			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = e;
		count += 1;
	}

	public int size() {
		return count;
	}

	public void remove(int index) {
		if (count == 1) {
			arr = null;
			count = 0;
		} else if (count > 1) {
			Tv[] temp = arr;

			arr = new Tv[count - 1];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (i != index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
		}
		count -= 1;
	}

	public Tv get(int index) {
		return arr[index];
	}

}
class Tv {
	public String name;
	public String brand;
	public int price;

	public Tv(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}


public class R1_02_벡터직접만들기2 {
	public static void main(String[] args) {
		MyVector2 myList = new MyVector2();
		Tv temp = new Tv("TV", "삼성", 1000);
		myList.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		myList.add(temp);

		temp = myList.get(1);
		System.out.println(temp.name);

	}
}