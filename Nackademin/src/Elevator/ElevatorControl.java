package Elevator;

import java.util.Scanner;

public class ElevatorControl {

	public static void main(String[] args) {
		ElevatorControl e =new ElevatorControl();
		e.controll();
	

	}
	private void controll()
	{
		Scanner scanner = new Scanner(System.in);
		Elevator el = new Elevator();
		
		//scanner.nextLine();
		while (true)
		{
			System.out.println("where do you want to go?");
			int floor = scanner.nextInt();
			//if (floor > 10 || floor  < -3)
			//{
				//System.out.println("Huset har bara 3 v�ningar upp och 3 k�llarv�ningar ");
				//continue;
			//}
			
			if (floor >= el.getCurrentFloor() )
				el.goUp(floor);
			else if (floor <=el.getCurrentFloor())
				el.goDown(floor);
			
		}
	}

}
