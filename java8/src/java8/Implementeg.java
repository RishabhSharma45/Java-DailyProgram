package java8;

public class Implementeg implements Example {

	@Override
	public int setSalary() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		int salary = setSalary();
		System.out.println(salary);
		
	}

}
