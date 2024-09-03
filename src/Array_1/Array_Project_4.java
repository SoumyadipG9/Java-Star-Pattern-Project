package Array_1;

import java.util.Scanner;

public class Array_Project_4 {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[4];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter The Numbers For The Index: " +i);
			int data=sc.nextInt();
			arr[i]=data;
		}
		goal(arr);

	}
	
	    static void goal(int arr[])
         {
		       for(int e : arr)
		       {
		    	   System.out.println(e);
		       }
         }

}
