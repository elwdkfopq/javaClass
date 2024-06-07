package javafestival;

import java.util.Scanner;

public class 이십 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력>>");
		int num = sc.nextInt();
		String b="";
		while(num>0) {
			b=num%2+b;
			num=num/2;
		}System.out.println(b);
	}

}
