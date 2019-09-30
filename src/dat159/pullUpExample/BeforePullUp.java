package dat159.pullUpExample;

class Vehicle {
	String capacity;

	public String getCapacity() {
		return capacity;
	}
}

class Bus extends Vehicle{
	
	public Bus(int length, int width, int heigth) {
		capacity = calculateCapacity(length, width, heigth);
	}
	
	/*
	 * Returning number of seats on the bus
	 * Estimating one seat per 2 cube meters. This account for heigth if the bus is a double decker.
	 */
	public String calculateCapacity(int length, int width, int heigth){
		int number = (length*width*heigth)/2;
		return number + " seats.";
	}
}

class Truck extends Vehicle{
	
	public Truck(int length, int width, int heigth) {
		capacity = calculateCapacity(length, width, heigth);
	}
	
	
	/* 
	 * Returning load capacity of the truck
	 */
	public String calculateCapacity(int length, int width, int heigth){
		int number = length*width*heigth;
		return number + " cubic meters.";
	}
}

public class BeforePullUp{
	public static void main(String[] args) {
		Bus bus = new Bus(15, 3, 2);
		Truck truck = new Truck(15, 3, 2);
		
		System.out.println("The truck has a capacity of " + truck.getCapacity());
		System.out.println("The bus has a capacity of " + bus.getCapacity());
	}
}
