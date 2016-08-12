package CardGame;

public class HighCardCheck implements Checkable{

  private ArrayList<Card> cards;

  public HighCardCheck(){
    
  }

  public boolean check(ArrayList<Card> cards){
     // Three cards that do not form any of the above combinations. As with flushes, these rank according to the highest card; if the highest cards of two hands are equal the second highest cards are compared, and if these are equal too then the third highest. So J-6-3 beats 10-9-7, which beats 10-9-6.
  }
  
}