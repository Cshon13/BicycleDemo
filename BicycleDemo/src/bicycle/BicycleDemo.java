package bicycle;
        
public class BicycleDemo {
	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		bike1.bikeName("Slow Blue");
		bike2.bikeName("Fast Red");
		int cadence = 50;
		int speed = 30;
		int gear = 3;
		
		bike1.initialize(cadence,speed,gear);
		bike2.initialize(cadence,speed,gear);
		bike1.printStates();
		bike2.printStates();
		
		bike1.changeGear(-1);
		bike1.printStates();
		
		bike2.changeSpeed(5);
		bike2.printStates();
		
		bike2.changeCadence(10);
		bike2.printStates();
		
		bike2.changeCadence(20);
		bike2.printStates();
		
		bike2.applyBrakes(20);
		bike2.printStates();
		
		bike1.changeGear(-2);
		bike1.printStates();
                System.out.println("BicycleDemo has been finished.");
	}
}



