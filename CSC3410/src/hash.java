import java.util.Arrays;

public class hash {
	String[] theArray;
	int arraySize;
	int itemsInArray;
public static void main(String[] args) {
	hash func=new hash(30);
	String [] elementsToAdd={"5","2","8","15","9","0","4","3","12"};
	func.hashFunction(elementsToAdd, func.theArray);
	
}
public void hashFunction(String[] stringsForArray, String[]theArray){
	for(int n=0; n<stringsForArray.length; n++){
		String element=stringsForArray[n];
		theArray[Integer.parseInt(element)]=element;
	}
}
hash(int size){
	arraySize=size;
			theArray=new String[size];
			Arrays.fill(theArray, -1);
}
}
