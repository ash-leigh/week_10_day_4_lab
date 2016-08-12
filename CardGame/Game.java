package CardGame;
import java.util.*;

public class Game{

  private ArrayList<Player> players;
  private Dealer dealer;

  public Game(Dealer dealer){
    this.players = new ArrayList<Player>();
    this.dealer = dealer;
  }

  public ArrayList<Player> getPlayers(){
    return this.players;
  }

  public void addPlayer(Player player){
    this.players.add(player);
  }

  public void dealHand(){
    dealer.shuffleDeck();
    for(int i = 0; i < 3; i++){
      for(Player player : players){
        Card card = dealer.dealCard();
        player.receiveCard(card);
      }
    }
  }

}