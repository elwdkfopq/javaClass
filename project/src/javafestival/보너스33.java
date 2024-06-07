package javafestival;

public class 보너스33 {
	public static void main(String[] args) {
		
	
	int num1 = 50;
	int num2 = 15;
	String op = "*";
	System.out.println(cal(num1, num2, op));
	}
	public static int cal(int num1, int num2, String op) {
		int rst = 0;
		if (op.equals("+")) {
			rst= num1+num2;
		}else if(op.equals("-")) {
			rst= num1-num2;
		}else if(op.equals("*")) {
			rst= num1*num2;
		}else if(op.equals("/")) {
			rst= num1/num2;
		}
		return rst;
		}
	}
