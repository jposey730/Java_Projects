
public class fact {
public static void main(String[] args) {
	String h="Hello there";
	int y=9;
int x=0;
while(x<h.length()){
	System.out.print(h.charAt(x));
	x++;
}
System.out.println("\n"+h.length());
for(int i=0;i<h.length();i++){
	System.out.print(h.charAt(i));
}
int total=1;
for(int i=1; i<=y;i++){
	total=total*i;
}

System.out.println("\n"+total);
}
}
