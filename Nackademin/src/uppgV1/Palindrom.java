package uppgV1;
import java.util.Scanner;


public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
		System.out.println("skriv in ett ord och kontrollera om det är en pallindrom, avsluta med att skriva 0");
		String input = scanner.next();
		if (input.equals("0"))
			System.exit(0);
		pallindrom(input);
		
		}	
	}
	private static void pallindrom(String input)
	{
		int lenghtOf = input.length();
		String reverse = "";
		
			for (int j = lenghtOf-1; j >=0; j--)
					reverse += input.charAt(j);
			System.out.println(reverse);
					
			if (reverse.equals(input)) 
				System.out.println(input +" är en pallindrom! " );
			else
				System.out.println(input +" är inte en pallindrom" );	
		
	}
	

}
