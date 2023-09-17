package oops;

interface ABC {
	String show(String s1, String s2);
}

public class LambdaExpressionEx1 {

	public static void main(String[] args) {
		
		ABC a = (s1,s2) -> s1.concat(s2);
		System.out.println(a.show("Java " ,"Programming"));
		
		
		


	}

}
