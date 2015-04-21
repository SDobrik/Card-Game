public class Card{
    //public state variables
    private String rnk, st;
    private int ptValue;
  
     //
    public card(String rank, String suit, int pointValue){
      rnk= rank;
      st=suit;
      ptValue=pointValue;
    }
  //accessor clases
    public String rank(){
      return rnk;
    }
    public String suit(){
      return st;
    }
    public int pointValue(){
      return ptValue;
    }
  //Equality method
    public boolean equalsTo( Card x){
      return rnk.equalsTo(x.rank())&&st.equalsTo(x.suit())&&ptValue.equalsTo(x.pointValue());
    }
    
    //to String
    public String toString(){
      return this.rnk +" of "+this.st+" (point value = "+this.ptValue+")";
    }
  
}
