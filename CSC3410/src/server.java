import java.io.PrintStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String[] args) throws Exception{
		ServerSocket sock=new ServerSocket(1234);
		Socket ss=sock.accept();
		Scanner scan=new Scanner(ss.getInputStream());
		int number=scan.nextInt();
		int temp=number*2;
		PrintStream ps=new PrintStream(ss.getOutputStream());
		ps.print(temp);
		
		
	}
}
