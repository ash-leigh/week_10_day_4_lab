import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class GameTest{

  Card card;
  SuitType suits;
  NumberType numbers;
  Deck deck;
  Dealer dealer;
  Player player;
  Game game;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    dealer = new Dealer(deck.getCards());
    player = new Player();
    game = new Game(dealer);
  }

  @Test
  public void canAddPlayersToGame(){
    game.addPlayer(player);
    Player player2 = new Player();
    game.addPlayer(player2);
    assertEquals(2, game.getPlayers().size());
  }

  @Test
  public void gameCanDealFirstHand(){
    game.addPlayer(player);
    Player player2 = new Player();
    game.addPlayer(player2);
    game.dealHand();
    assertEquals(3, player.getHand().size());
  }

  @Test
  public void printPlayersCards(){
    game.addPlayer(player);
    Player player2 = new Player();
    game.addPlayer(player2);
    game.dealHand();
    ArrayList cards = player.getHand();
    for(Object object : cards){
      Card original = (Card) object;
      System.out.println(original.getCard());
    }
  }

}