import java.util.ArrayList;
import java.util.Arrays;


public class MinMaxProgram {
	
	   public static void main(String[] args)
	   {
	    int [] arr={-4,3,89,4,12,-7,9,1,-2, 8,7,6,5,-7};
	    
	     
	       
minMax(arr);
	   }
	   public static void minMax(int[]x){
		   ArrayList <Integer> min = new ArrayList<Integer>();
		   ArrayList <Integer> max= new ArrayList<Integer>();
		   int [] a= Arrays.copyOfRange(x,0, x.length/2);
		   int [] b= Arrays.copyOfRange(x, (x.length/2),x.length);
		  
		 for(int i=0; i<a.length;i++){
			  if(a[i]<=b[i]){
				  min.add(a[i]);
				  max.add(b[i]);
			  }else{
				  max.add(a[i]);
				  min.add(b[i]);
			  } 
		  }
		 
		 int smallest=min.get(0);
		 int biggest=max.get(0);
				
		  for(int j=1; j<min.size();j++){
			  if(min.get(j)<smallest){
				  smallest=min.get(j);
			  }if(max.get(j)>biggest){
					  biggest=max.get(j);
				  }
		  
		  }
		  System.out.println("Largest number = "+biggest);
		  System.out.println("Smallest number ="+smallest);
	   }
	   }

