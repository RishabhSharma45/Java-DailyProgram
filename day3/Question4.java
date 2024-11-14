package day3;

public class Question4 {
	
	/*
	 *  Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.

	  Input: 2 4 5 3 6 7 9 4 5 6

	 Output:

	       Sub array: 5 3 6 7 9

	       2nd Highest element: 7
	 */
	
	static int[] subArray(int[] arr , int i , int j) {
		int[] newArr = new int[j];
		int k = 0;
		for(int l=i;l<=j+1;l++) {
			newArr[k++] = arr[l];
		}
		return newArr;
	}
	
	static int highest(int[] arr) {
		int a = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a) {
				a = arr[i];
			}
		}
		return a;
	}
	
	static int secondHighest(int[] arr) {
		int a = highest(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		return highest(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2 ,4 ,5 ,3 ,6 ,7 ,9 ,4 ,5 ,6};
		int[] newArr = subArray(arr, 2, 5);
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
		
		System.out.println(secondHighest(newArr));
		
		

	}

}
