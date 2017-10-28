import java.awt.*;
import java.util.*;
public class binarySearch {
public static void main(String[] args) {
int []arr= new int[10];
arr[0]=3;
arr[1]=5;
arr[2]=7;
arr[3]=57;
arr[4]=109;
arr[5]=5;
arr[6]=3;
arr[7]=-5;
arr[8]=7;
arr[9]=-22;

retLarge(arr);
}
public static void retLarge(int [] x){
	int largest=x[0];
	int smallest=x[0];
	for (int j=1; j<x.length; j++){
		if(x[j]>largest){
			largest=x[j];	
		}
		if (x[j]<smallest){
			smallest=x[j];
		}
		
	}
	System.out.println("Largest = "+largest);
	System.out.println("Smallest = " +smallest);
}
}
