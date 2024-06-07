package 계산기;

public class triangle implements Figure{
	private double width;
	private double height;
	
	public triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double calArea() {
		return width*height/2;
	}
	
}
