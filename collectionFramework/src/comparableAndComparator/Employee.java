package comparableAndComparator;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private String city;
	
	Employee(int id , String name , String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.id, this.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	
	
}
