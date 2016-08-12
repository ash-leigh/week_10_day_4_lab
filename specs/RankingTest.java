import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class RankingTest{

  Card card;
  SuitType suits;
  NumberType numbers;
  Deck deck;
  Dealer dealer;
  Player player;
  Game game;
  Ranking ranking;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    dealer = new Dealer(deck.getCards());
    game = new Game(dealer);
    player = new Player();
    game.addPlayer(player);
    Player player2 = new Player();
    game.addPlayer(player2);
    game.dealHand();
    ranking = new Ranking(player.getHand(), player2.getHand());
  }

  @Test
  public void handsReadyForComparision(){
    ArrayList cards1 = ranking.getPlayer1Hand();
    for(Object object : cards1){
      Card original = (Card) object;
      System.out.println(original.getCard());
    }
    ArrayList cards2 = ranking.getPlayer2Hand();
    for(Object object : cards2){
      Card original = (Card) object;
      System.out.println(original.getCard());
    }
    assertEquals(3, ranking.getPlayer1Hand().size());
    assertEquals(3, ranking.getPlayer2Hand().size());
  }

}




