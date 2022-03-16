package Multithred_Demo;

public class Multithreading1 {

	public static void main(String[] args) {

		for (int i=0;i<5;i++) {
		
			MultithreadThing1 myThing1 = new MultithreadThing1(i);
			Thread myThread = new Thread(myThing1);
			myThread.start();
		}
		
	}

}
