public class Card{
    private String rnk, st;
    private int ptValue;
  
    public Card(String rank, String suit, int pointValue){
        rnk= rank;
        st=suit;
        ptValue=pointValue;
    }
    
    public String rank(){
        return rnk;
    }
    public String suit(){
        return st;
    }
    public int pointValue(){
        return ptValue;
    }
    public boolean matches(Card otherCard) {
		return otherCard.suit().equals(this.suit())
			&& otherCard.rank().equals(this.rank())
			&& otherCard.pointValue() == this.pointValue();
	}

    public String toString(){
        return this.rnk +" of "+this.st+" (point value = "+this.ptValue+")";
    }
}
