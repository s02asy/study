package Q6_�������̽�;

abstract class AA {
	public abstract void test1(); // �߻�ȭ Ŭ������ abstract �� ���ΰͰ� 
	public void test2() {}		 //  �Ⱥ��� �޼��带 ��� ������ִ�.
}
class BB extends AA{
	public void test1() {	  //  �ڽ�Ŭ���������� abstract ���پ��ִ� �޼��常��  ���������ؾ��Ѵ�.
	}
}


interface EE{
	public void test3();
}
interface CC{
	public void test1();
	public void test2();
}
class DD implements CC , EE { // interface �� ���߻���� �ȴ�. 
	public void test1() {}  // interface �� ����ϸ� �޼��带 ������ ���������Ѵ�.
	public void test2() {}
	public void test3() {}
}
// �������̽�(Interface) Ŭ����
// 1. �θ�Ŭ�����տ� interface �� ���δ�.
// 2. interface ����� extends ��� implements �� ���δ�. 
// 3. interface �� ���߻���� �����Ͽ� , �� �̿��ؼ� ���� interface�� ����Ҽ� �ִ�.
// 4. ���Ŀ� ������ �ǽ��Ѵ�. 

// �������̽��� �߻�Ŭ�������� �� �߻�ȭ�� Ŭ���� (���ΰ���)
//  1. ���� ������ ���� �������� �⺻ ���赵.
//  2. ����� �߻� �޼��常 ����� ���´�.
//  3. �ν��Ͻ��� �����Ҽ� ���� , Ŭ���� �ۼ��� ������ �ٸ�������
//      ���Ǵ� Ŭ����
//  4. ���߻���� �����ϴ�.
public class Q6_01_�������̽� {
	public static void main(String[] args) {
		
	}
}