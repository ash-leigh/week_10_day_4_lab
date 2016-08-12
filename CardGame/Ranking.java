package CardGame;
import java.util.*;

public class Ranking{

  private ArrayList<Card> player1Hand;
  private ArrayList<Card> player2Hand;

  public Ranking(ArrayList<Card> player1Hand, ArrayList<Card> player2Hand){
    this.player1Hand = player1Hand;
    this.player2Hand = player2Hand;
  }

  public ArrayList<Card> getPlayer1Hand(){
    return this.player1Hand;
  }

  public ArrayList<Card> getPlayer2Hand(){
    return this.player2Hand;
  }

}