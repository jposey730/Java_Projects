import java.util.Arrays;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class LCS {
	public static void main(String[] args) {
		int [] arr={2,4,7,3,4,9,0};
		
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++ ){
				if (arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
	int [] ba={9,1,7,3,4,9,0};
	for(int i=1; i<=ba.length-1; i++){
		
		int curr=ba[i];
		int j=i-1;
		while((j>=0)&&(ba[j]>curr)){
			ba[j+1]=ba[j];
			j--;
		}
		ba[j+1]=curr;
	}
	System.out.println(Arrays.toString(ba));
	
	int [] b={9,1,7,3,4,9,0,7,13,-2,44, 89};
	int l[]=Arrays.copyOfRange(b, 0, b.length/2);
	int r[]=Arrays.copyOfRange(b, b.length/2, b.length);
	for(int i=r.length-1;i>0;i--){
		for(int j=0;j<i;j++ ){
			if (r[j]>r[j+1]){
				int tmp=r[j];
				r[j]=r[j+1];
				r[j+1]=tmp;
			}
		}
	}
		for(int i=l.length-1;i>0;i--){
			for(int j=0;j<i;j++ ){
				if (l[j]>l[j+1]){
					int tmp=r[j];
					l[j]=l[j+1];
					l[j+1]=tmp;
	}
			}
		}
		for(int i=0; i<l.length-1;i++){
			if(r[i]<l[i]){
				a[i]
				
			}
		}
	}
}
