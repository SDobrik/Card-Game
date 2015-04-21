public class Deck{
  public Deck(String[] r, String[] s, int[] vals){ //ranks, suits, and values
  
    for(int i = 0; i < s.length; i++){ // get suits
      for(int x = 0; x < r.length; x++){
        Card card = new Card(r[x], s[i], vals[x]);
        cards.add(card);
        
        deckSize++;
      }
    }
    
    cardsLeft = deckSize;
  }
  
  public boolean isEmpty{
    return cardsLeft <= 0;
  }
  public int size{
    return cardsLeft;
  }
  
  List cards = new ArrayList();
  int deckSize = 0;
  int cardsLeft = 0;
}
