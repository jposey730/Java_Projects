import java.util.*;
public class Driver {
	public static void main(String[] args) {
		//sets arraylist "test" to 50
	ArrayList test=new ArrayList(50);
	// for loop assigns 50 random numbers to the elements of the arraylist
	int i=0;
	while(i<50){
		//sets random to a random int between 1 and 20
		Random rnd=new Random();
		int random =rnd.nextInt(21-1)+1;
		test.add(random);
		i++;
	}
	//the S.O.P's test each method for the Arraylist object "test"
	System.out.println(test.toString());
	System.out.println(test.isEmpty());
	System.out.println(test.get(4));
	System.out.println(test.find(5));
	System.out.println(test.isIn(7));
	System.out.println(test.size());
	test.add(7);
	System.out.println(test.toString());
	test.add(12,16 );
	System.out.println(test.toString());
	test.remove(9);
	System.out.println(test.toString());
	
	}
}
