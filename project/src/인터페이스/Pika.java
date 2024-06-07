package 인터페이스;

public class Pika implements Digimon, Pokemon{
	
	
	//인터페이스 상속받는 키워드 -> implements
	//상속(extends)-> 클래스 간의 부도-자식관계->공통되는 필드나 메소드를 추상화하는 개념
	//구현(implements) -> 다중상속이 가능하다->형제 관계->클래스를 확장시켜 다향성을 높임
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("피카츄가 공격한다");
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		System.out.println("피카츄 백만볼트~!");
	}

}
