package oops;

public class ConstructorEx {

		
		int a = 10;
		
		ConstructorEx()
		{
			this(10);
			System.out.println("Default constructor");
		}
		
		ConstructorEx(int a)
		{
			this(2,3);
			this.a = a;
			System.out.println("Parameterized constructor");
			System.out.println(a);
		}
		
		ConstructorEx(int a, int b)
		{
			System.out.println("Another Parameterized constructor");
		}
		
		public static void main(String[] args) {
			
			ConstructorEx ce = new ConstructorEx();
			ConstructorEx ce1 = new ConstructorEx(100);
			ConstructorEx ce2 = new ConstructorEx(2,3);
			
			
		}
		
		

	}


