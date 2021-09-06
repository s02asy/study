package Q6_�������̽�;

import java.util.Scanner;

abstract class Shape {
	
	public abstract void draw();
}

//	Shape Ŭ������ ��ӹ޾� Point Ŭ������ �����.
class Point extends Shape {
	@Override
	public void draw() {
		System.out.println("���� ��´�.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Line Ŭ������ �����.
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Circle Ŭ������ �����.
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Rect Ŭ������ �����.
class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� TriAngle Ŭ������ �����.
class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}


public class Q6_02_������1 {
	public static void main(String[] args) {
		// === ������ === 
		
		// ���� �ٸ�Ŭ������ �迭�� ����Ұ����ϱ⶧����
		// ����θ� ��ӹް�
		// �θ��� Ŭ������ �迭�� ����� �ѹ迭�� ���δٸ�Ŭ�������� �����Ҽ��ִ�.
		/*
		 * # ������
		 * 1. ���� �ٸ� Ŭ������ �迭�� ������ �Ұ����ϱ� ������
		 * 2. ���� �θ� ��ӹ޾�
		 * 3. �θ� Ŭ������ �迭�� ����� �� �迭�� ���� �ٸ� Ŭ�������� ������ �� �ִ�.
		 */
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �۾��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();

	}
}