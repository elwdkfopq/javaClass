package 계산기;

public class circle implements Figure {
	private double radius;
	
	
	
	
	
	public circle(double radius) {
		super();
		this.radius = radius;
	}





	public double calArea() {
		return radius*radius*3.14;
	}
}
