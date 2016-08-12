package CardGame;
import java.util.*;

public class Dealer{

  private ArrayList<Card> deck;

  public Dealer(ArrayList<Card> deck){
    this.deck = deck;
  }

  public ArrayList<Card> showDeck(){
    return this.deck;
  }

  public void shuffleDeck(){
    Collections.shuffle(this.deck);
  }

  public Card dealCard(){
    Card card = this.deck.remove(0);
    return card;
  }



}