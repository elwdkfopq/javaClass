package 계산기;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//도형의 넓이 계산해주는 프로그램
		//다양한 도형을 확장 할 수 있게 설계
		Scanner sc = new Scanner(System.in);
		
		//계산기 객체 생성
		AreaCalculator cal = new AreaCalculator();
		
		Figure f = null;
		while(true) {
		System.out.print("1. 삼각형 2. 사각형 3. 원 4. 종료>>");
		int choice = sc.nextInt();
		if (choice==1) {
			//삼각형 넓이 계산
			System.out.print("밑변 입력:");
			double width = sc.nextDouble();
			System.out.print("높이 입력:");
			double height = sc.nextDouble();
			f = new triangle(width,height);
			double result = cal.calArea(f);
			System.out.println("넓이: "+result);
		}else if (choice == 2) {
			//사각형 넓이 계산
			System.out.println("가로입력:");
			double width = sc.nextDouble();
			System.out.println("세로입력:");
			double height = sc.nextDouble();
			
			f = new rectangle(width,height);
			
			
		}else if (choice == 3) {
			//원 넓이 계산
			System.out.print("반지름 입력: ");
			double radius = sc.nextDouble();
			f= new circle(radius);
		}else {
			//종료
			System.out.println("프로그램 종료");
			break;
		}
		double result = f.calArea();
		System.out.println("넓이:"+result);
		}
	}

}
