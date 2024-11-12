package dailyJava;

public class Student {
	
	private String name;
	private int rollNumber;
	private int[] marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	int getAverageMarks() {
		int average = 0;
		for(int mark : marks) {
			average = average + mark;
		}
		return average;
	}
	
	int[] setMarks(int marks1 , int marks2 , int marks3 , int marks4 , int marks5) {
		marks[0] = marks1;
		marks[0] = marks1;
		marks[0] = marks1;
		marks[0] = marks1;
		marks[0] = marks1;
		
		return marks;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
