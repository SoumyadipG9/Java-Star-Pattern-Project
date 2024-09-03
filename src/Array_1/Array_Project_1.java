package Array_1;

import java.util.Scanner;

public class Array_Project_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int marks[] = {11,22,33,44,55};
		
		for(int i=0; i < marks.length; i++)
		{
			System.out.println("Enter " + (i+1) + "th marks: ");
			marks[i]=sc.nextInt();
		}
		System.out.println("Total Marks Is: ");
		
		for(int numbers : marks)
		{
			System.out.println(numbers);
		}

	}

}
