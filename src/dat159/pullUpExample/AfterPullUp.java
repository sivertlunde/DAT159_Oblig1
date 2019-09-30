package dat159.pullUpExample;

class Vehicle2 {
	String capacity;

	public String getCapacity() {
		return capacity;
	}
	
	/*
	 * Returning capacity as String
	 */
	public String calculateCapacity(int length, int width, int heigth){
		int number = (length*width*heigth)/2;
		return number + " seats.";
	}

}

class Bus2 extends Vehicle2{
	
	public Bus2(int length, int width, int heigth) {
		capacity = calculateCapacity(length, width, heigth);
	}
}

class Truck2 extends Vehicle2{
	
	public Truck2(int length, int width, int heigth) {
		capacity = calculateCapacity(length, width, heigth);
	}
}

public class AfterPullUp {
	public static void main(String[] args) {
		Bus2 bus = new Bus2(15, 3, 2);
		Truck2 truck = new Truck2(15, 3, 2);
		
		System.out.println("The truck has a capacity of " + truck.getCapacity());
		System.out.println("The bus has a capacity of " + bus.getCapacity());
	}

}
