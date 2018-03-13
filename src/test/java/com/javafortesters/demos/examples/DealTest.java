package com.javafortesters.demos.examples;

import com.javafortesters.business.Card;
import com.javafortesters.business.Dealer;
import com.javafortesters.business.Deck;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DealTest {
	@Test
	public void testDealingOfCards() {
		Deck deck = new Deck();
		Dealer.deal(deck.getDeck(), deck.getPlayers());

		for (int i = 0; i < deck.getPlayers().size(); i++) {
			assertThat(deck.getPlayers().get(i).getCardsInHand().size(), is(5));

			System.out.println(deck.getPlayers().get(i).getName() + " has the following cards:");
			for (Card aCard : deck.getPlayers().get(i).getCardsInHand()) {
				System.out.println(aCard.toString());
			}
			System.out.println();
		}
		assertThat(deck.getDeck().size(), is(32));
	}
}