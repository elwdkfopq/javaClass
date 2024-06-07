package javafestival;

import java.util.Scanner;

public class 일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게:");
		int now = sc.nextInt();
		System.out.print("목표몸무게:");
		int goal = sc.nextInt();
		
		int cnt = 0;
		while(now>goal) {
			cnt++;
			
			System.out.println(cnt+"주차 감량 몸무게");
			int minus = sc.nextInt();
			now-=minus;
			
			
		}System.out.println(now+"kg 달성!! 축하합니다!");
				
				
				
				
				
	}

}
