import java.util.*;
public class phondir2 {
	 
	      public static void main(String [] args)
	      {
	        String First_name, Last_name, Phone_Num;
	        String First, Last, Num;
	        int choice=0;
	         
	        Scanner in = new Scanner(System.in);
	   
	        LinkedList<Data> listOfRecords = new LinkedList<Data>();
	     
	        System.out.println("A Program to keep a Phone Directory:");
	   
	        //looping menu
	        while(true)
	        {
	            Menu();
	   
	          //enter the choice
	          if(choice==0)
	            System.out.println("No choice selected");
	          else  
	            System.out.println(listOfRecords.get(choice-1));
	   
	          System.out.print("Enter the choice ");
	            String command = in.next().trim();
	   
	          //show all entries
	          if(command.equalsIgnoreCase("a"))
	          {
	            System.out.println();
	            System.out.println("First Name\tLast Name\tPhone Number");
	   
	          
	            //for loop
	            for(int i=0; i<listOfRecords.size(); i++)
	              System.out.println(listOfRecords.get(i));
	   
	          }
	   
	          //Delete choice
	          else if(command.equalsIgnoreCase("d"))
	          {
	            if(choice==0)
	              System.out.println("No Record selected");
	            else
	            {
	              System.out.println("Deleted: "+listOfRecords.remove(choice-1));
	              choice=0;          //update choice counter of reference of linked list
	            }
	   
	          }
	   
	          //change first name of choice Record
	          else if(command.equalsIgnoreCase("f"))
	          {
	            if(choice==0)
	              System.out.println("No Record selected");
	            else
	            {
	              System.out.print("New first name: ");
	                First = in.next().trim();
	   
	              listOfRecords.get(choice-1).changeFirst(First);
	            }
	          }
	   
	          //Change last name of selected record
	          else if(command.equalsIgnoreCase("l"))
	          {
	            if(choice==0)
	              System.out.println("No Record selected");
	            else
	            {
	              System.out.print("New last name: ");
	                Last = in.next().trim();
	   
	              listOfRecords.get(choice-1).changeLast(Last);
	            }
	          }
	     
	          //add new contact

	          else if(command.equalsIgnoreCase("n"))
	          {
	            System.out.print("Enter first name: ");
	                    First_name = in.next().trim();
	            System.out.print("Enter last name: ");
	                    Last_name = in.next().trim();
	            //check in valid phone number input
	            //if phone number does not equal 10 then reprompt
	            while(true)
	            {
	              System.out.print("Enter phone number");
	                      Phone_Num = in.next().trim();
	   
	              if(Phone_Num.length()!=10)
	                System.out.println("Please enter correct phone number!");
	              else
	                break;
	            }
	                 
	            listOfRecords.add(new Data(First_name, Last_name, Phone_Num));
	              choice = listOfRecords.size();
	          }
	   
	          //Change phone number
	          else if(command.equalsIgnoreCase("p"))
	          {
	            if(choice==0)
	              System.out.println("No Record selected");
	            else
	            {
	              System.out.print("Enter new phone number: ");
	                Num = in.next().trim();
	         
	              listOfRecords.get(choice-1).changePhone(Num);
	            }
	          }
	   
	          //Exit
	          else if(command.equalsIgnoreCase("q"))
	          {
	            System.out.println("Quit");
	            System.exit(1);
	          }
	   
	        
	          else
	        
	          if(command.equalsIgnoreCase("s"))
	          {
	   
	            String testName;
	            int test=0;
	            System.out.print("Enter first name: ");
	              First_name = in.next().trim();

	            for(int i=0; i<listOfRecords.size(); i++)
	            {
	              testName = listOfRecords.get(i).getFirst();
	              if(testName.equals(First_name))
	              {
	                choice=i+1;
	                test++;
	              }
	            }
	   
	            //print if no match found
	            if(test==1);
	              System.out.println("No Record found");
	          }
	   
	          else
	            System.out.println("Choice not correct");
	        }
	      }
	   
	      //print menu
	      static void Menu()
	      {
	        System.out.println();
	        System.out.println("\t(a) Show all records");
	        System.out.println("\t(d) Delete the current record");
	        System.out.println("\t(f) Change the first name in the current record");
	        System.out.println("\t(l) Change the last name in the current record");
	        System.out.println("\t(n) Add a new record");
	        System.out.println("\t(p) Change the phone number in the current record");
	        System.out.println("\t(q) Quit");
	        System.out.println("\t(s) Select a record from the record list to become current record");
	      }
	    }
	   
	
	    class Data
	    {
	            private String firstName;
	            private String lastName;
	            private String phoneNum;     
	         
	      //constructor
	            public Data(String f, String l, String n)
	            {
	                    firstName=f;
	                    lastName=l;
	                    phoneNum=formatPhone(n);     
	            }
	   
	      public String getFirst()
	      {
	        return firstName;
	      }
	   
	      public String getLast()
	      {
	        return lastName;
	      }
	   
	      public String getNumber()
	      {
	        return phoneNum;
	      }
	   
	      public void changePhone(String p)
	      {
	        phoneNum=formatPhone(p);
	      }
	   
	      public void changeFirst(String f)
	      {
	        firstName=f;
	      }
	   
	      public void changeLast(String l)
	      {
	        lastName=l;
	      }
	   
	   
	      public String toString()
	      {
	        return firstName +"\t\t"+ lastName +"\t\t"+phoneNum;
	      }
	         
	        public String formatPhone(String num)
	            {
	        return num.substring(0,3)+"-"+num.substring(3,6)+"-"+num.substring(6,10);
	      }
	    
	    } //end the program




