package Array_1;

import java.util.Scanner;

public class Array_Project_2 {

	public static void main(String[] args) {
	  goal();
   
     }
	
	 static int[] goal()
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter Numbers Of Arrays: ");
	    	
	    	int n=sc.nextInt();
	    	int arr[]=new int[n];
	    	
	    	for(int i=0; i<n; i++)
	    	{
	    		System.out.println("Enter "+ 1 + "th Numbers: ");
	    		arr[i]=sc.nextInt();
	    	}
	    	
	    	sc.close();
	    	return arr;
	    }
}
