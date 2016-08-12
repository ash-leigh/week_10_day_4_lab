package CardGame;

public class RunningFlushCheck implements Checkable{

  private ArrayList<Card> cards;

  public RunningFlushCheck(){
    
  }

  public boolean check(ArrayList<Card> cards){
    // A running flush is a set of three consecutive cards of the same suit. A run is a set of three consecutive cards of mixed suits. Although the ace is high, A-2-3 counts as a valid run - or a valid running flush if all the cards are the same suit. In fact A-2-3 is the highest run or running flush, A-K-Q of a suit is the second highest, then K-Q-J, and so on down to 4-3-2, which is the lowest. 2-A-K is not a valid run or running flush.
  }
  
}