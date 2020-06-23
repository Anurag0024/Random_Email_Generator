package emailapp;

import java.util.Scanner;

public class Email {

private	String firstName;
private String lastName;
private String password;
private String department;
private	int mailboxCapacity=1000;
private String random_email;
private  int defaultPasswordlength=6; 
private	String alternateEmail;
private String endmail= "empcompany.com";

// Constructor for receiving first and last name
public Email(String firstName,String lastName) {
	this.firstName= firstName;
	this.lastName= lastName;
	
	
	//calling method for set department
	this.department= setDepartment();
	System.out.println("Department: "+ this.department);
	
	// return random password
	this.password= randomPassword(defaultPasswordlength);
   
    
    // generate  random email
    random_email= firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +department+"_" + endmail;
   
}

// choose department
	private String setDepartment() {
		System.out.println("\nChoose Departments\n1  IT\n2  HR\n3  Sales\n4  Accounting\n5  Development\n6  Other\n\n Enter department value:");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if(depChoice == 1) {return "it";}
		else if(depChoice == 2) {return "hr";}
		else if(depChoice == 3) {return "sale";}
		else if(depChoice == 4) {return "acc";}
		else if(depChoice == 5) {return "dev";}
		else{return"";
		}
		
			
	}
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet= "ASEW89NHDE34KNCS90VFRS42MOSW62USRE652GBSE14SSHS38SJSNSV36WHS27WUJW2FT2W8WUWHWF2R2627WWHWGWFW626272UWHWG2T6";
		char[] password= new char[length];
		for (int i=0;i<length;i++) {
			int rand=(int)(Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity= capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail= altEmail;
	}
	
	// Change password
	public void changePassword(String password) {
		this.password= password;
	}
	
  
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName+ "" + lastName +
				"\nCOMPANY EMAIL: " + random_email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity  +"mb";
	}
		
	
}
