import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class PlayerTest{

  Card card;
  SuitType suits;
  NumberType numbers;
  Deck deck;
  Dealer dealer;
  Player player;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    dealer = new Dealer(deck.getCards());
    player = new Player();
  }

  @Test
  public void playerCanRecieveCard(){
    Card card = dealer.dealCard();
    player.receiveCard(card);
    assertEquals(1, player.getHand().size());
  }

}