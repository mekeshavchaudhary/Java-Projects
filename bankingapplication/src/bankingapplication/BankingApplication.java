package bankingapplication;

public class BankingApplication {
	public static void main(String[] args) {
		
	}

}
class BankAccount{
	
double Balance;
double LastTransaction;

public BankAccount() {
	Balance=0;
}

public void deposit(double ammount) {
	Balance = Balance + ammount;
	LastTransaction= ammount;
}
public void withdraw(double ammount) {
	Balance =Balance-ammount;
	LastTransaction = -ammount;
}
public void getLastTransection() {
	if (LastTransaction>0) {
		System.out.println("Deposite :" +LastTransaction);
	}
	else if (LastTransaction<0){
		System.out.println("Withdrawn :" +Math.abs(LastTransaction));
	}
	else {
		System.out.println("No Transaction Occured");
	}	
	}
public double getBalance() {
	return Balance;
	
}
}
	

