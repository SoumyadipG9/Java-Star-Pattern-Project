package book;

import java.util.Scanner;

public class Logical_Operator {

	public static void main(String[] args) {
		
//		 System.out.println("Enter time: ");
//			
//         int time;
//         
//        Scanner sc=new Scanner(System.in);
//         time=sc.nextInt();                                  //This is a 'logical operator' program.
//           
//	      if(time>=10 && time <=20)
//	      {
//	    	  System.out.println("Offices is open.");
//	      }
//	      
//	      else
//	      {
//	    	  System.out.println("Offices is close.");
//	      }
		
		
		System.out.println("Enter the time: ");
		
		int time;
		 Scanner sc=new Scanner(System.in);
          time=sc.nextInt();
          
          if(time==1 || time==18)
          {
        	  System.out.println("Time to eat.");
          }
          
          else
          {
        	  System.out.println("Time to work.");
          }
		
		

	}

}
