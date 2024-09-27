package day3;

public class Question4 {
	
	public static int[] subArray(int[] arr , int st , int end) {
		int[] newArr = new int[end-st+1];
		int count = 0;
		for(int i=st;i<=end;i++) {
			newArr[count++] = arr[i];
		}
		return newArr;
	}
	
	public static int highestEle(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int secondHighestEle(int[] arr) {
		int max = highestEle(arr); 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		return highestEle(arr);
	}
	
public static void main(String args[]) {
	int[] arr = {2,4,5,3,6,7,9,4,5,6};
	arr = subArray(arr,2,6);
	int ans =secondHighestEle(arr);
	System.out.println(ans);
}
}
