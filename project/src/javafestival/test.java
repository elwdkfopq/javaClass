package javafestival;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "2024년 한국에 재앙이 닥쳤다. 그것은 바로 고양이 좀비 바이러스."
				+"고양이에 물린 사람들은 하나둘 말을 잃고 양옹이라는 단어밖에 대답을 못하는데";
				
				
			for(int i = 0; i< text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i >0 && i%50 == 0) {
				System.out.println();
			}
			}
	}

}
