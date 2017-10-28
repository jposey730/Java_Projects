
public class Pair {
	
	   private int min;
	   private int max;
	  
	  
	   //constructor
	   public Pair() {
	       min=max=0;
	   }
	  
	   //paramter constructor
	   public Pair(int min,int max)
	   {
	       this.min=min;
	       this.max=max;
	   }
	  
	  
	   //setter methods to set min and max
	   public void setMin(int min)
	   {
	       this.min=min;
	   }
	  
	   public void setMax(int max)
	   {
	       this.max=max;
	   }
	  
	   //getter methods to get min and max
	   public int getMin()
	   {
	       return min;
	   }
	  
	   public int getMax()
	   {
	       return max;
	   }
	  
	  
	}

