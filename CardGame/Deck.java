package CardGame;
import java.util.*;

public class Deck{

  private ArrayList<Card> cards;
  private SuitType suits;
  private NumberType numbers;
 

  public Deck(SuitType suits, NumberType numbers){
    this.cards = new ArrayList<Card>();
    this.suits = suits;
    this.numbers = numbers;
  }

  public ArrayList getCards(){
    for (SuitType suit : SuitType.values()){
      for (NumberType number : NumberType.values()){
        Card card = new Card(suit, number);
        this.cards.add(card);
      }
    }
    return this.cards;
  }

}

