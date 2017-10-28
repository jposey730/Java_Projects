
public class Bank {
public static void main(String[] args) {
	BankAccount aaa=new BankAccount();
	aaa.printAccount();
	BankAccount bbb=new BankAccount("Graham",2000);
	bbb.printAccount();
	bbb.withdraw(1000);
	bbb.printAccount();
	aaa.deposit(200);
}
}
