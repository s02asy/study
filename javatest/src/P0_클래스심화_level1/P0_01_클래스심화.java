package P0_Ŭ������ȭ_level1;
class Product{
	String name;
	int price;
	
	void print() {
		System.out.println(name + " " + price);
	}
}
public class P0_01_Ŭ������ȭ {
	public static void main(String[] args) {
		
		
		//-------------------------------------------------		
		Product [] prList = new Product[2];
		prList[0] = new Product();
		prList[1] = new Product();
	
		prList[0].price = 1000;
		prList[1].price = 2000;

		prList[0].name = "�����";
		prList[1].name = "����";		
			
		for(int i = 0; i < prList.length; i++) {
			prList[i].print();
		}
		
	}
}