package oops;

class A { 
	A(){ 
		System.out.println("Constructor of class A ");
	}
	void methodA(){ 
		System.out.println("Method of the class A");
	}
}
class B extends A{ 
	B(){ 
		System.out.println("Constructor of class B ");
	}
	void methodB(){ 
		super.methodA();
		System.out.println("Method of the class B");
	}
}
class C extends B{ 
	C(){ 
		System.out.println("Constructor of class C ");
	}
	void methodC(){ 
		System.out.println("Method of the class C");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		
		/*A a = new A(); 
		a.methodA();
		B b = new B(); 
		b.methodB();
		C c = new C(); 
		c.methodC();*/
		
		
		A a = new B(); 
		((B) a).methodB();
		//a.methodA();
		A c= new C();
		((C) c).methodC();
		


	}

}
