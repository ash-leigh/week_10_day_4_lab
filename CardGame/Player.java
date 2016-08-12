package CardGame;
import java.util.*;

public class Player{

  private ArrayList<Card> hand;

  public Player(){
    this.hand = new ArrayList<Card>();
  }

  public ArrayList<Card> getHand(){
    return this.hand;
  }

  public void receiveCard(Card card){
    this.hand.add(card);
  }

}