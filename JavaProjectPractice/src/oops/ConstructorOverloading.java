package oops;

public class ConstructorOverloading {
	
	int a=0;
	int b=0;
	double c=0.0;
	
	 ConstructorOverloading(){
		  a=10;
		  b=20;
		  c=30.5;
	 }
	 
	 ConstructorOverloading(int a, int b){
		 this.a=a;
		 this.b=b;
	 }
	 
	 ConstructorOverloading(int x, double y){
		 a=x;
		 c=y;
		 
	 }
	 
	 ConstructorOverloading(int x, int y, double z){
		 a=x;
		 b=y;
		 c=z;
	 }
	 
	 void display() {
		 System.out.println("a=" + a +" b=" + b + " c=" + c);
	 }

	public static void main(String[] args) {
		 ConstructorOverloading co = new  ConstructorOverloading();
		 co.display();
		 ConstructorOverloading co1= new  ConstructorOverloading(5,6);
		 co1.display();
		 ConstructorOverloading co2 = new  ConstructorOverloading(5,6.5);
		 co2.display();
		 ConstructorOverloading co3 = new  ConstructorOverloading(4,5,6.5);
		 co3.display();

	}

}
