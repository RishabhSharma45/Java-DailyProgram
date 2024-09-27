package Practise;

public class class1 implements Shape1 {
   public static void main(String args[]) {
	   Shape1 s = new class1();
	   System.out.println(s.area());
	   }

@Override
public double area() {
	// TODO Auto-generated method stub
	int radius = 7;
	return 3.14*radius*radius;
}
}
