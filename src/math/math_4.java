package math;

public class math_4 {

	public static void main(String[] args) {
		
		int a=4;
		int b=9;
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		
		System.out.println(random(5,15));   //This is for 'random numbers'.
		
	}
	
	    public static int random(int a,int b)
	    {
	    	//return (int) (Math.random()*6+1);   //This is for 'random numbers'.
	    	
	    	return (int) (Math.random()*(b-a+1)+a); //This program is for '5 TO 15' random value.
	    }
}
