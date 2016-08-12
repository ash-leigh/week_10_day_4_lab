package CardGame;

public class PairCheck implements Checkable{

  private ArrayList<Card> cards;

  public PairCheck(){
 
  }

  public boolean check(ArrayList<Card> cards){
     // A pair consists of two cards of equal rank. The third card is of a different rank, otherwise you would have a prial. When comparing pairs, the rank of the pair is compared first (aces are highest), and if two players have the same pair the odd card determines which and is higher. So for example 9-9-3 beats 8-8-K, which beats 8-8-J.
  }
 
}