package practicemultithreading;

public class ThreadX extends Thread{
	
	public void run()
	{
		System.out.println("It is ThreadX class");
	}
	
	public static void main(String args[]) {
		
		Thread th = new Thread (new ThreadX(), "FirstThread");
		Thread t1 = new Thread (new ThreadX());
		System.out.println("Name of th = " +th.getName());
		System.out.println("Name of t1 = " +t1.getName());
		
		th.start();
		t1.start();
	}
	
	
}
