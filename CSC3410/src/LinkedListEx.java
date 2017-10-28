import java.util.*;
public class LinkedListEx{
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("hello");
		list.add("hi");
		list.add("you");
		list.add("fine");
		list.add("kitten");
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.addFirst("don't");
		System.out.println(list.get(0));
		list.add(4, "true");
		System.out.println();
		Print(list);
		System.out.println(list.contains("fine"));
		list.removeFirst();
		System.out.println(list.peek());
		System.out.println();
		list.removeFirst();
		
		System.out.println(list.element());
		Object t[]=list.toArray();
		Arrays.toString(t);
		
		
		
	}
	public static void Print(LinkedList<String>x){
		for(int i=0;i<x.size();i++){
			System.out.println(x.get(i));
		}
	}
}
