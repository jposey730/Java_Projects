
//This is the actual class of the BinaryTree
public class BinaryTree {
//Creates a root node, just like a "head" of a LinkedList
Node head;
//This method allows you to add add a Node to the BinaryTree
//Pre: must enter pass an Integer value and an int for the position.
	public void addNode(Integer value){
		//first creates a new node with the values passed.
		Node newNode=new Node(value);
		//if statement checks to see if the root is empty. If it is,
		//it sets the root to the node just created.
		if(head==null){
			head= newNode;
			//if its not empty, it sets the "wantNode" to the "root" Node
		}else{
			Node wantNode=head;
			//creates a parents node
			Node parent;
			//while loo
			while(true){
				//sets the parent node to the wantNode
				parent=wantNode;
				//if the value passed is less than the value of the wantNode
				//set the wantNode to the left child.
				if(value<wantNode.value){
					wantNode=wantNode.leftChild;
					//if the wantNode is Empty, set it to the left child of parent and return.
					if (wantNode==null){
						parent.leftChild=newNode;
						return;
					}
					//otherwise set the wantNode to right child
				}else{
					wantNode=wantNode.rightChild;
					//again, if it's empty, set it to the right child of parent node and retrun
					if(wantNode==null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}
//this method traverses a Binary tree from a specific node
//Pre:This method must be passed a Node object.
	public void trav(Node x){
		//if the node is not empty, it prints the node and recursively
		//calls its right and left child...until it comes to an empty node 
		if(x!=null){
			System.out.print(x);
			trav(x.leftChild);
			trav(x.rightChild);
		}
	}
//Post: If a Node object is passed, this method will return the binary tree of the 
// of all the nodes below it.
//Pre: This method must be passes a Node object.
//This method return the sorted binary tree of the Node passed.
	public void ordTrav(Node x){
		//base case checks to see if the Node is Empty, while its not
		//it infix recursively prints out the right and left child
		//until it reaches an empty node.
		if(x!=null){
			ordTrav(x.leftChild);
			System.out.print(x);
			ordTrav(x.rightChild);
			
		}
	}
}
//Post:If a Node is passed, this method will return the sorted tree of the 
//node passed.
	

