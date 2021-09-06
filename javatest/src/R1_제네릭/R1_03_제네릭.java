package R1_제네릭;

import java.util.Vector;

class MyVector<T> {
	private Object[] arr;
	private int count;

	public void add(T data) {
		if (count == 0) {
			arr = new Object[1];
		} else if (count > 0) {
			Object[] temp = arr;

			arr = new Object[count + 1];
			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}

			temp = null;
		}

		arr[count] = data;
		count++;
	}

	public void set(int index, T data) {
		arr[index] = data;
	}

	public int size() {
		return count;
	}

	public T get(int index) {
		return (T) arr[index]; // 형 변환
	}
}

class User {
	public String name;

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class R1_03_제네릭 {

	public static void main(String[] args) {
		/* 
		 * <제네릭> <T> t는 템플릿의 약자로 다른문자를 사용해도 무방하다. 예) <K> 
		 *  제네릭은 <> 를 뜻하고 클래스가 정해지지않고 대기하다가 
		 *  <> 안에 타입을 명시해주면 그때 클래스가 정해지는걸 말한다. 
		 *  
		 *  지금까지 사용했던 Vector<클래스타입>  가 제네릭의 대표적 사용법이다.  
		 *  딱히, Vector 이외의 다른용도로는 사용하지않는다. 
		 * -------------------------------------------------------
		 *  실제 Vector 는 제네릭을 사용하여 아래와똑같은 방법으로 만들어졌다. 
		 */
		MyVector<User> list = new MyVector<User>();
		
		list.add(new User("홍길동"));
		list.add(new User("김민수"));
		
		User temp = new User("김소정");
		list.add(temp);
		
		list.set(1, new User("최민정"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		// <> 제네릭은 클래스를 지정해주는대로 사용가능하다. 
		MyVector<Tv> list2 = new MyVector<Tv>();	
		MyVector<Integer> list3 = new MyVector<Integer>();
		
		
		System.out.println("-------------------------------");
		Vector<User> vecList= new Vector<>();
		vecList.add(new User("홍길동"));
		vecList.add(new User("김민수"));
		
		User temp1 = new User("김소정");
		vecList.add(temp1);
		
		vecList.set(1, new User("최민정"));
		
		for(int i=0; i<vecList.size(); i++) {
			System.out.println(vecList.get(i).toString());
		}
		
	}

}