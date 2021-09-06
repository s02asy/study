package Q6_인터페이스;
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
		System.out.println("다리개수와 이빨개수만큼 공격력이 향상했다! power =" + power);
	}
	
	@Override
	public void attack(Type unit) {
		Random ran = new Random();
		
		int rNum = ran.nextInt(10) + 1;
		
		unit.hp -= power;
		unit.hp -= rNum;
		
		System.out.println("Wolf가 기본 데미지 " + this.power + "을(를) 입혔습니다.");
		System.out.println("Wolf가 추가 데미지 " + rNum + "을(를) 입혔습니다.");
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
		
		System.out.println("Bat가 기본 데미지 " + this.power + "을(를) 입혔습니다.");
	}

	@Override
	public void skill() {
		
	}

	@Override
	public void skillAttack(Type unit) {
		unit.hp -= power * 2;
		System.out.println("Bat가 스킬 데미지 " + this.power * 2 + "을(를) 입혔습니다.");
	}
}
public class Q6_03_다형성2 {
	public static void main(String[] args) {
		
		// === 다형성 === 
		
		// 서로 다른클래스는 배열에 저장불가능하기때문에
		// 공통부모를 상속받고
		// 부모의 클래스로 배열을 만들면 한배열에 서로다른클래스들을 저장할수있다.
		/*
		 * # 다형성
		 * 1. 서로 다른 클래스는 배열에 저장이 불가능하기 때문에
		 * 2. 공통 부모를 상속받아
		 * 3. 부모 클래스로 배열을 만들면 한 배열에 서로 다른 클래스들을 저장할 수 있다.
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