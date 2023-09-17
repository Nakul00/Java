package practicemultithreading;

//creation of thread by implementing runnable interface

public class MyThreadClass implements Runnable {
	
	public void run()
	{
		System.out.println("This is runnable implementation");
	}
	


	public static void main(String[] args) {
		
		Thread th = new Thread(new MyThreadClass());
		th.start();
		
		}
}


