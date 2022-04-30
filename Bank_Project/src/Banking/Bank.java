package Banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank account.
 * @author Arpit
 *
 */
public class Bank {

	public static void main(String[] args) {
		Bank bank =new Bank();
		bank.run();

	}
	public void run()
	{
		System.out.println("Welcome to the Bank! What is your name");
		Scanner scanner = new Scanner(System.in);
		String name=scanner.next();
		System.out.println("Hello " + name + "! We are creating checking and saving account for you.");
		//create customer with given name
		Customer customer = new Customer(name);
		System.out.println("What is your address");
		String address=scanner.next();
		customer.setAddress(address);
		BankAccount checkingAccount = new BankAccount("checking",customer);
		BankAccount savingsAccount = new BankAccount("savings",customer);
		System.out.println();
		System.out.println("Customer info:");
		System.out.println(checkingAccount.getCustomerInfo());
		System.out.println("Checking Account");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings Account");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		
		//into checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		//into savings
				System.out.println();
				System.out.println("Amount (decimal) to deposit into your savings account");
				amount = scanner.nextDouble();
				savingsAccount.deposit(amount);
				System.out.println(checkingAccount.getAccountInfo());
				System.out.println(savingsAccount.getAccountInfo());
				
				//withdrawals
				//from checking
				System.out.println();
				System.out.println("Amount (decimal) to withdraw from your checking account");
				amount= scanner.nextDouble();
				try {
					checkingAccount.withdraw(amount);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
				
				//from savings
				System.out.println();
				System.out.println("Amount (decimal) to withdraw from your savings account");
				amount= scanner.nextDouble();
				try {
					savingsAccount.withdraw(amount);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
				System.out.println(checkingAccount.getAccountInfo());
				System.out.println(savingsAccount.getAccountInfo());
				scanner.close();
	}

}
