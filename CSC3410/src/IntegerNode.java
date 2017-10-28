
public class IntegerNode {
public int item;
public IntegerNode next;

public IntegerNode(){

}
public IntegerNode(int x, IntegerNode y){
	item=x;
	next=y;

}
public static void main(String[] args) {
	IntegerNode n1=new IntegerNode();
	IntegerNode n2=new IntegerNode();
	n1.item=0;
	n1.next=n2;
	IntegerNode n4=new IntegerNode();
	IntegerNode n3=new IntegerNode(4,null);
	n3.next=n4;
	for(int i=5; i<=20;i++){
		IntegerNode =new IntegerNode();
	}
}
		
	
}
