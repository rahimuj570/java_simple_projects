package PolyAbs;

public abstract class Vehicle {
	String plateNumber;
	String brand;
	int year;
	Vehicle(String pn,String b, int y){
		plateNumber = pn;
		brand = b;
		year = y;
	}
	abstract void displayInfo();

}

class Car extends Vehicle{
	int numDoors;
	
	Car(String pn, String b, int y, int nd){
		super(pn,b,y);
		numDoors = nd;
	}
	void displayInfo() {
		System.out.println("Number Plate: "+plateNumber);
		System.out.println("Number of doors: "+numDoors);
	}
}

class Motorcycle extends Vehicle{
	boolean hasSidecar;
	Motorcycle(String pn, String b, int y, boolean hsc){
		super(pn,b,y);
		hasSidecar = hsc;
	}
	void displayInfo() {
		System.out.println("Number Plate: "+plateNumber);
		System.out.println("Side car: "+hasSidecar);
	}
}
