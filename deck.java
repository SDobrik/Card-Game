public class Deck{
  public Deck(String[] r, String[] s, int[] vals){ //ranks, suits, and values
    for(int i = 0; i < s.length; i++){
      for(int x = 0; x < r.length; x++){
        List getCard = new ArrayList(); // create card
        getCard.add(r[i]);
        getCard.add(s[i])
        getCard.add(vals[i])
       	
        cards.add(card);
      }
    }
  }
  
  List cards = new ArrayList();
  int size = 0;
}
