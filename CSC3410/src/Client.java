import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException{
		Scanner scan=new Scanner(System.in);
		Socket sock=new Socket("127.0.0.1", 1234);
		Scanner scan2=new Scanner(sock.getInputStream());
		System.out.println("Please enter a number: ");
		int num=scan.nextInt();
		PrintStream p=new PrintStream(sock.getOutputStream());
		p.println(num);
		int temp=scan2.nextInt();
		System.out.println(temp);
	

	}

}
