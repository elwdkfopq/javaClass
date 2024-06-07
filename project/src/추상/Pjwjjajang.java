package 추상;

public class Pjwjjajang extends Pbkjjajang {

	public void makeJjambong() {
		System.out.println("신선한 해물(안익음)이 잔뜩 올라간 해물 짬뽕");
		
	}

	@Override //오버라이드 - 부모의 메소드를 자식 클래스에서 다시 정의하는 것(재정의)
	public void makeJjajang() {
		// TODO Auto-generated method stub
		System.out.println("파인애플이 잔뜩 올라간 짜장면");
	}
}
