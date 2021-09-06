package P1_테스트_클래스심화_level1;

class User{
	String id;
}
class Item{
	String name;
	int price;
}
class Cart{
	String userId;
	String itemName;
}



public class P1_테스트_클래스심화_문자열4 {
	public static void main(String[] args) {
		
		String data1 = "qwer/asdf/zxcv";
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100";
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡";
		String token1[] = data1.split("/");
		String token2[] = data2.split("/");
		String token3[] = data3.split("/");
		User[]userList;
		Item[]itemList;
		Cart[]cartList;
		int size1 = token1.length;
		int size2 = token3.length;
		// 문자열을 각각의 배열에 저장하고 qwer 의 구입 아이템 총액 출력 
		userList = new User[size1];
		itemList = new Item[size1];
		cartList = new Cart[size2];
		
		for(int i = 0; i < size1; i++) {
			String d2token[] = token2[i].split(",");
			userList[i] = new User();
			itemList[i] = new Item();
			userList[i].id = token1[i];
			itemList[i].name = d2token[0];
			itemList[i].price = Integer.parseInt(d2token[1]);
		}
		for(int i = 0; i < size2; i++) {
			String d3token[] = token3[i].split(",");
			cartList[i] = new Cart();
			cartList[i].itemName = d3token[1];
			cartList[i].userId = d3token[0];
		}
		int total = 0;
		System.out.println(userList[0].id + " ");
		for(int i = 0; i < size2; i++) {
			if(userList[0].id.equals(cartList[i].userId)) {
				System.out.println(cartList[i].itemName);
				for(int j = 0; j < size1; j++) {
					if(cartList[i].itemName.equals(itemList[j].name)) {
						total += itemList[j].price;
					}
				}
			}
		}
		System.out.println("총액 : " + total);
	}

}