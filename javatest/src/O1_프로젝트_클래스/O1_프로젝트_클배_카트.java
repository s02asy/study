package O1_프로젝트_클래스;
import java.util.Scanner;
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

public class O1_프로젝트_클배_카트 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 컨트롤러 만들기(전부 뒤로가기 가능)
		// [메인매뉴] ==> 1)회원가입 2)탈퇴 3)로그인 0)종료
		// (조건) 로그인은 관리자 로그인과 , 일반인로그인 가능 
		//       관리자는 admin 이란 아이디로 로그인 
		// [관리자로그인] ==> 1) 아이템추가 2)아이템삭제 3)아이템수정
		//          
		// [일반인로그인 ] ==> 1)쇼핑  2) 장바구니 
		// [장바구니]    ==> 1)삭제  2) 뒤로가기 
		// [쇼핑]       ==> 관리자가 추가한 아이템만 쇼핑가능
		int max = 100;
		User[] user = new User[max];
		Item[] item = new Item[max];
		Cart[] cart = new Cart[max];
		for(int i = 0; i < max; i++) {
			user[i] = new User();
			item[i] = new Item();
			cart[i] = new Cart();
		}
		user[0].id = "admin";
		String check1 = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String check2 = "0123456789";
		int index = 1;
		int itemid = 0;
		int cartid = 0;
		while(true) {
			System.out.println("1)회원가입 2)탈퇴 3)로그인 0)종료");
			System.out.println(":");
			int sel = scan.nextInt();
			if(sel == 1) {
				while(true) {
					System.out.println("회원가입");
					System.out.println("0)뒤로가기");
					System.out.println("ID 입력(ID는 10자리 이하) : ");
					String ID = scan.next();
					boolean check = false;
					for(int i = 0; i < index; i++) {
						if(ID.equals(user[i].id)) {
							check = true;
						}
					}
					if(check == false) {
						int cnt = 0;
						for(int i = 0; i < check1.length(); i++) {
							for(int j = 0; j < ID.length(); j++) {
								if(check1.charAt(i) == ID.charAt(j)) {
									cnt += 1;
								}
							}
						}
						for(int i = 0; i < check2.length(); i++) {
							for(int j = 0; j < ID.length(); j++) {
								if(check2.charAt(i) == ID.charAt(j)) {
									cnt += 1;
								}
							}
						}
						if(cnt > 10) {
							System.out.println("ID는 10자리 이하로 만들어주세요.");
							continue;
						}
						if(ID.equals("0")) {
							break;
						}else if(cnt == ID.length()) {
							user[index].id = ID;
							index += 1;
						}else {
							System.out.println("ID는 영어대문자,영어소문자,숫자 조합을 사용해주세요.");
						}
					}else {
						System.out.println("중복된 아이디 입니다.");
					}
				}
			}else if(sel == 2) {
				while(true) {
					System.out.println("회원탈퇴");
					System.out.println("0)뒤로가기");
					System.out.println("탈퇴할 ID 입력 : ");
					String ID = scan.next();
					if(ID.equals("0")) {
						break;
					}
					if(ID.equals(user[0].id)) {
						System.out.println("관리자는 탈퇴할수 없습니다.");
						continue;
					}
					boolean check = false;
					int id = 0;
					for(int i = 0; i < index; i++) {
						if(ID.equals(user[i].id)) {
							check = true;
							id = i;
						}
					}
					if(check == true) {
						user[id].id = "";
						int cnt = 0;
						for(int i = 0; i < index; i++) {
							if(user[i].id.equals("") == false) {
								user[cnt].id = user[i].id;
								cnt += 1;
							}
						}
						user[index - 1].id = null;
						index = cnt;
						System.out.println("탈퇴 성공.");
					}else {
						System.out.println("없는 아이디 입니다.");
					}
				}
			}else if(sel == 3) {
				while(true) {
					System.out.println("로그인");
					System.out.println("0)뒤로가기");
					System.out.println("ID 입력 : ");
					String ID = scan.next();
					if(ID.equals("0")) {
						break;
					}
					if(ID.equals("admin")) {
						while(true) {
							System.out.println("[관리자로그인]");
							System.out.println("1)아이템추가 2)아이템삭제 3)아이템수정 0)로그아웃");
							int admin = scan.nextInt();
							if(admin == 0) {
								break;
							}
							while(true) {
								if(admin == 1) {
									System.out.println("[아이템추가]");
									System.out.println("0)뒤로가기");
									System.out.println("추가하실 아이템 입력 : ");
									String inputitem = scan.next();
									if(inputitem.equals("0")) {
										break;
									}
									boolean check = false;
									for(int i = 0; i < itemid; i++) {
										if(inputitem.equals(item[i].name)) {
											check = true;
											break;
										}
									}
									if(check == false) {
										item[itemid].name = inputitem;
										System.out.println("가격 입력 : ");
										int price = scan.nextInt();
										item[itemid].price = price;
										itemid += 1;
										System.out.println("아이템 추가 성공.");
									}else {
										System.out.println("이미 있는 아이템입니다.");
									}
								}else if(admin == 2) {
									if(itemid > 0) {
										System.out.println("[아이템삭제]");
										System.out.println("[아이템목록]");
										for(int i = 0; i < itemid; i++) {
											System.out.println(item[i].name + " " + item[i].price);
										}
										System.out.println("0)뒤로가기");
										System.out.println("삭제하실 아이템 입력 : ");
										String inputitem = scan.next();
										if(inputitem.equals("0")) {
											break;
										}
										boolean check = false;
										int id2 = 0;
										for(int i = 0; i < itemid; i++) {
											if(inputitem.equals(item[i].name)) {
												check = true;
												id2 = i;
												break;
											}
										}
										if(check == true) {
											item[id2].name = "";
											item[id2].price = 0;
											int cnt = 0;
											for(int i = 0; i < itemid; i++) {
												if(item[i].name.equals("") == false) {
													item[cnt].name = item[i].name;
													item[cnt].price = item[i].price;
													cnt += 1;
												}
											}
											item[itemid - 1].name = null;
											item[itemid - 1].price = 0;
											itemid = cnt;
											System.out.println("아이템삭제 완료.");
										}else {
											System.out.println("없는 아이템 입니다.");
										}
									}else {
										System.out.println("아이템을 먼저 추가후 이용해주세요.");
										break;
									}
								}else if(admin == 3) {
									System.out.println("[아이템수정]");
									System.out.println("[아이템목록]");
									for(int i = 0; i < itemid; i++) {
										System.out.println(item[i].name + " " + item[i].price);
									}
									System.out.println("0)뒤로가기");
									System.out.println("수정하실 아이템 입력 : ");
									String inputitem = scan.next();
									if(inputitem.equals("0")) {
										break;
									}
									boolean check = false;
									int id = 0;
									for(int i = 0; i < itemid; i++) {
										if(inputitem.equals(item[i].name)) {
											check = true;
											id = i;
											break;
										}
									}
									if(check == true) {
										System.out.println("수정 아이템명 :");
										inputitem = scan.next();
										System.out.println("수정 금액 : ");
										int price = scan.nextInt();
										item[id].name = inputitem;
										item[id].price = price;
										System.out.println("수정완료.");
									}else {
										System.out.println("아이템명을 확인해주세요.");
									}
								}
							}
						}
					}
					boolean check = false;
					int id = 0;
					for(int i = 1; i < index; i++) {
						if(ID.equals(user[i].id)) {
							check = true;
							id = i;
							break;
						}
					}
					if(check == true) {
						while(true) {
							System.out.println(user[id].id + "님 환영합니다.");
							System.out.println("[일반인로그인]");
							System.out.println("1)쇼핑 2)장바구니 0)뒤로가기");
							int user1 = scan.nextInt();
							if(user1 == 0) {
								break;
							}
							if(itemid > 0) {
								if(user1 == 1) {
									while(true) {
										System.out.println("[쇼핑]");
										System.out.println("0)뒤로가기");
										for(int i = 0; i < itemid; i++) {
											System.out.println((i+1) + "." + item[i].name + " " + item[i].price + "원");
										}
										System.out.println("아이템 선택 : ");
										int choice = scan.nextInt();
										if(choice == 0) {
											break;
										}
										cart[cartid].itemName = item[choice - 1].name;
										cart[cartid].userId = user[id].id;
										cartid += 1;
									}
								}else if(user1 == 2) {
									while(true) {
										System.out.println("[장바구니]");
										System.out.println("1)삭제  2) 뒤로가기");
										System.out.println(user[id].id + "님 장바구니 목록.");
										int cnt = 1;
										int ch[] = new int[cartid];
										int total = 0;
										for(int i = 0; i < cartid; i++) {
											if(user[id].id.equals(cart[i].userId)) {
												System.out.println(cnt + "." + cart[i].itemName);
												ch[i] = cnt;
												cnt += 1;
											}
										}
										int choice = scan.nextInt();
										if(choice == 1) {
											System.out.println("삭제 번호 입력 : ");
											int del = scan.nextInt();
											int id2 = 0;
											for(int i = 0; i < cartid; i++) {
												if(del == ch[i]) {
													id2 = i;
												}
											}
											cart[id2].itemName = "";
											cart[id2].userId = "";
											int cnt2 = 0;
											for(int i = 0; i < cartid; i++) {
												if(cart[i].itemName.equals("") == false) {
													cart[cnt2].itemName = cart[i].itemName;
													cart[cnt2].userId = cart[i].userId;
													cnt2 += 1;
												}
											}
											cart[cartid - 1].itemName = null;
											cart[cartid - 1].userId = null;
											cartid = cnt2;
										}else if(choice == 2) {
											break;
										}
									}
								}
							}else {
								System.out.println("상품이 준비중 입니다.");
							}
						}
					}
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}