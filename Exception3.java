import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.*;
public class Exception3 {

	public static void main(String[] args) throws Exception{
		
		Account2 a = new Account2();
		String acc_no,acc_name,dueDate;
		Double unpaidAmt,trans_amt;
		System.out.println("Enter the transaction details\nEnter the account number");
		Scanner sc = new Scanner(System.in);
		acc_no = sc.nextLine();
		System.out.println("Enter the account holder name");
		acc_name = sc.nextLine();
		System.out.println("Enter the last due date");
		dueDate = sc.nextLine();
		System.out.println("Enter the unpaid amount");
		unpaidAmt = sc.nextDouble();
		System.out.println("Enter the transaction amount");
		trans_amt = sc.nextDouble();
		if(a.validate(dueDate,unpaidAmt,trans_amt)) {
			
			Account2 a1 = new Account2(acc_no,acc_name,unpaidAmt+trans_amt);
			a1.display();
		}
		else {
			
			System.out.println("Further Transactions Not Possible until clearance of bill.");
		}
		
	}

}

class OverLimitException extends Exception {
	
	OverLimitException() {
	
		super();
	}
}

class Account2 {
	
	String accountNumber,accountName;
	Double dueAmount;
	Account2(){}
	Account2(String accno,String accname,Double dueAmount) {
		accountNumber = accno;
		accountName = accname;
		this.dueAmount = dueAmount;
	}
	
	Boolean validate(String dueDate,Double unpaidAmount,Double amount) throws Exception{
		
		String st_date = "01/12/2015";
		Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(st_date);
		Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(dueDate);
		long diffDate = endDate.getTime() - startDate.getTime();
		float days = (diffDate/(1000*60*60*24));
		//System.out.println(days);
		try {
			
			if(unpaidAmount>2000 || days>45) {
				
				throw new OverLimitException();
			}
			else 
				return true;
		}
		catch(OverLimitException o) {
			
			return false;
		}
	}
	
	void display() {
		
		System.out.println("Transaction successfully completed.\nAccount Number: "+accountNumber+"\nAccount Name: "+accountName+"\nUnpaid Amount: "+dueAmount);
	}
}