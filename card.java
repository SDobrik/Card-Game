public class Card{
    //public state variables
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
    public boolean equalsTo(Card x){
        if(rnk.equals(x.rank()) && st.equals(x.suit()) && (ptValue == x.pointValue())){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return this.rnk +" of "+this.st+" (point value = "+this.ptValue+")";
    }
}
