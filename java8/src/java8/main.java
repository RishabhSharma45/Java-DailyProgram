package java8;

public class main {
	public static void main(String args[]) {
		Runnable runnable = ()->{
			for(int i=0;i<5;i++){
				System.out.println(i);
				}
		};
		//Thread1 t1 = new Thread1();
		Thread thread = new Thread(runnable);
		runnable.run();
	}

}
