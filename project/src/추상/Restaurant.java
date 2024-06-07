package 추상;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pbkjjajang pbk = new Pbkjjajang();
//		
//		pbk.makeJjajang();
		
		//업캐스팅 - 자식클래스에서 객체가 생성되었으나
		//			부모클래스타입으로 형태가 변환된것
		//부모타입으로 형태가 변환되어도 부모의 메소드를 호출할때
		// 자식클래스에서 재정의 했다면 자식클래스의 재정의한 메소드가 호출된다.
		//부모클래스명 변수명 = new 자식클래스명
		
		//다운캐스팅 - 부모타입객체가 자식타입으로 변환하는 것
		//
		//종우 짜장
		Pbkjjajang pjw = new Pjwjjajang();
		
		Pjwjjajang newpjw = (Pjwjjajang)pjw;
		
		
		//둘째딸 박자영 짜장면집(서울)
		Pbkjjajang pjy = new Pjyjjajang();
		
		
		//셋째 아들 박대길 짜장면집(제주도)
		Pbkjjajang pdj = new Pbkjjajang();
		
		ArrayList<PBKjjajang> list = new ArrayList<Pbkjjajang>();
		list.add(pjw);
		
		//다형성 같은메소드라도 객체마다 다르게 실행된다
		
	}

}
