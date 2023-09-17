package oops;

abstract class AB {			//abstract class
	
	int a = 10;
	
	abstract void method();  //abstract method
	
	void show()
	{
		System.out.println("Non abstract method of abstract class");
	}
	
}


public class AbstractExample extends AB {

	public static void main(String[] args) {
		
		
		AbstractExample ae = new AbstractExample();
		ae.method();
		ae.show();

	}

	@Override
	void method() {
		
		System.out.println("Abstract method of abstract class");
		
	}

}
