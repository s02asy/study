package _07_클래스심화1;

class Member{
	int number;
	String id;
	String name;
	int score;
}

public class _07_클래스배열_멤버1 {
	public static void main(String[] args) {
		
		int numberList[] = {1001,1002,1003};
		String idList [] = {"qwer" , "asdf" ,"zxcv"};
		String nameList[] = {"김철민" , "우중현" , "이만수"};
		int scoreList[] = {10,3,30};
		
				
		//문제 위 데이터를 아래클래스배열로 변환해보자
		Member[] memberList = null;
		int size = numberList.length;
		
		memberList = new Member[size];
		for(int i = 0; i < size; i++) {
			memberList[i] = new Member();
			memberList[i].number = numberList[i];
			memberList[i].id = idList[i];
			memberList[i].name = nameList[i];
			memberList[i].score = scoreList[i];
		}
		for(int i = 0; i < size; i++) {
			System.out.print(memberList[i].number + " ");
			System.out.print(memberList[i].id + " ");
			System.out.print(memberList[i].name + " ");
			System.out.println(memberList[i].score + " ");
		}
	}
}