import java.util.*;
import java.text.SimpleDateFormat;

public class Exception2 {

	public static void main(String[] args) throws Exception{
		
		String acc_name,acc_type,date;
		Account1 acc = new Account1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer details\nEnter the name");
		acc_name = sc.nextLine();
		System.out.println("Enter account type");
		acc_type = sc.nextLine();
		System.out.println("Enter date-of-birth");
		date = sc.nextLine();
		while(!acc.validateDOB(date)) {
			
			System.out.println("Wrong Format(eg:01/01/2015)");
			System.out.println("Enter date-of-birth");
			date = sc.nextLine();
		}
		Account1 acc1 = new Account1(acc_name,acc_type,date);
		acc1.display();
		sc.close();
	}

}

class Account1 {
	
	String accountName,accountType;
	Date dob;
	Account1(){}
	Account1(String accn,String acct,String d) throws Exception{
		
		accountName = accn;
		accountType = acct;
		dob = new SimpleDateFormat("dd/MM/yyyy").parse(d);
	}
	
	void display() {
		
		System.out.println("Account Details\nName : "+accountName+"\nType : "+accountType+"\nD.O.B : "+dob);
	}
	
	Boolean validateDOB(String d) {
		
		try {
			int date[] = new int[3];
			int i = 0,j = 0,k = 0;
			int len = d.length();
			for(i=0;i<len;i++) {
			
				if(d.charAt(i) == '/') {
				
					date[j] = Integer.parseInt(d.substring(k,i));
					k = i + 1;
					j++;
				}
			}
			date[j] = Integer.parseInt(d.substring(k,i));
			
			if(date[1] > 12) {
				
				throw new Exception();
			}
			else {
				
				switch(date[1]) {
				
				case 2: if(date[2]%4 == 0) {
					
							if(date[0] > 29)
								throw new Exception();
						}
						else {
							
							if(date[0] > 28) {
								
								throw new Exception();
							}
						}
				break;
					
				case 4:if(date[0] > 30) 
					throw new Exception();
				break;
				case 6:if(date[0] > 30) 
					throw new Exception();
				break;
				case 9:if(date[0] > 30) 
					throw new Exception();
				break;
				case 11:if(date[0] > 30) 
					throw new Exception();
				break;
				default:if(date[0] > 31) 
					throw new Exception();
				}
			}
			return true;
		}
		catch(Exception e) {
			
			return false;
		}
	}
}