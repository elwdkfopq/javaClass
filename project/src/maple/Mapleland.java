package maple;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import 추상.Warrior;

public class Mapleland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//캐릭터 - 도적, 전사 ,마법사, 궁수
		
//		BasicCharacter w = new Warrior();
//		BasicCharacter t = new Theif();
//		BasicCharacter m = new Wizard();
//		BasicCharacter a = new Archer();
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("1. 공격 2. 회피 3. 이동>>");
		int menu = sc.nextInt();
		
		//1번을 눌렀을 때 위에 캐릭터 4개 중 하나 가 랜덤으로 나와서 공격을 하게 하세요
		ArrayList<BasicCharacter> Characters = new ArrayList();
		Characters.add(new Warrior());
		Characters.add(new Theif());
		Characters.add(new Wizard());
		Characters.add(new Archer());
		
		if(menu==1) {
		int ranCharacter = ran.nextInt(Characters.size());
		Characters.get(ranCharacter).attack();
		}if(menu==2) {
			
		}
	}
	private static String get(int nextInt) {
		// TODO Auto-generated method stub
		return null;
	}

}
