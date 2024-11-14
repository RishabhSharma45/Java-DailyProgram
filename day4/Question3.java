package day4;

class HillStations{
	void location() {
		System.out.println("print location of hillstation");
	}
	void famousfor() {
		System.out.println(" and for what this hillstation is famous?");
	}
}

class Manali extends HillStations{
	void location() {
		System.out.println("i am manali ");
	}
	void famousfor() {
		System.out.println("famous for my attractive view and located i himachal padesh ");
	}
}

class Mussoorie extends HillStations{
	
	void location() {
		System.out.println("i am mussoorie");
	}

		void famousfor() {
		System.out.println("famous for my overcast canva ");
	}
}
class Gulmarg extends HillStations{
	void location() {
		System.out.println("i am Gulmarg");
	}
	void famousfor() {
		System.out.println("famous for my cold temperature may go below -20 degree celcius sometimes ");
	}
}

public class Question3 {
	
	/*
	 * Create one superclass HillStations
	 * and three subclasses Manali, Mussoorie, Gulmarg. 
	 * Subclasses extend the superclass
	 * and override its location() and famousFor() method. 
	 * i. call the location() and famousFor() method by the Parent class’,
	 * i.e. Hillstations class. 
	 * As it refers to the base class object and the base class method overrides the superclass method; 
	 * the base class method is invoked at runtime. 
	 * ii. call the location() and famousFor() method by the all subclass’,and print accordingly.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HillStations i = new HillStations();
		i.location();
		i.famousfor();
		Manali m = new Manali();
		m.location();
		m.famousfor();
		HillStations m2 = new Mussoorie();
		m2.location();
		m2.famousfor();
	}

}
