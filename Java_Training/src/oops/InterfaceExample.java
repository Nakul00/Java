package oops;

interface One {
	int a = 10;
	void method();  //abstract method
}

interface Two {
	int b = 20;
	void show();
}

public class InterfaceExample implements One, Two{

	public static void main(String[] args) {
		
		InterfaceExample ie = new InterfaceExample();
		ie.method();
		ie.show();
		
		
		
		
		

	}

	@Override
	public void show() {
		
		System.out.println("Method of interface Two");

	}
	@Override
	public void method() {
		
		System.out.println("Method of interface One");
	}

}
