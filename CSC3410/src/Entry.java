// This is the entry class for the phondir program.  This program was created in order to gain more experience with
//Linked Lists
public class Entry{
	//all private instance variables
	private String firstName;
	private String lastName;
	private String number;
	
	
	//constructor that sets every string to empty
	public Entry(){
		firstName="";
		lastName="";
		number="";
	}
	//constructor that allows you to enter the arguments.
	public Entry(String firstName, String lastName, String number){
		this.firstName=firstName;
		this.lastName=lastName;
		this.number=number;
	}
	//sets first name
	//Pre: must enter a string as a passed parameter
	  public void setFirstName(String fName){
          firstName=fName;
      }
	  //Post:if a string is entered, the method will set the first name.
	//Pre: must enter a string as a passed parameter
	  //sets last name
      public void setLastName(String lName){
          lastName=lName;
      }
    //Post:if a string is entered, the method will set the last name.
      
    //Pre: must enter a string as a passed parameter
      //sets number
      public void setPhoneNumber(String num){
         number=num;
      }
    //Post:if a string is entered, the method will set the number.
      //gets first name
      public String getFirstName(){
          return firstName;
      }
      //gets last name
      public String getLastName(){
          return lastName;
      }
      //gets number
      public String getPhoneNumber(){
          return number;       	  
      }
     //returns first name, last name and number as one
	public String toString(){
		return firstName+" "+lastName+" "+ displayNum();
	}
	//combines all the entries to one long string that ignores case.
	//this is used to check each entry all at once instead of comparing each instance variable.
	public String getKey(){
		String x=lastName +firstName+ number;
		return x.toLowerCase();
	}
	//displays the number with dashes 
	public String displayNum(){
		String x=number;
		String y=x.substring(0, 3)+"-"+x.substring(3, 6)+"-"+x.substring(6, 10);
		return y;	
	
	}
	
}
