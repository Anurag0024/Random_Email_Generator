package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee First Name");
		String firstname= sc.nextLine();
		System.out.println("Enter employee Last Name");
		String lastname= sc.nextLine();
		Email email= new Email(firstname,lastname);
		System.out.println(email.showInfo());
		sc.close();
	
		
	}

}
