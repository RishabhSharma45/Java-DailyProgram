import java.util.Scanner;
public class pattern {
	
	public void swap(int a , int b) {
		a = a+b; //a=5,b=4 b=9 
		b = a-b;
		a = a-b;
		
		
	}
	
	public static String reversestring(String a) {
		//nitin
		int i = 0,j=a.length()-1;
		while(i<j) {
			char s = a.charAt(i);
			char s2 = a.charAt(j);
			a.replace(s, s2);
			i++;
			j--;
		}
		return a;
	}
	
	public static void palindrome(String a) {
		String b = reversestring(a);
		if(a.matches(b)) {
		System.out.println("valid palindrome");
		}
		else {
			System.out.println("not a valid palindrome");
		}
		
	}

	public static void main(String[] args) {
		/*int n=6;
	int a = 1;
	System.out.print(" " + a+ " ");
	System.out.println();
	System.out.println(++a + " " + a);
	
	for(a=3;a<=n;a++){
		for(int i=1;i<=a;i++)  {
		System.out.print(a +" ");
	}
		System.out.println();
	}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}*/
		
		palindrome("nitin");
		
		
	}

}
