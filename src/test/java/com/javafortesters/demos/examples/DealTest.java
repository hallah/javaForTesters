package com.javafortesters.demos.examples;

import com.javafortesters.business.Card;
import com.javafortesters.business.Dealer;
import com.javafortesters.business.Deck;
import com.javafortesters.business.Player;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DealTest {
	@Test
	public void testDealingOfCards() {
		Deck deck = new Deck();
		List<Player> players = deck.getPlayers();
		Dealer.deal(deck.getDeck(), players);

		for (int i = 0; i < players.size(); i++) {
			List<Card> cardsInHand = players.get(i).getCardsInHand();
			assertThat(cardsInHand.size(), is(5));

			outputCardDetailsToConsole(players, i, cardsInHand, deck);
		}
		assertThat(deck.getDeck().size(), is(32));
	}

	private void outputCardDetailsToConsole(List<Player> players, int playerNumber, List<Card> cardsInHand, Deck deck) {
		System.out.println(players.get(playerNumber).getName() + " has the following cards:");
		for (Card aCard : cardsInHand) {
			System.out.println(aCard.toString());
		}
		System.out.println("The deck has " + deck.getDeck().size() + " cards in it.");
		System.out.println();
	}
}