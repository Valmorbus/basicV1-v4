package Elevator;

public class Elevator extends Building{
	
	private int currentFloor = 0;
	private int floor;
	
	
	public void goUp(int floor)
	{
		if (floor == currentFloor)
			System.out.println("already at " +floor);
		else if (floor > floorsUp)
		{
			System.out.println("The Boulding only has  " + floorsUp +" floors");
		}
		else
			for (int i = currentFloor; i <= floor; i++) {
				System.out.println("at floor " +i);
				if (i == floor)
					System.out.println("pling, arrived at floor " + floor);
		}
		setCurrentFloor(floor);
	}
	public void goDown(int floor)
	{
		if (floor == currentFloor)
			System.out.println("already at " +floor);
		else if (floor < floorsUp)
		{
			System.out.println("The Boulding only has  " + Math.abs(floorsDown) +" basement floors");
		}
		else
			for (int i = currentFloor; i >= floor; i--) {
				System.out.println("at floor " +i);
				if (i == floor)
					System.out.println("pling, arrived at floor " + floor);
		}
		setCurrentFloor(floor);
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}

}
