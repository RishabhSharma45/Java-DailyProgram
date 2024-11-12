package dailyJava;

public class Cicle {
	
	final double pi = 3.14159;
	private double radius;
	
	Cicle(double radius){
		this.radius=radius;
	}
	
	void area() {
		System.out.println(pi*radius*radius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cicle c = new Cicle(5d);
		c.area();

	}

}
