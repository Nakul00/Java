package oops;

import java.time.LocalDateTime;

@FunctionalInterface
interface MN {
	String show();
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		MN m = () -> {
			return "Current Date and Time" +" " +LocalDateTime.now();
		};
		
		System.out.println(m.show());

	}

}
