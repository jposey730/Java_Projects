public class Card{
  
   public final static int Spade = 0;
   public final static int Heart = 1;
   public final static int Diamond = 2;
   public final static int Club = 3;
     
   public final static int Ace = 1;  
   public final static int Two = 2;
   public final static int Three = 3;
   public final static int Four = 4;
   public final static int Five = 5;
   public final static int Six = 6;
   public final static int Seven = 7;
   public final static int Eight= 8;
   public final static int Nine = 9;
   public final static int Ten = 10;
   public final static int Jack = 11;    
   public final static int Queen = 12;  
   public final static int King = 13;
  
   private final int suit;
  
  private final int val;
  
   public Card(int val, int suit){
      if (suit != Spade && suit != Heart && suit != Diamond && suit != Club){
         throw new IllegalArgumentException("Please define appropriate suit");
      }
      if (val< 1 || val > 13){
         throw new IllegalArgumentException("Enter correct card value");
      }
      this.val = val;
      this.suit = suit;
   }

   public int getSuit()
   {
      return suit;
   }
  
   public int getValue()
   {
      return val;
   }
  
   public String getSuitS()
   {
      switch ( suit )
      {
        case Spade:   return "Spades";
        case Heart:   return "Hearts";
        case Diamond: return "Diamonds";
        default: return "Clubs";    
       }
   }
  
   public String getValueS()
   {
         switch ( val)
         {
            case 1:   return "Ace";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            case 7:   return "7";
            case 8:   return "8";
            case 9:   return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            default: return "King";
         }
   }
  
   public String toString(){
       return getValueS() + " of " + getSuitS();
   }
  

}

