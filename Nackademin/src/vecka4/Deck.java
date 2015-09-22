package vecka4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{

	public static void main(String[] args) {
		Deck deck = new Deck();
		ArrayList<Card> card = deck.generateDeck();
		
		for (int i = 0; i < card.size(); i++) {
			System.out.println(card.get(i).ToString());
		}
		Card card1 = deck.deal(card);
		Collections.shuffle(card);
		
		for (int i = 0; i <card.size(); i++) {
			System.out.println("shuffled " +card.get(i).ToString());
		}
		
		
		System.out.println(card1.ToString());

	}
	private ArrayList<Card> generateDeck()
	{
		ArrayList<Card> card = new ArrayList<Card>();
		for (int j =1; j <=4; j++)
			for (int i = 1; i < 14; i++) {
			card.add(new Card(i+1, j));
			}
		return card;
	}
	private Card deal(ArrayList<Card> deck)
	{
		Random r = new Random();
		
		
		return deck.get(r.nextInt(52));
		
	}

}
