package javafestival;

import java.util.Scanner;

public class 이십육 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 숫자 입력>>");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력>>");
		int num2 = sc.nextInt();
		
		System.out.println(num1*(num2%10));
		System.out.println(num1*(num2/10%10));
		System.out.println(num1*(num2/100));
		
		System.out.println(num1*num2);
	}

}
