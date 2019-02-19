import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
		
		String acc_no;
		Double amt,trans_amt;
		System.out.println("Enter the transaction details\nEnter the account number");
		Scanner sc = new Scanner(System.in);
		acc_no = sc.nextLine();
		System.out.println("Enter the available amount");
		amt = sc.nextDouble();
		Transaction t = new Transaction(acc_no,amt);
		String choice;
		do {
			
			System.out.println("Enter the transaction amount");
			trans_amt = sc.nextDouble();
			if(!t.validate(trans_amt)) {
			
				System.out.println("Insufficient Balance");
				break;
			}
			sc.nextLine();
			System.out.println("Do you want to enter more ?(yes/no)");
			choice = sc.nextLine();
		}
		while(choice.equals("yes"));
	}

}

class Transaction {
	
	private
	String accountNumber;
	Double amount;
	public
	void setAccountNumber(String accno) {
		
		accountNumber = accno;
	}
	void setAmount(Double amt) {
		
		amount = amt;
	}
	Transaction(String accno,Double amt) {
		
		setAccountNumber(accno);
		setAmount(amt);
	}
	Boolean validate(Double transactionAmount) {
	
		try {
			
			if(transactionAmount > amount || amount < 500) {
			
				throw new Exception();
			}
			else {
				amount = amount - transactionAmount;
				return true;
			}
		}
		catch(Exception e) {
		
			return false;
		}
		finally {
			
			System.out.println("Your available balance "+amount);
		}
	}
}