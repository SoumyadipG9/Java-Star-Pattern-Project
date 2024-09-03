package Practices;

public class Math_1 {

	public static void main(String[] args) {
	
		int a=6;
		int b=2;
		
		System.out.println(Math.min(a, b));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(6, 2));
		System.out.println(Math.abs(-5));
		
		System.out.println(random(15,30));
		
		System.out.println(Math.floor(5.8));
		System.out.println(Math.ceil(5.4));
		
		System.out.println(Math.round(8.6));
		
		
		
		
		

	}
	
	    static int random(int a, int b)
	    {
	    	//return (int)(Math.random()*6+1);
	    	
	    	return (int) (Math.random()*(b-a+1)+a); //This is a formula for gating any random numbers.
	    	
	    }

}
