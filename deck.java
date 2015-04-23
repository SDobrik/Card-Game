import java.util.*;

public class Deck{
    private List<Card> cards = new ArrayList<Card>();
    int size = 0;
  
  public Deck(String[] r, String[] s, int[] vals){ //ranks, suits, and values
  
    for(int i = 0; i < vals.length; i++){
      for(int x = 0; x < s.length; x++){
        Card card;
        if(vals[i] == 1){
            card = new Card("A", s[x], vals[i]);
        }else{
            card = new Card(Integer.toString(vals[i]), s[x], vals[i]);
        }
        cards.add(card);
        
        size++;
      }
    }
    for(int i = 0; i < r.length; i++){ // get suits
      for(int x = 0; x < s.length; x++){
        Card card = new Card(r[i], s[x], 0);
        cards.add(card);
        
        size++;
      }
    }
  }
  
  public boolean isEmpty(){
    return size <= 0;
  }
  public int size(){
    return size;
  }
  public Card deal(){
    if(size < 0){
        return null;
    }else{
        Card temp = cards.get(size - 1);
        size--;
        return temp;
    }
  }
  public void shuffle(){
        List<Card> newCards = new ArrayList<Card>();
        while(cards.size() > 0){
            Random rn = new Random();
            int randNum = rn.nextInt(cards.size());
            
            newCards.add(cards.get(randNum));
            cards.remove(randNum);
        }
        cards = newCards;
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
}
