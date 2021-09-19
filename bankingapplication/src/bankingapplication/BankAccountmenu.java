package bankingapplication;

import java.util.Scanner;

public class BankAccountmenu {
	 static Scanner scan = new Scanner(System.in);
	    static String buffer;
	    public static void main(String args[])
	    {
	        System.out.println("+++++++++++++++++++++++++++++Welcome to ABC Bank+++++++++++++++++++++++++");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit Amount");
	        System.out.println("3. Withdraw Amount");
	        System.out.println("4. Display Last Transaction");
	        System.out.println("5. Exit");
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	        int choice;
	        BankAccount User = new BankAccount();
	        double amount;
	        
	        while(true)
	        {               
	            System.out.print("Enter a choice : ");
	            choice = scan.nextInt();
	            buffer = scan.nextLine();
	            System.out.println("-     -     -     -     -     -     -     -     -     -     -     -  ");
	        
	            switch(choice)
	            {
	                case 1:
	                    System.out.println("                               BALANCE                               ");
	                    System.out.println("Current Balance : Rs. " + User.getBalance());
	                    break;
	            
	                case 2:
	                    System.out.println("                               DEPOSIT                               ");
	                    System.out.println("Current Balance : Rs. " + User.getBalance());
	                    System.out.print("Enter amount to deposit : ");
	                    amount = scan.nextDouble();
	                    buffer = scan.nextLine();
	                    User.deposit(amount);
	                    System.out.println("Amount deposited!");
	                    System.out.println("New Balance : Rs. " + User.getBalance());
	                    break;
	             
	                case 3:
	                    System.out.println("                               WITHDRAW                              ");
	                    System.out.println("Current Balance : Rs. " + User.getBalance());
	                    System.out.print("Enter amount to withdraw : ");
	                    amount = scan.nextDouble();
	                    buffer = scan.nextLine();
	                    User.withdraw(amount);
	                    System.out.println("Amount deducted!");
	                    System.out.println("New Balance : Rs. " + User.getBalance());
	                    break;
	                
	                case 4:
	                    System.out.println("                           LAST TRANSACTION                          ");
	                    User.getLastTransection();
	                    break;
	                
	                case 5:
	                    return;
	                
	                default:
	                    System.out.println("Wrong choice!");
	            }
	            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        }    
	    }

}
