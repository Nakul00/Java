package practicemultithreading;

//creation of new thread by extending thread class

public class MyClass extends Thread{
	
	MyClass()
	{
		super("MyThread");   //same output without this line. getting the name of the thread
		start();
	}
	
	public void run()
	{
		System.out.println("It is MyThread");
	}
	

	public static void main(String[] args) {
		
		new MyClass();

	}

}
