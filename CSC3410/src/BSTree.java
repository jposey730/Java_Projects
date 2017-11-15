/*		The purpose of this assignment is to gain experience with binary trees
and to implement your own built LinkedList in order to built the binary tree.
When I read this assignment, I first knew I needed to choose an ADT to store the 
random numbers first.  I decided to choose an ArrayList so I could increase the list
size if I needed to.  After deciding on the on an array list, I knew I needed to build my own 
linked list to build the binary tree on.  
  		I first created a Node class which is the foundation of the binary tree.
 The node class creates a right and left child and establishes a constructor that allows you
 to create a Node with a passed value. 
 		The second class I created was the binary tree class.  This class contains methods 
that allow you to add nodes, traverse the unordered tree and traverse the ordered tree.  The actual 
driver class BSTree, creates an Arraylist of 100 randomly generated integers from 1 to 99.  This
arraylist is then transferred to the binary tree, after which the tree is traversed.  Once this is printed,
the tree is then traversed in order. You will also need Binarytrees.java.
*/
import java.util.ArrayList;
import java.util.Random;
//Driver program for Binarytrees
public class BSTree {
	public static void main(String[] args) {
		//creates an ArrayList and stores 100 random integers
		//from 1-99 into it.
		ArrayList<Integer> x=new ArrayList<Integer>();
System.out.println("ArrayList of 100 random integers from 1-99:");
		for(int i=0;i<=100;i++){
			Random rnd=new Random();
			int random =rnd.nextInt(100-1)+1;
			x.add(random);
			//prints out each element of the ArrayList as it is created
			System.out.print(x.get(i)+" ");
			
			}
		//Creates binarytree "tree"
		BinaryTree tree=new BinaryTree();
		//for loop inserts the elements from the ArrayList into the 
		//Binarytree
		for(int i=0;i<=100;i++){
			Integer j=x.get(i);
			tree.addNode(j);
		}
		System.out.println();
		System.out.println();
		System.out.println("This is the Binary Tree after it has been entered and traversed:");
		tree.trav(tree.head);
		System.out.println();
		System.out.println();
		System.out.println("This is the Binary Tree after it has been order traversed:");
		tree.ordTrav(tree.head);
		}

		
}
