package Interfaces;

interface Testinter{
	int a=10; // By default variable is static and final
	
	void display(); //abstract method
	
}

public class InterfaceExample implements Testinter {
	
	public void display() {
		System.out.println("Interface testing");
	}

	public static void main(String[] args) {
		InterfaceExample ie =new InterfaceExample();
		ie.display();
		
		Testinter ti = new InterfaceExample();
		ti.display();
		
	}

}
