package book;

import java.util.Scanner;

public class Else_If_Loop {

	public static void main(String[] args) {
		System.out.println("Enter Your Marks: ");
		int marks=0;
		
		Scanner sc=new Scanner(System.in);
		
		marks=sc.nextInt();
		
            if(marks>=60 && marks<=100)
            {
            	System.out.println("First Divition");
            }
            
            else if(marks>=40 && marks<=60)
            {
            	System.out.println("Second Divition");
            }
            
            else if(marks>=30 && marks<=40)
            {
            	System.out.println("Third Divition");
            }
            
            else
            {
            	System.out.println("You are failed!");
            }
            
	}

}
