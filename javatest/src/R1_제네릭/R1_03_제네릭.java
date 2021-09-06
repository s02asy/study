package R1_���׸�;

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
		return (T) arr[index]; // �� ��ȯ
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

public class R1_03_���׸� {

	public static void main(String[] args) {
		/* 
		 * <���׸�> <T> t�� ���ø��� ���ڷ� �ٸ����ڸ� ����ص� �����ϴ�. ��) <K> 
		 *  ���׸��� <> �� ���ϰ� Ŭ������ ���������ʰ� ����ϴٰ� 
		 *  <> �ȿ� Ÿ���� ������ָ� �׶� Ŭ������ �������°� ���Ѵ�. 
		 *  
		 *  ���ݱ��� ����ߴ� Vector<Ŭ����Ÿ��>  �� ���׸��� ��ǥ�� �����̴�.  
		 *  ����, Vector �̿��� �ٸ��뵵�δ� ��������ʴ´�. 
		 * -------------------------------------------------------
		 *  ���� Vector �� ���׸��� ����Ͽ� �Ʒ��ͶȰ��� ������� ���������. 
		 */
		MyVector<User> list = new MyVector<User>();
		
		list.add(new User("ȫ�浿"));
		list.add(new User("��μ�"));
		
		User temp = new User("�����");
		list.add(temp);
		
		list.set(1, new User("�ֹ���"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		// <> ���׸��� Ŭ������ �������ִ´�� ��밡���ϴ�. 
		MyVector<Tv> list2 = new MyVector<Tv>();	
		MyVector<Integer> list3 = new MyVector<Integer>();
		
		
		System.out.println("-------------------------------");
		Vector<User> vecList= new Vector<>();
		vecList.add(new User("ȫ�浿"));
		vecList.add(new User("��μ�"));
		
		User temp1 = new User("�����");
		vecList.add(temp1);
		
		vecList.set(1, new User("�ֹ���"));
		
		for(int i=0; i<vecList.size(); i++) {
			System.out.println(vecList.get(i).toString());
		}
		
	}

}