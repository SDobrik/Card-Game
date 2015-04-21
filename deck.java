import java.util.List;
import java.util.ArrayList;

public class Deck{
  public Deck(String[] r, String[] s, int[] vals){ //ranks, suits, and values
  
    for(int i = 0; i < s.length; i++){ // get suits
      for(int x = 0; x < r.length; x++){
        Card card = new Card(r[x], s[i], vals[x]);
        cards.add(card);
        
        size++;
      }
    }
    
    cardsLeft = size;
  }
  
  public boolean isEmpty(){
    return cardsLeft <= 0;
  }
  public int size(){
    return cardsLeft;
  }
  public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
  
  private List<Card> cards = new ArrayList<Card>();
  int size = 0;
  int cardsLeft = 0;
}
