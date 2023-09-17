package oops;

interface GH {
	int show(int a, int b);
	
}


public class LambdaExpressionEx {

	public static void main(String[] args) {
		GH g = (a,b) -> a + b;
		System.out.println(g.show(100,100));
		

	}

}
