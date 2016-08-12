import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class DealerTest{

  Deck deck;
  SuitType suits;
  NumberType numbers;
  Dealer dealer;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
    dealer = new Dealer(deck.getCards());
  }

  @Test 
  public void dealerHasFullDeck(){
    assertEquals(52, dealer.showDeck().size());
  }

  @Test
  public void printCards(){
    ArrayList cards = dealer.showDeck();
    for(Object object : cards){
      Card original = (Card) object;
      System.out.println(original.getCard());
    }
  }

  @Test
  public void dealerCanShuffleDeck(){
    dealer.shuffleDeck();
    printCards();
  }

  @Test
  public void canDealCard(){
    dealer.dealCard();
    assertEquals(51, dealer.showDeck().size());
  }


}