/* 		The objective of this program is to gain experience using string objects, arrays and generic algorithms
 * while using a file for the input and output. 
 * 		When given this assignment, I first sat down and wrote a set by step process to 
 * achieve the desired output. The first step involves prompting the user to input a 
 * desired file to be read. This can be achieved very easily using S.O.P.. Once prompted, I needed to save the user's
 * input as the file name and read the file to make sure it is not empty.  If the file is not empty, I need to test
 * the amount of strings in the file to make sure it is in the desired limit. If it exceeds the limit I need to print 
 * a prompt and end the program.
 * 		If both of these parameters are met, I then need to save the each string in the file to an Array.
 * I chose this data structure because it was the easiest to work with and manipulate given the parameters of the assignment.
 * Once the array is set I need to form a duplicate signature array. This can be done through various methods in 
 * the string object class. After both arrays are set I need to sort the signature array while identically sorting
 * the original array. This can be done by using a generic bubble sort algorithm. Once both arrays are sorted 
 * identically, I can use a for loop to see if the signature array has any duplicates. Wherever there is a duplicate, I need 
 * to print out the corresponding string in the original array. When these are printed out, they are not printed to
 * the console but printed to the new file "output.txt".  These steps will give me the desired output while following
 * the parameters set by the assignment. 
 *  	When the program is ran it will take the user input as the file, read the file entered and return the 
 *  words that are anagrams on the same line. If the word does not have a anagram it will be printed on it's own line.
 */  
 
import java.awt.*;
import java.io.*;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class anagram {
public static void main(String[] args) throws Exception {
	Scanner scan=new Scanner(System.in);
	//Prompting user to enter the name of the file
	System.out.println("Enter the name of the input file:");
	//The next two lines set the users input as the file name.
	String file=scan.nextLine();
	File infl=new File(file);
	FileReader fr=new FileReader(infl); 
	//reads file to see if the contents are empty
	//if the file is empty, it returns a statement that the file is empty
	if(fr.read()==-1){
		System.out.println("This input file is empty!");
		return;
	}else{
		//calls method setArray and passes the file "infl" to it.
		setArray(infl);
		}
}
/*method reads an input file and prints all the anagrams
 * on the same line. If the string has no anagram, it prints it on it's own
 * line. It then prints the output to a file called "output". 
 * 
 */
public static void setArray(File f) throws Exception{
	
		Scanner infile=new Scanner(f);
		//Array "words" is the pre-signature array of the input file
		String[]words=new String[50];
		//"words2" is an array of the signature words of the input file
		String[]words2=new String[50];
		int i=0;
		//opens a file and printwriter in order to save the output to file called "output"
		FileWriter file=new FileWriter("output.txt");
		PrintWriter out=new PrintWriter(file);
		//checks the file to make sure the file doesn't contain more that 50 words
		while(infile.hasNext()){
			if(i>=50){
				//If the input file contains more than 50 words, message prints.
				System.out.println("There are more than 50 words in the input file.");
				return;
			}
			//Sets input to the next string in the file.
			String input=infile.next();
			/*Takes all the non letters out, drops the capitalization and sorts the string.
			After this, it saves the sorted string to words2 array.
			*/
			if(input.length()<=12){
				words[i]=input;
			input=input.replaceAll("[^a-zA-Z]","");	
			input=input.toLowerCase();
			char[]chars=input.toCharArray();
			Arrays.sort(chars);
			String sorted=new String(chars);
			words2[i]=sorted;
			i++;
			}
			}
		/*the next for loop is a bubble sort that sorts array "words2" 
		 * while also sorting array "words" to the same order.
		 */
		for(int k=0;k<i-1;k++){
			for(int j=k+1;j<i;j++){
				if (words2[k].compareTo(words2[j])==0){
					k++;
					String temp=words2[k];
					words2[k]=words2[j];
					words2[j]=temp;
					String temp2=words[k];
					words[k]=words[j];
					words[j]=temp2;
				}
				}
		}
		/* This prints out the first string in array words
		 * then checks to see if the next string is the same as the previous string.
		 * If it is, it prints the string on the same line and continues until the 
		 * words are different. If the word has no anagram it gets printed on it's own line.
		 */
		out.print(words[0]);
		for(int z=1;z<i;z++){
			if(words2[z].equals(words2[z-1])){
				out.print(" "+words[z]);
			}else{
				out.println();
				out.print(words[z]);
				
			}
		}
	out.close();	

}
}


