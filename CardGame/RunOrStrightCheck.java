package CardGame;

public class RunOrStraightCheck implements Checkable{

  private ArrayList<Card> cards;

  public RunOrStraightCheck(){
    
  }

  public boolean check(ArrayList<Card> cards){
    // Any running flush beats any run with mixed suits - so for example heart4-heart3-heart2 beats diamond3-club2-heartA or heartA-diamondK-diamondQ.
  }
  
}