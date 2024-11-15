package day5;

public class Question2 {

	public static void main(String[] args) {
		
		//Write an program to print the array element from 1 to 100 
		
		int[] arr = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf(arr[i]+" ");
		}
		
		
	}

}
