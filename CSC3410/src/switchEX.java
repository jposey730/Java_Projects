
public class switchEX {
public static void main(String[] args) {
	String grade= "B" ;
	pass(grade);
	
	}
public static void pass(String grade){
switch (grade){
case "A":
	System.out.println("Great Job");
	break;
case "B":
	System.out.println("OK job");
	break;
case "C":
	System.out.println("You can do better!");
	break;
case "D":
	System.out.println("Fail!");
case "F":
	System.out.println("Fail!");
	default:
		System.out.println("Not an option!");
}
}
}
