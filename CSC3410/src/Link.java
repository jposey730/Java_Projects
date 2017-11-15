//Practice with Linkedlists
public class Link {
public String bookName;
public int millionsSold;
public Link Next;

		public Link(String bookName, int millionsSold){
		this.bookName=bookName;
		this.millionsSold=millionsSold;
}
	public void display(){
		System.out.println(bookName+": "+ millionsSold+",000,000");
	}
	public String toString(){
		return bookName+" "+millionsSold+",000,000";
	}

public static void main(String[] args) {
	LinkList n1=new LinkList();
	n1.insertFirstLink("Harry Potter", 400);
	n1.insertFirstLink("Donny Brasco", 56);
	n1.insertFirstLink("Kite Runner", 65);
	n1.insertFirstLink("Jurassic Park", 423);
	n1.insertFirstLink("It", 45);
	n1.displayList();
	n1.removeFirst();
	System.out.println(n1.isEmpty());
	System.out.println(n1.find("Harry Potter"));
	n1.insertFirstLink("Jaws", 57);
	n1.removeLink("Kite Runner");
	n1.displayList();
	
}
}
class LinkList{
	public Link head;
	public boolean isEmpty(){
		return head.equals(null);
	}
	public void insertFirstLink(String bookName, int millionsSold){
		Link newLink= new Link(bookName, millionsSold);
		newLink.Next=head;
		head=newLink;
	}
	public void removeFirst(){
		if(!isEmpty()){
			head=head.Next;
		}else{
			System.out.println("The List is Empty!");
		}
	}
	public void displayList(){
		Link firstLink=head;
		while(firstLink!=null){
			firstLink.display();
			System.out.println("Next Link:"+ firstLink.Next);
			firstLink=firstLink.Next;
			System.out.println();
		}	
	}
	public Link find(String bookName){
		Link firstLink=head;
		if(!isEmpty()){
			while(firstLink.bookName!=bookName){
				if(firstLink.equals(null)){
					return null;		
				}else{
					firstLink=firstLink.Next;
				}
			}
			}else{
				System.out.println("Empty List!");
		}
		return firstLink;
	}
	public void insertAtPos(String bookname, int millionsSold){
		
	}
	public void removeLink(String bookName){
		Link firstLink=head;
		Link previous=head;
		while(firstLink.bookName!=bookName){
			if(firstLink.bookName==null){
				System.out.println("The List is empty!");
			}else{
				previous=firstLink;
				firstLink=firstLink.Next;	
			}
		}
		if(firstLink==head){
			head=head.Next;
		}else{
			previous.Next=firstLink.Next;
		}
			
	}
}
