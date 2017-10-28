import java.util.Scanner;

public class pal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input a word: ");
		String inpt=(scan.nextLine());
		String isp=palindrome(inpt);
		System.out.println(isp);
		scan.close();

	}
	public static String palindrome(String x){
		int y=x.length();
		
			if(y%2==0){
				for(int i=0;i<y/2;i++){
					if(x.charAt(i)==x.charAt(y-1)){
						
						y--;
					}else{
						return x + " is not a palindrome.";
					}
					
				}
					
			}else{
				for(int i=0;i<(y/2)+1;i++){
					if(x.charAt(i)==x.charAt(y-1)){
						
						y--;
					}else{
						return x+" is not a palindrome.";
					}
					
				}
				
			}
			return x +" is a palindrome.";
	}


}
