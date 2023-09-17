package oops;

interface XY {
	
	void print();
	
	default void show()
	{
		System.out.println("Default method of an interface");
	}
	
	static void display()
	{
		System.out.println("Static method of an interface");
	}
	
}

public class InterfaceExample1 implements XY{

	public static void main(String[] args) {
		
		InterfaceExample1 ie = new InterfaceExample1();
		ie.show();
		ie.print();
		XY.display();
		
				

	}

	@Override
	public void print() {
		System.out.println("Abstract method of an interface");
		
	}

}
