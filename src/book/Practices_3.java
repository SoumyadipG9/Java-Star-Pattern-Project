package book;

import java.util.Scanner;

public class Practices_3 {

	public static void main(String[] args) {
		
		
                   
//                   if(time>=10)
//                   {
//                	   if(time<=20)
//                	   {
//                		   System.out.println("This time offices is open.");
//                	   }
//                	   else
//                	   {
//                		   System.out.println("This time offices is close.");
//                	   }
//                	  
//                   }
//                   
//                   else
//            	   {
//            		   System.out.println("Offices is close.");
//            	   }
//                   
                   
		      System.out.println("Enter time: ");
		
              int time;
             Scanner sc=new Scanner(System.in);
              time=sc.nextInt();                                  //This is a 'logical operator' program.
                
		      if(time>=10 && time <=20)
		      {
		    	  System.out.println("Offices is open.");
		      }
		      
		      else
		      {
		    	  System.out.println("Offices is close.");
		      }
              
	}

}
