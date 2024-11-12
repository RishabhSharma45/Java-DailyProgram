package dailyJava;

public class Employee1 {
	
	private int id;
	private String name;
	private String dept;
	
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee1(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}


public static void main(String args[]) {
	Employee1 emp1 = new Employee1(1,"rohit","computer science");
	Employee1 emp2 = new Employee1(2,"virat","computer science");
	Employee1 emp3 = new Employee1(3,"msd","computer science");
	Employee1 emp4 = new Employee1(4,"messi","computer science");
	Employee1 emp5 = new Employee1(5,"mbappe","computer science");
	Employee1 emp6 = new Employee1();
	emp6.setId(6);
	emp6.setName("Jokovich");
	emp6.setDept("cse");
	
	System.out.println(emp6.getId()+" "+emp6.getName()+" "+emp6.getDept());
	
	
}
	
	
	}
	
