package R2_콜렉션종류;


import java.util.ArrayList;

public class R2_01_어레이리스트 {
	public static void main(String[] args) {
		// 1. ArrayList
		// 1) Vector 보다 나중에 나온 자료구조.
		// 2) Vector 보다 성능이 좋다. 
		// 3) 멀티쓰래드구조안에서 Vector 는 사용할수없지만,
		//    ArrayList 는 사용가능하다. 
		
		// [결론] Vector 보다 ArrayList 를 사용하자.
		
		// 문법은 똑같다. 
		
		
		ArrayList<Integer> list = new ArrayList<>();
		// add(value) : ArrayList의 맨 뒤에 value를 추가한다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);

		// remove(index) : ArrayList의 index번째 데이터를 제거한다.
        list.remove(3);
        System.out.println(list);

        // size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
        int count = list.size();
        System.out.println("count = " + count);

        // get() : ArrayList의 index번째의 value를 얻어온다.
        System.out.print("[");
        for(int i=0; i<count; i++) {
            System.out.print(list.get(i));
            if(i != count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // add(index, value) : ArrayList의 index번째 위치에 value를 삽입한다.
        list.add(0, 9);
        System.out.println(list);
        
        // set(index, value) : ArrayList의 index번째 위치에 value를 수정한다.
        list.set(3, 5);
        System.out.println(list);

        
        // clear() : ArrayList의 모든 데이터를 제거한다.
        list.clear();
        System.out.println(list.size());

	}
}