package uppgV1;
import java.util.Scanner;



public class uppg1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String fornamn;
		String efternamn;
		int nummer1, nummer2;
		
		System.out.println("Skriv ditt förnamn");
		Scanner data = new Scanner (System.in);
		fornamn = data.nextLine();
		System.out.println("skriv ditt Efternamn");
		efternamn = data.nextLine();
		System.out.println("Hej " + fornamn + " " +efternamn);
		
		System.out.println("Skriv ett nummer: ");
		nummer1 = data.nextInt();
		System.out.println("Var vill du börja multiplikationen? Skriv in nummer: ");
		nummer2 = data.nextInt();
		multiplikation(nummer1, nummer2);
		System.out.println("ange en radie för en cirkel");
		float radie = data.nextFloat();
		cirkel(radie);
		
		int nummer3;
		System.out.println("Skriv ett tal så kollar vi om det är udda eller jämnt");
		nummer3 =data.nextInt();
		uddaEllerJamnt(nummer3);
		data.close();
	}

	public static void multiplikation(int nummer1, int nummer2)
	{
		for (int i = nummer2; i<nummer2+10; i++)
		{
			System.out.println(nummer1*i);
		}
	}
	public static void cirkel(float radie)
	{
		System.out.println("diameter: " +radie*2);
		System.out.println("Omkretts: " +2*Math.PI*radie);
		System.out.println("Area: " +radie*radie*Math.PI);
	}
	public static void uddaEllerJamnt(int nummer)
	{	
		if (nummer%2 == 0)
			System.out.println("Talet är jämt! ");
		else if (nummer % 2 != 0)
			System.out.println("talet är ojämt");
	}
}
