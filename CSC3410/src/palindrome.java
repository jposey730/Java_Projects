/*		The purpose of this program is to gain experience with stacks and queues
 * by using both of their library functions.  When first looking at this assignment, I realized
 * there are many different ways of achieving the desired output.  But because the assignment specified
 * to use Stack and Queue, those are the ADT's I used. The assignment asks to read a file word by word and 
 * extract and print all the palindromes from that file.  I first needed to create a scanner in the main 
 * method to import the file.  The user is prompted to enter a file and the file will be checked to see if it exists. 
 * If the file exists, I needed to check to see if that file was empty or not.
 * If the file wasn't empty I needed to read it and search for palindromes.
 * 		This is when I created the "check" method. This method accepts a file as it's only parameter.
 * In the method I created a stack, two queues and string builder.  The method then removes all punctuation
 * and converts the string to lower case. It then places each character of the word into both 
 * queues. After the whole word has been entered, I push the stack with the removed letter from the first queue in order to   
 * copy it into the stack. Then I pop the stack and remove() for the second queue to compare the characters.  If the characters are equal, 
 * I amend them to the string builder. If both characters are equal for the whole word, the word is a palindrome and it
 * is printed. So, ideally if a file that exists and is not empty is entered, the program will 
 * read the file and return all the palindromes until it has reached the end.  If there are no palindromes,
 * the program will return "no palindromes found".  
 * 
 */

import java.awt.*;
import java.util.*;
import java.io.*;
public class palindrome {
	public static void main(String[] args)  {
		//declares scanner
		Scanner input=new Scanner(System.in);
		//prompts user to input a file
		System.out.print("Please enter a file to be read:");
	
		//sets the file as the users next input 
		File infl=new File(input.nextLine());
		//try/catch 
		//if the file is empty the fileReader will check and return 
		//"file is empty" message". If it is not empty, it will invoke the 
		//"check method
		try{
		FileReader read=new FileReader(infl);
		//checks to see if the file is empty first. If it is, "File is empty" is printed.
			if(read.read()==-1){
				System.out.println("File is empty!");
			}else{
			//invokes the check method
			check(infl);
		}
			//closes fileReader
			read.close();	
	}
		//catches the file not found exception
		catch(Exception e){
			System.out.println("File not Found!");
		}
		//closes scanner "input"
		input.close();

		}
	//This method takes a file and returns all the palindromes in the file.
	
	//Pre:An object of type file must be passed to the method. Method throws the file not found exception to 
	//main method.
	public static void check(File x) throws FileNotFoundException{
		//sets j in order to see if there are any palindromes at the end.
			int j=0;
			//Scanner takes in File x to read
			Scanner infl=new Scanner(x);
			System.out.println();
			System.out.println("PALINDROMES:");
			//While loop to check all the words
			while(infl.hasNext()){
				
				//creates a stack of chars named "stack"
				Stack<Character>stack=new Stack<Character>();
				//creates a queue with linkedList characteristics
				Queue<Character>queue=new LinkedList<Character>();
				//creates another queue
				Queue<Character>queue2=new LinkedList<Character>();
				//creates a stringbuilder names "make".
				StringBuilder make=new StringBuilder();
				//Sets next in the scanner to "next"
				String next=infl.next();
				//takes out all the punctuation from next
				next=next.replaceAll("[^a-zA-Z]","");
				//sets all of "next" letters to lowercase
				next=next.toLowerCase();
				//for loop to push all of next's letters to the stack and queue
				for(int i=0;i<next.length();i++){
					char it=next.charAt(i);
					//adds the character to both queues
					//creates two indentical queues
					queue.add(it);
					queue2.add(it);
				}
				//copies the contents of the first queue into the stack
				while(!queue.isEmpty()){
					stack.push(queue.remove());
					}
				//For loop pops off all of the stack and removes the last queue2 and compares them to each other.
				//It will keep going until an instance isn't equal.
				for(int z=0;z<next.length();z++){
					char it=next.charAt(z);
					if(!stack.pop().equals(queue2.remove())){
						break;
					}else{
						//appends the char to the string builder "make".
						make.append(it);
						}
					}
				//turns make into a string
				String pal=make.toString();
				
				//if the length of the original String "next" equals the length of the 
				//String "word" they are palindromes and it prints.
				if(pal.length()==next.length()){
				System.out.println(pal.toString());
				//increases j if the word is a palindrome
				j++;
				}
				}
			// j == 0 means that no palindromes were found.
			if(j==0){
				System.out.println("No Palindrome Found!");
			}
			//closes scanner
			infl.close();	
		} 
	//Post: If a valid File is passed to method check, it will check the file for palindromes and 
	//print out the ones it has found. If there are none, it will print the message 
	//"No Palindromes found".
	
	}
	

