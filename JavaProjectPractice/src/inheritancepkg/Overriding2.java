package inheritancepkg;

class Vehicle {
	void run() {
		System.out.println("verhicle is running");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
	
		/*Vehicle vobj = new Vehicle();
		vobj.run();*/
		
		Bike b=new Bike();
		b.run();

	}

}
