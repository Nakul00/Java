package oops;

class Person {
	
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Nakul");
		p.setCity("Aldie");
		
		System.out.println(p.getName() + " " + p.getCity());
		
		
		

	}

}
