package 계산기;

public class rectangle implements Figure{
	
	private double width;
	private double height;
	
	
	
	public rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}



	public double calArea(double width, double height) {
		return width*height;
	}
	
}
