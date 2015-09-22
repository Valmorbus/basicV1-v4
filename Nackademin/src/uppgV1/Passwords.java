package uppgV1;
import java.util.Random;
import java.util.Scanner;


public class Passwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LÖSENORD
		System.out.println("Skriv in lösenord: ");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.next();
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i)))
				System.out.println(password.charAt(i)+ " is uppercase");
			else if (Character.isLowerCase(password.charAt(i)))
				System.out.println(password.charAt(i)+ " is lowercase");
			else if (Character.isDigit(password.charAt(i)))
				System.out.println(password.charAt(i) + " is not a letter");
			else
				System.out.println("vad fan är det här, en symbol kanske??? hehehe ");
			
			
		}
		//MATA IN ETT TAL
		int number = -1;
		while (number != 0){
			System.out.println("skriv in ett tal, avsluta med att trycka enbart en nolla");
			String temp = scanner.next();
			if (temp.matches("[0-9]+"))
				{
				number = Integer.parseInt(temp);//temp;//scanner.nextInt();
				System.out.println("number " +number + "OmNomNom");
				if (number == 0)
					{
					System.out.println("avslutar");
					//System.exit(0);
					}
				}
			}
			
		// GISSA TALET
		System.out.println("gissa ett nummer ");
		Random random = new Random();
		int theNumber = random.nextInt(1000);
		int guess = -1;
		int counter = 0;
		String temp = null;
		while (guess != theNumber)
		{
			
			temp = scanner.next();
			if (temp.matches("[0-9]+"))
				{
				guess = Integer.parseInt(temp);
				counter++;
				}
			else 
				System.out.println("inte ett nummer");
			if (guess < theNumber && guess >=0)
				System.out.println("nummret är större än " +guess);
			else if (guess > theNumber && guess >=0)
				System.out.println("nummret är mindre än " + guess);
			else if (guess == theNumber && guess >=0)
				{
				System.out.println("grattis! Du gissade " + guess + " och nummret var " + theNumber);
				System.out.println("du gissade " + counter + " gånger");
				}
				
			
		}
		
		
		
		scanner.close();
		
		

	}

}
