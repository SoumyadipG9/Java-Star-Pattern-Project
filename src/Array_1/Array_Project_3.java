package Array_1;

import java.util.Scanner;

public class Array_Project_3 {

	public static void main(String[] args) {
		
		//hi();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array No: ");
		
		int arr[]=new int [6];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter marks is: "+i);
			arr[i]=sc.nextInt();
		}

	}
	
	   static void hi(int arr[])
	   {
		   for(int i : arr)
		   {
			   System.out.println(i);
		   }
	   }

}
