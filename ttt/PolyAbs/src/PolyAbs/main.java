package PolyAbs;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car toyota = new Car("asdjhi","toyota",2001,4);
		Car bmw = new Car("gahasf","bmw", 2015,2);
		Motorcycle mt15 = new Motorcycle("dha-1231","mt15",2021, false);
		Motorcycle honda50 = new Motorcycle("dha-1111","honda50", 1940, true);
		
		toyota.displayInfo();
		honda50.displayInfo();
	}

}
