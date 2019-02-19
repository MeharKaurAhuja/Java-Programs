import java.util.*;

import java.lang.*;

public class Exception1 {

	public static void main(String[] args) {
		
		Account acc = new Account();
		long acc_no;
		int pin_no;
		String amt;
		String choice = "yes";
		String print = "Account Summary\nAcc-Number\t\t\tBalance\n";
		while(choice.equals("yes")) {
			
			System.out.println("Begin your transaction:\nEnter the Account number(16 digit)");
			Scanner sc = new Scanner(System.in);
			acc_no = sc.nextLong();
			System.out.println("Enter the PIN number");
			pin_no = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the deposit amount");
			amt = sc.nextLine();
			while(!acc.validate(amt)) {
			
				System.out.println("Enter a valid amount");
				amt = sc.nextLine();
			}
			Double d = new Double("52.6");
			double amt1 = d.parseDouble(amt);
			print += acc_no + "\t\t" + amt1 +"\n";
			//System.out.println(amt1);
			Account acc1 = new Account(acc_no,pin_no,amt1);
			acc1.display();
			System.out.println("Do another transaction??(yes/no)");
			choice = sc.nextLine();
		}
		System.out.println(print);
				
	}

}

class Account {
	
	private
	long accNumber;
	int pinNumber;
	double amount;
	public
	Account() {}
	Account(long accno,int pinnum,double amt) {
		
		setAccNumber(accno);
		setPinNumber(pinnum);
		setAmount(amt);
	}
	void setAccNumber(long accno) {
		
		accNumber = accno;
	}
	
	void setPinNumber(int pinnum) {
		
		pinNumber = pinnum;
	}
	
	void setAmount(double amt) {
		
		amount = amt;
	}
	
	Boolean validate (String amt) {
		
		try {
			
			int flag = 0;
			int len = amt.length();
			for(int i = 0;i < len;i++) {
				
				if(amt.charAt(i)>='A'&&amt.charAt(i)<='z') {
					
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				
				throw new Exception();
			}
			else {
				
				return true;
			}
		}
		catch(Exception e) {
			
			return false;
		}
	}
	
	void display() {
		
		System.out.println("Amount Deposited");
	}
}