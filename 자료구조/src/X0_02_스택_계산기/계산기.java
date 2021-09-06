package X0_02_스택_계산기;

import java.util.ArrayList;

class Token {
	double num;
	char op;
}

class Node {
	Token data;
	Node next;
}

class Stack {
	Node top;
	int size;

	void push(Token token) {
		Node node = new Node();
		node.data = token;

		if (size == 0) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}
		size += 1;
	}

	Node peek() {
		return top;
	}

	void pop() {
		if (size == 0)
			return;
		top = top.next;
		size -= 1;
	}

	void print() {
		Node cur = top;
		while (true) {
			System.out.println(cur.data.num);
			cur = cur.next;
			if (cur == null)
				break;
		}
	}
}

class Calculator {
	ArrayList<Token> calcList = new ArrayList<Token>();

	boolean checkNum(char c) {
		String num = "0123456789";
		for (int j = 0; j < num.length(); j++) {
			if (num.charAt(j) == c) {
				Token token = new Token();
				token.num = c - '0'; // 이러면 숫자가된다.
				token.op = 0;
				calcList.add(token);
				return true;
			}
		}
		return false;
	}

	int InCheck(char c) {
		if (c == '+' || c == '-') {
			return 1;
		}
		if (c == '*' || c == '/') {
			return 2;
		}
		return 0;
	}

	int OutCheck(char c) {
		if (c == '+' || c == '-') {
			return 1;
		}
		if (c == '*' || c == '/') {
			return 2;
		}
		if (c == '(' || c == ')') {
			return 3;
		}
		return 0;
	}

	void printCalcList() {
		for (Token token : calcList) {
			if (token.num == 0) {
				System.out.println(token.op);
			} else {
				System.out.println(token.num);
			}

		}
	}

	void changeToPost(String data) {
		Stack stack = new Stack();
		int i = 0;
		while (i < data.length()) {
			char c = data.charAt(i);
			if (checkNum(c)) {
				// System.out.println(c);
			} else if (stack.size == 0) {
				Token token = new Token();
				token.op = c;
				stack.push(token);
			} else if (c == ')') {
				Node peek = stack.peek();
				char in = peek.data.op;
				if (in != '(') {
					Token token = new Token();
					token.op = in;
					calcList.add(token);
					stack.pop();
				}
				stack.pop();

			} else {
				Node peek = stack.peek();
				char in = peek.data.op;
				if (InCheck(in) >= OutCheck(c)) {
					Token token = new Token();
					token.op = in;
					calcList.add(token);
					stack.pop();
				}
				Token token = new Token();
				token.op = c;
				stack.push(token);
			}
			i += 1;
		}
		Node peek = stack.peek();
		while (peek != null) {
			Token token = new Token();
			char in = peek.data.op;
			token.op = in;
			calcList.add(token);
			stack.pop();
			peek = stack.peek();
		}
	}

	void Calc() {
		System.out.println("-----------------------------");
		Stack stack = new Stack();

		for (int i = 0; i < calcList.size(); i++) {
			if (calcList.get(i).op == 0) {
				Token token = new Token();			
				token.num = calcList.get(i).num;
			
				stack.push(token);
			} else {
		
				Node n1 = stack.peek();
				stack.pop();
				Node n2 = stack.peek();
				stack.pop();
				Token token = new Token();
				
				if (calcList.get(i).op == '+') {			
					token.num = n2.data.num + n1.data.num;
					
				}
				if (calcList.get(i).op == '-') {
					token.num = n2.data.num - n1.data.num;
				}
				if (calcList.get(i).op == '*') {
					token.num = n2.data.num * n1.data.num;
				}
				if(calcList.get(i).op == '/') {
					token.num = n2.data.num / n1.data.num;
				}
				
				stack.push(token);
			}
		}
		System.out.println("결과 : " + stack.peek().data.num);
		
		

	}

}

public class 계산기 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String data = "7*(1+2)/(3+4)";
		calc.changeToPost(data);
		calc.printCalcList();
		calc.Calc();
	}
}