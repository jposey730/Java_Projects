/*		The purpose of this assignment is to gain experience with LinkedLists
 * and to utilize the Java library.  The assignment is to create a phone directory
 * using a LinkedList as its data structure.
 * 		When attacking this assignment I knew I first needed to create a class called Entry to serve
 * as the "nodes" for the LinkedList. In this class I created a constructor that allowed Entry
 * objects to be created.  Each Entry contained a first name, last name and phone number. 
 * 		Once each Entry has been created there were various method that that could be implemented 
 * to manipulate the LinkedList.  These methods are defined and explained in the "phonedir" class that also contains 
 * the program itself. Examples of these methods are diplayList, addNew, deleteCurrent and change name and/or number.
 * The ultimate end product is to create a directory that is entered already sorted by last name, first name
 * and finally number. When manipulating the list, it is important to keep the list sorted at all time. This was the
 * toughest part of the assignment. Each method created keeps the list in order while completing the methods main task.
  */
import java.util.*;
import java.awt.*;

public class phonedir {

	public static void main(String[] args) {
		//creating a linkedList names j1
		LinkedList<Entry> j1=new LinkedList<Entry>();
		//Setting the choice to empty
		String choose="";
		// program will terminate if q is entered 
		while(!choose.equals("q")){
		//declaring scanner
		Scanner input=new Scanner(System.in);
		//prints the choices to enter
		printMess();
		//sets whatever the users types to choose
		choose=input.next();
		//if any of the letters are chosen, the program runs with the corresponding method
		if(choose.equals("a")){
			//displays list
			display(j1);
		}else if(choose.equals("q")){
			//ends program
			break;
		}else if(choose.equals("n")){
			//adds a new entry and places it alphabetically
			addNew(j1);
		}else if(choose.equals("d")){
			//deletes the current entry
			delete(j1);
		}else if(choose.equals("p")){
			//changes the current entry's number
			chngNum(j1);
		}else if(choose.equals("l")){
			//changes current's last name
			chngLN(j1);
		}else if(choose.equals("f")){
			//changes currents first name
			chngFN(j1);
		}else if(choose.equals("s")){
			//selects an entry to be the current
			select(j1);
		}else{
			//prompts "illegal command" if anything but these letters are entered
			System.out.println("Illegal Command");
			System.out.println();
		}
	}
		System.out.println("Program Terminated");
	
	}
	//prints the main message
	public static void printMess(){
		System.out.println(" a     Show all records");
		System.out.println(" d     Delete the current record");
		System.out.println(" f     Change the first name in the current record");
		System.out.println(" l     Change the last name in the current record");
		System.out.println(" n     Add a new record");
		System.out.println(" p     Change the phone number in the current record");
		System.out.println(" q     Quit");
		System.out.println(" s     Select a record from the record list to become the current record");
		System.out.println();
		System.out.println("Enter a command from the list above (q to quit):");
		
	}
	//Pre:a valid linkedlist must be passes as a parameter
	//displays the list
	public static void display(LinkedList<Entry>x){
		//if the list is empty, no records will be printed
		if(x.isEmpty()){
			System.out.println("No Current Records");
			System.out.println();
		}else{
			//if not empty, will display the whole directory
			System.out.println("PHONE DIRECTORY");
			for(Object b:x){
				System.out.println(b.toString());
			}
		}
	}
	//Post: a valid linkedlist must be passes as a parameter, method will display the linkedlist
	//adds a new link to the list
	//Pre:a valid linkedlist must be passes as a parameter and the number must be 10 digits.
	public static void addNew(LinkedList<Entry>x){
		Scanner input=new Scanner(System.in);
		//prompts the user to enter all their info
		System.out.println("Enter the First Name:");
		String fnm=input.next();
		System.out.println("Enter the Last Name:");
		String lnm=input.next();
		System.out.println("Enter the Number(Must be 10 digits in length):");
		String nu=input.next();
		//checks to see if the number is 10 digits long
		while(nu.length()!=10){
			System.out.println("Number too long or too short!");
			System.out.println("Enter the Number(Must be 10 digits in length:");
			 nu=input.next();
		}
		//creates a new entry names addTo
		Entry addTo=new Entry(fnm, lnm, nu);
		//creates a combined key word for addTo, check entry class for explanation 
		String newKey=addTo.getKey();
		//if the list is empty, add entry to the beginning
		if(x.isEmpty()){
			x.addFirst(addTo);	
			
		}else{
			int i=0;
		//loop to check if each keyword in the list is greater than addTo keyword
			for(Entry y:x){
				String curr=y.getKey();
				//if it is, it adds the Entry addTo to the proper spot in the list
				if(newKey.compareTo(curr)<0){
					x.add(i,addTo);
					break;
				}i++;	
			}
			//if is reaches the end, it adds it to the end of the list
			if (i==x.size()){
				x.add(addTo);
			}
		}
	}
	//Post: if a valid linkedlist is passed as a parameter and the number is 10 digits
	//the method will add an entry to its proper spot in the list
	
	//Pre:a valid linkedlist must be passed as a parameter.
	//Revmove the last entry on the list
	public static void delete(LinkedList<Entry>x){
		x.removeLast();
	}
	//Post:if a valid linkedlist is passed as a parameter, the last element will be deleted
	
	//Pre:a valid linkedlist must be passed as a parameter.
	public static void chngLN(LinkedList<Entry>x){
		Scanner input=new Scanner(System.in);
		//sets the last entry in the list as j.
		Entry j=x.getLast();
		//prompts for a new last name
		System.out.println("Enter new last name:");
		String newName=input.next();
		//sets the entered name as the new last name
		j.setLastName(newName);
		//creates a temp Entry and sets it to j
		Entry temp=j;
		//creates a key for Entry temp
		String z=temp.getKey();
		//removes the currents selection
		x.removeLast();
		//the next 13 lines of code are similar to the addNew method
		//they find where the entry belongs and then places it in the list
		int i=0;
		for(Entry y:x){
			String curr=y.getKey();
			if(z.compareTo(curr)<0){
				//if it is found it is added to the list and then breaks
				x.add(i,temp);
				break;
			}i++;
			
		}
		//if it cycles all the way through its put back at the current
		if (i==x.size()){
			x.add(temp);
		}
	}
		
	//Post:if a valid list is entered as a parameter, the method will change the last name
	//of the current entry and place it back into the list in alphabetical order.
	//Pre:a valid linkedlist must be passed as a parameter.
	// exactly like the change last name, except with the first name.
	public static void chngFN(LinkedList<Entry>x){
		Scanner input=new Scanner(System.in);
		Entry j=x.getLast();
		System.out.println("Enter new first name:");
		String newName=input.next();
		j.setFirstName(newName);
		Entry temp=j;
		//gets keyword from temp 
		String z=temp.getKey();
		x.removeLast();
		//the next 13 lines of code are similar to the addNew method
		//they find where the entry belongs and then places it in the list
		int i=0;
		for(Entry y:x){
			String curr=y.getKey();
			if(z.compareTo(curr)<0){
				//adds temp to the ith spot in the list
				x.add(i,temp);
				break;
			}i++;
			
		}
		//if it cycles all the way through its put back at the current
		if (i==x.size()){
			x.add(temp);
		}
	
	}
	//Post:if a valid list is entered as a parameter, the method will change the fist name
	//of the current entry and place it back into the list in alphabetical order.
	
	//Pre:a valid linkedlist must be passed as a parameter and the new number must be 10 digits.
	// exactly like the change last name, except with the number.
	public static void chngNum(LinkedList<Entry>x){
		Scanner input=new Scanner(System.in);
		Entry j=x.getLast();
		
		System.out.println("Enter new number:");
		String newNum=input.next();
		//prompts the user to enter a valid number if it is too long or short
		while(newNum.length()!=10){
			System.out.println("Number too long or too short!");
			System.out.println("Enter the Number(Must be 10 digits in length:");
			 newNum=input.next();
		}
		j.setPhoneNumber(newNum);
		Entry temp=j;
		String z=temp.getKey();
		//removes the current number
		x.removeLast();
		//the next 13 lines of code are similar to the addNew method
		//they find where the entry belongs and then places it in the list
		int i=0;
		//for loop to go through the list
		for(Entry y:x){
			String curr=y.getKey();
			if(z.compareTo(curr)<0){
				x.add(i,temp);
				break;
			}i++;
			
		}
		//if it cycles all the way through its put back at the current
		if (i==x.size()){
			x.add(temp);
		}
	
	}
	//Post:if a valid list is entered as a parameter, the method will change the number 
	//of the current entry and place it back into the list in alphabetical order.
	
	//Pre:a valid linkedlist must be passed as a parameter and the contact must be in the list
	//of the method will return no contact found.
	public static void select(LinkedList<Entry>x){
		//starts off by displaying the list for the user to see
		display(x);
		Entry j=new Entry();
		//prompts the user to enter all the information for Entry j.
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first name:");
		j.setFirstName(input.next());
		System.out.println("Enter the last name:");
		j.setLastName(input.next());
		System.out.println("Enter the Number:");
		j.setPhoneNumber(input.next());
		System.out.println();
		//gets the keyword for entry j
		String k=j.getKey();
		//keeps track of the position
		int i=0;
		//loop that runs through the list
		for(Entry y:x){
			String z=y.getKey();
			// checks each entry's key word against j's keyword and if it is equal
			//it add j to the end of the list and then removes it where it previously was, then breaks
			if (k.compareTo(z)==0){
				x.addLast(j);
				x.remove(i);
				break;
			}else{
				i++;
			}
			//if it cycles through all the entries and doesn't find a match it return not found message.
		if(i==x.size()){
			System.out.println("Entry not Found!");
		}
		}		
	}
	//Post:if a valid list is entered as a parameter, the method will if the Entry entered
	//and move it to the current entry.  If not found it will return a not found message.
}

