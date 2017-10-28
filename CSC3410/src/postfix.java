import java.util.*;
public class postfix {
public static void main(String[] args) {
String k="AAAAAABBB";
boolean p=isIn(k);
System.out.println(p);
System.out.println(k.charAt(0));
BinaryTree tree=new BinaryTree();
}
public static boolean isIn(String x){
	if(x.length()>=3){
		if(x.equals("AAB")){
		return true;
		}else{
		return isIn(x.substring(2,x.length()-1));
	}
	}else{
	return false;
	}
}
}

