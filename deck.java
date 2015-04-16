public class Deck{
  public Deck(String[] r, String[] s, int[] vals){ //ranks, suits, and values
  
    for(int i = 0; i < s.length; i++){ // get suits
      for(int x = 0; x < r.length; x++){
        List getCard = new ArrayList(); // create cards
        getCard.add(r[x]);
        getCard.add(s[i])
        getCard.add(vals[x])
       	
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
