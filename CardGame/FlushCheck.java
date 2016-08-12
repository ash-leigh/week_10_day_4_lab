package CardGame;

public class FlushCheck implements Checkable{

  // private ArrayList<Card> cards;

  public FlushCheck(){
   
  }

  public boolean check(ArrayList<Card> cards){
    // A flush consists of three cards of the same suit - not all consecutive, or it would be a running flush. When comparing flushes, the highest card is compared first, then if these are equal the middle card, and finally if necessary the lowest. Therefore heartK-heart9-heart2 beats spadeQ-spade10-spade5, which beats diamondQ-diamond10-diamond3, which beats clubQ-club9-club8.
  }

}