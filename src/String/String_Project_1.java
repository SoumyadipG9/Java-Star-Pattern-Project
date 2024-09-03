package String;

import java.util.Scanner;

public class String_Project_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your First Name: ");
		String firstname=sc.nextLine();     //This is for input and next line.
		
		System.out.println("Enter Your Last Name: ");
		String lastname=sc.next();      //This is for input but not for the next line.
		
		System.out.println("Your Full Name Is: "+firstname+" "+lastname);

	}

}
