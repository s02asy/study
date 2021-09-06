package O1_������Ʈ_Ŭ����;
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

public class O1_������Ʈ_Ŭ��_īƮ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ��Ʈ�ѷ� �����(���� �ڷΰ��� ����)
		// [���θŴ�] ==> 1)ȸ������ 2)Ż�� 3)�α��� 0)����
		// (����) �α����� ������ �α��ΰ� , �Ϲ��ηα��� ���� 
		//       �����ڴ� admin �̶� ���̵�� �α��� 
		// [�����ڷα���] ==> 1) �������߰� 2)�����ۻ��� 3)�����ۼ���
		//          
		// [�Ϲ��ηα��� ] ==> 1)����  2) ��ٱ��� 
		// [��ٱ���]    ==> 1)����  2) �ڷΰ��� 
		// [����]       ==> �����ڰ� �߰��� �����۸� ���ΰ���
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
			System.out.println("1)ȸ������ 2)Ż�� 3)�α��� 0)����");
			System.out.println(":");
			int sel = scan.nextInt();
			if(sel == 1) {
				while(true) {
					System.out.println("ȸ������");
					System.out.println("0)�ڷΰ���");
					System.out.println("ID �Է�(ID�� 10�ڸ� ����) : ");
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
							System.out.println("ID�� 10�ڸ� ���Ϸ� ������ּ���.");
							continue;
						}
						if(ID.equals("0")) {
							break;
						}else if(cnt == ID.length()) {
							user[index].id = ID;
							index += 1;
						}else {
							System.out.println("ID�� ����빮��,����ҹ���,���� ������ ������ּ���.");
						}
					}else {
						System.out.println("�ߺ��� ���̵� �Դϴ�.");
					}
				}
			}else if(sel == 2) {
				while(true) {
					System.out.println("ȸ��Ż��");
					System.out.println("0)�ڷΰ���");
					System.out.println("Ż���� ID �Է� : ");
					String ID = scan.next();
					if(ID.equals("0")) {
						break;
					}
					if(ID.equals(user[0].id)) {
						System.out.println("�����ڴ� Ż���Ҽ� �����ϴ�.");
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
						System.out.println("Ż�� ����.");
					}else {
						System.out.println("���� ���̵� �Դϴ�.");
					}
				}
			}else if(sel == 3) {
				while(true) {
					System.out.println("�α���");
					System.out.println("0)�ڷΰ���");
					System.out.println("ID �Է� : ");
					String ID = scan.next();
					if(ID.equals("0")) {
						break;
					}
					if(ID.equals("admin")) {
						while(true) {
							System.out.println("[�����ڷα���]");
							System.out.println("1)�������߰� 2)�����ۻ��� 3)�����ۼ��� 0)�α׾ƿ�");
							int admin = scan.nextInt();
							if(admin == 0) {
								break;
							}
							while(true) {
								if(admin == 1) {
									System.out.println("[�������߰�]");
									System.out.println("0)�ڷΰ���");
									System.out.println("�߰��Ͻ� ������ �Է� : ");
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
										System.out.println("���� �Է� : ");
										int price = scan.nextInt();
										item[itemid].price = price;
										itemid += 1;
										System.out.println("������ �߰� ����.");
									}else {
										System.out.println("�̹� �ִ� �������Դϴ�.");
									}
								}else if(admin == 2) {
									if(itemid > 0) {
										System.out.println("[�����ۻ���]");
										System.out.println("[�����۸��]");
										for(int i = 0; i < itemid; i++) {
											System.out.println(item[i].name + " " + item[i].price);
										}
										System.out.println("0)�ڷΰ���");
										System.out.println("�����Ͻ� ������ �Է� : ");
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
											System.out.println("�����ۻ��� �Ϸ�.");
										}else {
											System.out.println("���� ������ �Դϴ�.");
										}
									}else {
										System.out.println("�������� ���� �߰��� �̿����ּ���.");
										break;
									}
								}else if(admin == 3) {
									System.out.println("[�����ۼ���]");
									System.out.println("[�����۸��]");
									for(int i = 0; i < itemid; i++) {
										System.out.println(item[i].name + " " + item[i].price);
									}
									System.out.println("0)�ڷΰ���");
									System.out.println("�����Ͻ� ������ �Է� : ");
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
										System.out.println("���� �����۸� :");
										inputitem = scan.next();
										System.out.println("���� �ݾ� : ");
										int price = scan.nextInt();
										item[id].name = inputitem;
										item[id].price = price;
										System.out.println("�����Ϸ�.");
									}else {
										System.out.println("�����۸��� Ȯ�����ּ���.");
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
							System.out.println(user[id].id + "�� ȯ���մϴ�.");
							System.out.println("[�Ϲ��ηα���]");
							System.out.println("1)���� 2)��ٱ��� 0)�ڷΰ���");
							int user1 = scan.nextInt();
							if(user1 == 0) {
								break;
							}
							if(itemid > 0) {
								if(user1 == 1) {
									while(true) {
										System.out.println("[����]");
										System.out.println("0)�ڷΰ���");
										for(int i = 0; i < itemid; i++) {
											System.out.println((i+1) + "." + item[i].name + " " + item[i].price + "��");
										}
										System.out.println("������ ���� : ");
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
										System.out.println("[��ٱ���]");
										System.out.println("1)����  2) �ڷΰ���");
										System.out.println(user[id].id + "�� ��ٱ��� ���.");
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
											System.out.println("���� ��ȣ �Է� : ");
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
								System.out.println("��ǰ�� �غ��� �Դϴ�.");
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