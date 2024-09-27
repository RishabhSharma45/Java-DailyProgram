package array;

public class Day1RemembringProblems {
	
    //TargetSumProblems pairs+triplets
	public static int targetSumProblemTriplet(int[] a , int target) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==target) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static int targetSumProblemPair(int[] a , int target) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
					if(a[i]+a[j]==target) {
						count++;
				}
			}
		}
		return count;
	}
	
	//how many repeating pairs
	public static int repeatingPairs(int[] a) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			}
		}
		return count;
	}
	
	//second largest and second smallest
	public static int largest(int[] a) {
		int num = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>num) {
				num = a[i];
			}
		}
		return num;
	}
	public static int smallest(int[] a) {
		int num = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=num) {
				num = a[i];
			}
		}
		return num;
	}
	public static int SecondLargest(int[] a) {
		int num = largest(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				a[i] = Integer.MIN_VALUE;
			}
		}
		return largest(a);
	}
	public static int SecondSmallest(int[] a) {
		int num = smallest(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				a[i] = Integer.MAX_VALUE;
			}
		}
		return smallest(a);

	}
	
	//sort
	public static void arraySortDsc(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
	}
		
	
	public static void arraySortAsc(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
	}
	
	//any no. of lagest and smallest   than ok sort it and ak for any no. of element
	public static int anyNumLargest(int[] a , int num) {
	 arraySortAsc(a);
		return a[num-1];
		
	}
	
	public static int anyNumSmallest(int[] a , int num) {
		 arraySortDsc(a);
		return a[num-1];
		
	}
	
	
	//swap integer  using temp. variable + inplace
	
	  public static int[] swapUsingVar(int a , int b) {
		 int c = a;
		  a = b ;
		  b = c ;
		  return new int[] {a,b};
	  }
	  
	  public static int[] swapInplace(int a,int b) {
		  b = a+b;
		  a = b-a;
		  b = b-a;
		  return new int[] {a,b};
	  }
	
	
	//reverse array  temp array + inplace
	  public static int[] reverseArrayUsingTepmArray(int[] a) {
		  int[] b = new int[a.length];
		  int count = 0 ;
		  for(int i=a.length-1;i>=0;i--) {
			  b[count++] = a[i];
		  }
		  return b;
	  }
	  
	  public static void reverseArrayInplace(int[] a) {
		  int i = 0;
		  int j = a.length-1;
		  while(i<j) {
			  int temp = a[i];
			  a[i] = a[j];
			  a[j] = temp;
			  i++;
			  j--;
		  }
	  }
	// rotate array by k steps  temp array + inplace
	  public static int[] rotateArrayUsingTempArray(int[] arr , int k) {
		  //1 2 3 4 5 6 7 let by 3 - 5 6 7 1 2 3 4
		  int[] newArr = new int[arr.length];
		  int count = 0;
		  int j = arr.length-k;
		  for(int i=arr.length-k;i<arr.length;i++) {
			  newArr[count++] = arr[i];
		  }
		  for(int i=0;i<arr.length-k;i++) {
			  newArr[count++] = arr[i];
		  }
		  return newArr;
	  }
	  
     public static void rotateArrayInplace(int[] arr , int k) {
		  int i = 1;
		  int j = arr.length-k;
		  int ans = arr[0];
		  
		  while(j<arr.length) {
		  int temp = arr[i];
		  arr[i-1]= arr[j];
		  arr[j] = temp;
		  i++;
		  j++;
		  }
		  arr[arr.length-k-1] = ans;
	  }
	  
	  
	// sort an array consisting 0's and 1's by both approaches  counting + two pointers
       public static void arraysOf0sAnd1sViaCounting(int[] a) {
    	   // 1 0 1 0 1 0 1 1 1 0
    	   int count = 0;
    	   int count0 = 0;
    	   int count1 = 0;
    	   for(int i=0;i<a.length;i++) {
    		   if(a[i]==0) {
    			   count0++;
    		   }
    		   else {
    			  count1++; 
    		   }
    	   }
    	   for(int i = 0;i<count0;i++) {
    		   a[count++] = 0;
    	   }
    	   for(int i = 0;i<count1;i++) {
    		   a[count++] = 1;
    	   }
       }
       
       public static void arraysOf0sAnd1sTwoPointer(int[] a) {
    	   //  0 1 0 1 0 1 1 
    	 int i = 0;
    	 int j = a.length-1;
    	   while(i<j) {
    		   if(a[i]==0) i++;
    		   if(a[j]==1) j--;
    		   if(a[i]==1 && a[j]==0) {
    			   a[i] = 0;
    			   a[j] = 1;
    			   i++;
    			   j--;
    		   }
    		   else {
    			   a[i] = 1;
    			   a[j] = 0;
    			   i++;
    			   j--;
    		   }
    	   }
       }
	// even and odd arrangement
	// prefix and suffix sum
	// equal sum subarray
	// 2d array addition and multiplication
	// transpose of matrix
	// rotation of array -- transpose + reverse
	// pascals array
	
	
	public static void main(String args[]) {
		int a[] = {0,1,0,1,0,1,1}; //1234567 7654321
		//System.out.println(targetSumProblemTriplet(a,6));
		//System.out.println(targetSumProblemPair(a,6));
		//System.out.println(repeatingPairs(a));
		//System.out.println(largest(a));
		//System.out.println(smallest(a));
		//System.out.println(SecondLargest(a));
		//System.out.println(SecondSmallest(a));
		 //arraySortDsc(a);
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		//System.out.println(anyNumLargest(a,6));
		//System.out.println(anyNumSmallest(a,5));
		//int a1=5,b1=6;
		//swapUsingVar(a1,b1);
		//int[] swapped = swapUsingVar(a1,b1);
		//a1= swapped[0];
		//b1= swapped[1];
		/*swapInplace(a1,b1);
		int[] swapped = swapInplace(a1,b1);
		a1 = swapped[0];
		b1 = swapped[1];
		System.out.println("a1:"+a1+" "+"b1:"+b1);*/
		/*a = reverseArrayUsingTepmArray(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}*/
		 /*reverseArrayInplace(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}*/
		
		 /*rotateArrayInplace(a ,3);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		/*arraysOf0sAnd1sViaCounting(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		arraysOf0sAnd1sTwoPointer(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}	
}
