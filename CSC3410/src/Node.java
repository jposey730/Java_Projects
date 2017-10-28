//This is the node class
class Node{
	Integer value;
	//creates a right child and left child node
	Node leftChild;
	Node rightChild;
//creates an Object of class Node
	Node(Integer value){
		this.value=value;
		
	}
//toString method that return the value passed to the Node.
	public String toString(){
		return value+" ";
	}
	
 }

