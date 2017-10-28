
public class BankAccount {
	String name;
	double balance;
	
	public BankAccount(){
	this.name=null;
	this.balance=0;
	}
	public BankAccount(String x, double y){
		name=x;
		balance=y;
	}
	public void deposit(int dollars){
		this.balance+=dollars;
	}
	public void withdraw(int dollars){
		if(balance<dollars){
			System.out.println("Not enough maoney in account!");
		}else{
			balance-=dollars;
		}
	}
	public void printAccount(){
		System.out.println(name);
		System.out.println(balance);
		
	}
}
