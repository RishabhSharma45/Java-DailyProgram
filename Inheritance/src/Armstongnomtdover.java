import java.util.Scanner;
public class Armstongnomtdover {

	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	int sum1 = 0;
	
	public int enterno(){
		System.out.println("enter a no.");
		return number;
		}
	int a = 0;
	public int length(int l) {
		if(l>=1 || l<=9) {
			return a++;
		}
		a++;
		length(l/10);
		return a;
	}
	
	public int pow(int i , int j ) {
		if(j==1) {
			return i;
		}
		return i*pow(i,j-1);
	}
	
	public int sum(int l) {
		if(l>=1 || l<=9) {
			sum1 = sum1 + pow(l,a);
			return sum1;
		}
		int s = l%10;
		sum1 = pow(s,a);
		sum1 = sum1+sum(l/10);
		return sum1;
	}
	
}
class nextto extends Armstongnomtdover{
	
	public int enterno() {
		
		int a = sum;
		return n;
		
	}
	
	}
	

