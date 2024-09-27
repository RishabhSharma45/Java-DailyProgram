package Practise;

public class Circle extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle();
		System.out.println(s.area());
       
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		double area = radius();
		return 3.14*area*area;
	}

}
