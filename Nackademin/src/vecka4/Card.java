package vecka4;

public class Card {
	
	private final String COLOR, VALUE;
	
	Card(int n, int c)
	{
		COLOR = color(c);
		VALUE = cardName(n);
	}
	public String ToString()
	{		
		return this.COLOR +" " +this.VALUE;
	}
	
	private String color(int v)
	{
		switch (v) {
		case 1: return "Hearts";
		case 2: return "Spades";
		case 3: return "Diamond";
		case 4: return "Clubs";	
		}
		return null;
	}
	
	private String cardName(int cardType) {
		switch(cardType)
		{
		case 2 : return "2";
		case 3 : return "3";
		case 4 : return "4";
		case 5 : return "5";
		case 6 : return "6";
		case 7 : return "7";
		case 8 : return "8";
		case 9 : return "9";
		case 10 : return "10";
		case 11 : return "Knight";
		case 12 : return "Dame";
		case 13 : return "King";
		case 14 : return "Ace";
		default : return "error";
		}
	}
}
