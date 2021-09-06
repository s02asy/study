package Q6_�������̽�;
import java.util.Random;

abstract class Type {
	public int MAX_HP;
	public int hp;
	public int power;
	
	public Type(int hp, int power) {
		MAX_HP = hp;
		this.hp = MAX_HP;
		this.power = power;
	}
	public abstract void skill();
	public abstract void skillAttack(Type unit);
	public abstract void attack(Type unit);
	
	@Override
	public String toString() {
		return hp + "/" + MAX_HP;
	}
}			

class Wolf extends Type {
	public int leg;
	public int bite;
	
	public Wolf(int leg, int bite) {
		super(100, 10);
		this.leg = leg;
		this.bite = bite;
	}
	
	public void skill() {
		power += leg + bite;
		System.out.println("�ٸ������� �̻�������ŭ ���ݷ��� ����ߴ�! power =" + power);
	}
	
	@Override
	public void attack(Type unit) {
		Random ran = new Random();
		
		int rNum = ran.nextInt(10) + 1;
		
		unit.hp -= power;
		unit.hp -= rNum;
		
		System.out.println("Wolf�� �⺻ ������ " + this.power + "��(��) �������ϴ�.");
		System.out.println("Wolf�� �߰� ������ " + rNum + "��(��) �������ϴ�.");
	}

	@Override
	public void skillAttack(Type unit) {
		
	}
}

class Bat extends Type {
	public int fly;
	public int poison;
	
	public Bat(int fly, int poison) {
		super(50, 5);
		
		this.fly = fly;
		this.poison = poison;
	}
	
	@Override
	public void attack(Type unit) {
		unit.hp -= power;
		
		System.out.println("Bat�� �⺻ ������ " + this.power + "��(��) �������ϴ�.");
	}

	@Override
	public void skill() {
		
	}

	@Override
	public void skillAttack(Type unit) {
		unit.hp -= power * 2;
		System.out.println("Bat�� ��ų ������ " + this.power * 2 + "��(��) �������ϴ�.");
	}
}
public class Q6_03_������2 {
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
		
		Type[] unitList = new Type[5];
		
		Wolf wolf = new Wolf(3, 10);
		unitList[0] = wolf;
		unitList[0].skill();
		
		Bat bat = new Bat(10, 15);
		unitList[1] = bat;
		
		unitList[0].attack(unitList[1]);
		System.out.println(unitList[1]);
		
		unitList[1].attack(unitList[0]);
		System.out.println(unitList[0]);
		
		unitList[1].skillAttack(unitList[0]);
		System.out.println(unitList[0]);
	}
}