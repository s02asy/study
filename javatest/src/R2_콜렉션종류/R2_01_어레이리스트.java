package R2_�ݷ�������;


import java.util.ArrayList;

public class R2_01_��̸���Ʈ {
	public static void main(String[] args) {
		// 1. ArrayList
		// 1) Vector ���� ���߿� ���� �ڷᱸ��.
		// 2) Vector ���� ������ ����. 
		// 3) ��Ƽ�����屸���ȿ��� Vector �� ����Ҽ�������,
		//    ArrayList �� ��밡���ϴ�. 
		
		// [���] Vector ���� ArrayList �� �������.
		
		// ������ �Ȱ���. 
		
		
		ArrayList<Integer> list = new ArrayList<>();
		// add(value) : ArrayList�� �� �ڿ� value�� �߰��Ѵ�.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);

		// remove(index) : ArrayList�� index��° �����͸� �����Ѵ�.
        list.remove(3);
        System.out.println(list);

        // size() : ArrayList�� ����� �������� ������ ���´�.
        int count = list.size();
        System.out.println("count = " + count);

        // get() : ArrayList�� index��°�� value�� ���´�.
        System.out.print("[");
        for(int i=0; i<count; i++) {
            System.out.print(list.get(i));
            if(i != count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // add(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
        list.add(0, 9);
        System.out.println(list);
        
        // set(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
        list.set(3, 5);
        System.out.println(list);

        
        // clear() : ArrayList�� ��� �����͸� �����Ѵ�.
        list.clear();
        System.out.println(list.size());

	}
}