import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;
import CardGame.*;
import java.util.*;

public class DeckTest{

  Deck deck;
  SuitType suits;
  NumberType numbers;
  Card card;

  @Before
  public void before(){
    deck = new Deck(suits, numbers);
  }

  @Test
  public void deckHasCards(){
    assertEquals(52, deck.getCards().size());
  }

}