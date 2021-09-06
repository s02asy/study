package Q2_00_스태틱;
import java.util.Vector;
// 프로그램 
// 1) controller
// 2) member , memberDAO
// 3) item ,  itemDAO
// 4) cart , cartDAO
class Cotroller{	
	static void run() {
		MemberDAO1.create();
	} 
}
class Member1{
	int number;  String name;
}
class MemberDAO1{
	static Vector<Member1> memberList;
	static void create() {}
	static void delete() {
		CartDAO1.delete();
	}
	static void update() {}
	static void read() {}
}	
class Cart1{
	int memberID; String itemName;
}
class CartDAO1{
	static Vector<Member1> memberList;
	static void create() {}
	static void delete() {}
	static void update() {}
	static void read() {}
}


public class Q2_02_스태틱정리 {
	public static void main(String[] args) {
		
	}
}