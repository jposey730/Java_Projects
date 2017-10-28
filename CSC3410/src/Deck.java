import java.util.*;

public class Deck{
	private Vector<Card> Cards = new Vector<Card>(52);
	public Deck(){
		 for(int suit= Card.Spade;suit<=Card.Club;suit++){
	            for(int rank=Card.Ace;rank<=Card.King;rank++) {
	              Card temp= new Card(rank,suit); 
	              Cards.addElement(temp);
	              
	               
	            }
	        } 
	        }
	
	public Vector<Card> getCards(){
		return Cards;
	}
	public String toString(){
		String output="";
		for(int i=0;i<=53;i++){
			
			output+=Cards.elementAt(i).toString();
		}
		return output;
			
		}
    
  
   }    
   
	


    
      
    