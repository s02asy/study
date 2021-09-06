package O0_클래스배열;

import java.util.Arrays;

class Student{
	int number;
	String name;
}

class Subject{
	int studentNumber;
	String subject;
	int score;
	int rank;
}

public class O0_14_클래스배열과목1 {
	public static void main(String[] args) {
		int numberList[] = {1001,1002,1003};
		String nameList[] = {"이만수" , "김철만" , "오수정"};
		
		int studentNumberList[] = {1001,1001,1002,1002,1002,1003};
		String subjectList[] = {"국어" , "수학" , "국어" , "수학" ,"영어" , "수학"};
		int scoreList [] = {100,32,23,35,46,60};
		int rankList[]  = {0,0,0,0,0,0};
		
		//문제1) 각과목 1등 이름 출력 (1명이면 혼자 1등임)
		int size1 = numberList.length;
		int size2 = studentNumberList.length;
		Student[] a = new Student[size1];
		Subject[] b = new Subject[size2];
		for(int i = 0; i < size1; i++) {
			a[i] = new Student();
			a[i].number = numberList[i];
			a[i].name = nameList[i];
		}
		for(int i = 0; i < size2; i++) {
			b[i] = new Subject();
			b[i].studentNumber = studentNumberList[i];
			b[i].subject = subjectList[i];
			b[i].score = scoreList[i];
			b[i].rank = rankList[i];
		}
		for(int i = 0; i < size2; i++) {
			int cnt = 1;
			for(int j = 0; j < size2; j++) {
				if(i == j) {
					continue;
				}
				if(b[i].subject.equals(b[j].subject) && b[i].score < b[j].score) {
					cnt += 1;
				}
			}
			b[i].rank = cnt;
		}
		for(int i = 0; i < size2; i++) {
			System.out.print(b[i].rank + " ");
		}
		System.out.println();
		for(int i = 0; i < size2; i++) {
			if(b[i].rank == 1) {
				System.out.print(b[i].subject + "1등 : ");
				for(int j = 0; j < size1; j++) {
					if(b[i].studentNumber == a[j].number) {
						System.out.println(a[j].name);
					}
				}
			}
		}
	}
}