package Mass.one;

import java.util.Scanner;

class Elevator{
	private int currentFloor;
	
	public Elevator() {
		currentFloor =1;
	}

 void selectFloor() {
	 Scanner scan= new Scanner(System.in);
	 String choice;
	 do {
		 System.out.println("Options: (s)elect a floor, (f)ire alarm, (q)uit");
		 System.out.println("Enter s, f, or q ==> ");
		 choice= scan.nextLine().toLowerCase();
		 switch(choice) {
		 case "s" :
			 int floor;
			 do {
				 System.out.println("Enter the floor that you'd like to go to ==> ");
				 floor = scan.nextInt();
				 scan.nextLine();
				 if(floor < 1 || floor > 10 ) {
					 System.out.println("Invalid floor selection. Please enter a floor between 1 and 10.");
				 }
			 }while (floor < 1 || floor > 10);
             moveElevator(floor);
             break;
			
		 case "f":
			 fireAlarm();
             break;
		 case "q":
             System.out.println("Goodbye!");
             break;
         default:
             System.out.println("Invalid selection. Please enter s, f, or q.");
             break;
		 }
		 
		 
	 }while(!choice.equals("q"));
	 
 }
 
private void moveElevator(int floor) {
	if (floor > currentFloor) {
        System.out.print("Going up..");
        for (int i = currentFloor + 1; i <= floor; i++) {
            System.out.print(i + "..");
        }
    } else if (floor < currentFloor) {
        System.out.print("Going down..");
        for (int i = currentFloor - 1; i >= floor; i--) {
            System.out.print(i + "..");
        }
    } else {
        System.out.print("You are already on floor " + currentFloor + ".");
    }
    currentFloor = floor;
    System.out.println("Ding!");
	
}
private void fireAlarm() {
	 System.out.println("Danger! You must exit the building now!");
    moveElevator(1);
}
}


public class ElevatorDriver {

	public static void main(String[] args) {
		Elevator elevator = new Elevator();
        elevator.selectFloor();

	}

}
