package P1_�׽�Ʈ_Ŭ������ȭ_level1;

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



public class P1_�׽�Ʈ_Ŭ������ȭ_���ڿ�4 {
	public static void main(String[] args) {
		
		String data1 = "qwer/asdf/zxcv";
		String data2 = "�����,1200/���ڱ�,3200/������,2100";
		String data3 = "qwer,�����/qwer,������/asdf,���ڱ�/qwer,�����/zxcv,�����";
		String token1[] = data1.split("/");
		String token2[] = data2.split("/");
		String token3[] = data3.split("/");
		User[]userList;
		Item[]itemList;
		Cart[]cartList;
		int size1 = token1.length;
		int size2 = token3.length;
		// ���ڿ��� ������ �迭�� �����ϰ� qwer �� ���� ������ �Ѿ� ��� 
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
		System.out.println("�Ѿ� : " + total);
	}

}