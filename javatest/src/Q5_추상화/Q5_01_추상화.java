package Q5_�߻�ȭ;

// ����� ����
// 1) ��� (extends)
// 2) �߻�ȭ (abstract)
// 3) �������̽� (interface)
//# ��� (�񱳸� ���� �׳� �������)
class A {
	public int a;	
	public void test() {}
}

class B extends A {
	public int b;
}

/*
* # �߻�ȭ(abstract)
	 �θ�Ŭ���������� �޼��� �̸��� ����� 
	 ��ü���� ������ �ڽĸ޼��忡�� �����ϵ��� �ϴ°� 
	  - Ȱ����� ���� ���� �ǽ��ҿ��� 
	 
    1) �θ�Ŭ���� �տ� abstract �� �ٿ��ش�.
    2) �ڽ�Ŭ�������� ������ų �޼���� �տ� abstract �� �ٿ��ش�.
    3) �����޼����{} �� ����Ͽ� ������ �����ϴµ�  {}�� �����ϰ� ; �� �ٿ��ش�. 
*/

//1) Ŭ���� �տ� abstract�� �ٿ���
abstract class C {
	
	// 2) �޼��� �տ� abstract�� �ٿ���
	abstract void test();  //������ �����ʴ� �ٴ� ǥ������ {}�� ���ְ� ; �� ���� 
	
	void test2() {} // abstract �� �������� �޼��嵵 ������ִ�. 
}

//3) Ŭ���� C�� ��ӹ��ڸ��� ������ �߻���
class D extends C{
	
	// 4) ������ �������ϴ� �޼���
	void test() {
		
	}
}
public class Q5_01_�߻�ȭ {
	public static void main(String[] args) {
		
	}
}