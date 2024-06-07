package javafestival;

public class 십사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt=0;
		int[][] array = new int[5][5];
		for(int i = 0; i<array.length;i++) {
			if(i%2==0) {
			for(int j=0; j<array[i].length;j++ ) {
				cnt++;
				array[i][j]=cnt;
				}
			}else {
				for(int j=array[i].length-1; i>=0;i--) {
					cnt++;
					array[i][j]=cnt;
			}
		}
	}
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.println(array[i][j]);
			}
			System.out.println("");
		}

}
}
