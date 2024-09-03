package JAVA_HOME;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Enter Two Numbers: ");
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		
		System.out.println("Some of two numbers: "+c);

	}

}
