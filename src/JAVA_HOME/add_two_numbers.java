package JAVA_HOME;

import java.util.Scanner;

public class add_two_numbers {

	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		int a,b,c;
		Scanner yap=new Scanner(System.in);
		   a=yap.nextInt();
		   b=yap.nextInt();
		   
		   c=a+b;
		   System.out.println("Sum of two numbers: "+c);
	}

}
