package 추상;



import maple.BasicCharacter;

public class Warrior extends BasicCharacter{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("파워슬레시!");
	}

	@Override
	public void avoid() {
		// TODO Auto-generated method stub
		System.out.println("방패로막기!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("빠른걸음으로 이동!");
	}

	
}
