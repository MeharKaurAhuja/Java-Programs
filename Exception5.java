import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception5 {

	public static void main(String[] args) throws Exception{
		
		String acc_no,acc_name,date;
		Double amt,trans_amt;
		System.out.println("Enter the transaction details\nEnter the account number");
		Scanner sc = new Scanner(System.in);
		acc_no = sc.nextLine();
		System.out.println("Enter the account holder name");
		acc_name = sc.nextLine();
		System.out.println("Enter the last due date");
		date = sc.nextLine();
		System.out.println("Enter the unpaid amount");
		amt = sc.nextDouble();
		//Transaction t = new Transaction(acc_no,amt);
		Account3 a = new Account3();
		String choice;
		//do {
			
			System.out.println("Enter the transaction amount");
			trans_amt = sc.nextDouble();
			while(a.validate(date,amt,trans_amt) != 0) {
				if(a.validate(date,amt,trans_amt) == -1) {
			
					System.out.println("Invalid Amount");
					System.out.println("Enter the unpaid amount");
					amt = sc.nextDouble();
				}	
				else if(a.validate(date,amt,trans_amt) == -2) {
				
				System.out.println("Invalid Date Format");
				System.out.println("Enter the last due date");
				date = sc.nextLine();
				}
				else if(a.validate(date,amt,trans_amt) == -3) {
				
					System.out.println("Further Transaction Not Possible Until Clearance of bill");
					break;
				}
				else {
					
					amt = amt + trans_amt;
				}
			}
			/*else {
			sc.nextLine();
			System.out.println("Do you want to enter more ?(yes/no)");
			choice = sc.nextLine();
			}*/
		//}
		//while(choice.equals("yes"));
			if(a.validate(date, amt, trans_amt) == 0) {
				Account3 a1 = new Account3(acc_no,acc_name,amt);
				a1.display();
			}

	}

}

class Exception11 extends Exception {
	
	Exception11() {
		
		super();
	}
}

class Exception22 extends Exception {
	
	Exception22() {
		
		super();
	}
}

class Exception33 extends Exception {
	
	Exception33() {
		
		super();
	}
}
class Account3 {
	
	String accountNumber,accountName;
	Double dueAmount;
	Account3(){}
	Account3(String accno,String accname,Double dueAmount) {
		accountNumber = accno;
		accountName = accname;
		this.dueAmount = dueAmount;
	}
	
	Integer validate(String dueDate,Double unpaidAmount,Double amount) throws Exception{
		
		String st_date = "01/12/2015";
		Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(st_date);
		Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(dueDate);
		long diffDate = endDate.getTime() - startDate.getTime();
		float days = (diffDate/(1000*60*60*24));
		//System.out.println(days);
		try {
			
			//else {
				//return 0;
			
			int date[] = new int[3];
			int i = 0,j = 0,k = 0;
			int len = dueDate.length();
			for(i=0;i<len;i++) {
			
				if(dueDate.charAt(i) == '/') {
				
					date[j] = Integer.parseInt(dueDate.substring(k,i));
					k = i + 1;
					j++;
				}
			}
			date[j] = Integer.parseInt(dueDate.substring(k,i));
			
			if(date[1] > 12) {
				
				throw new Exception22();
			}
			else {
				
				switch(date[1]) {
				
				case 2: if(date[2]%4 == 0) {
					
							if(date[0] > 29)
								throw new Exception22();
						}
						else {
							
							if(date[0] > 28) {
								
								throw new Exception22();
							}
						}
				break;
					
				case 4:if(date[0] > 30) 
					throw new Exception22();
				break;
				case 6:if(date[0] > 30) 
					throw new Exception22();
				break;
				case 9:if(date[0] > 30) 
					throw new Exception22();
				break;
				case 11:if(date[0] > 30) 
					throw new Exception22();
				break;
				default:if(date[0] > 31) 
					throw new Exception22();
				}
			}
			
			if(unpaidAmount>2000 || days>45) {
				
				throw new Exception11();
			}
			
			int flag = 0;
			String amt = new String(amount.toString());
			System.out.println(amt);
			int len_amt = amt.length();
			for(i = 0;i < len_amt;i++) {
				
				if(amt.charAt(i)>='A'&&amt.charAt(i)<='z') {
					
					flag = 1;
					break;
				}
			}
			if(flag == 1) {
				
				throw new Exception33();
			}
			else {
				
				return 0;
			}
		
		}
		catch(Exception11 e) {
			
			return -1;
		}
		catch(Exception22 e) {
			
			return -2;
		}
		/*catch(Exception33 e) {
			
			return -3;
		}*/
		
	}
	
	void display() {
		
		System.out.println("Transaction successfully completed.\nAccount Number: "+accountNumber+"\nAccount Name: "+accountName+"\nUnpaid Amount: "+dueAmount);
	}
}
