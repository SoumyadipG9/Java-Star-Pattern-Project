package Practices;

public class Method_3 {

	public static void main(String[] args) {
		sum(6,4,true);
		System.out.println("Hi Soumyadip, have a good day.");
		sum(2,6,false);
		
	}
	
                                        // Average of two numbers.
	
	   static void sum(int a, int b, boolean eat)
	   {
		   int avg=(a+b)/2;
		   System.out.println("Average of two numbers: "+avg);
	   }

}
