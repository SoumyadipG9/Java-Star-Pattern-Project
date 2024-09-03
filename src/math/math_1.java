package math;

public class math_1 {

	public static void main(String[] args) {
		
		int a=4;
		int b=2;
		
		System.out.println(Math.min(a,b));
		
		System.out.println(Math.sqrt(22));
		
		System.out.println(Math.pow(3, 4));
		
		System.out.println(Math.abs(-9));
		
		System.out.println(Math.floor(8.9));
		
		System.out.println(Math.ceil(4.9));
		
		System.out.println(Math.ceil(8.1));
		
		System.out.println(Math.round(4.6));
		
		
		System.out.println(RandomNumbers());
		


	}
	
	     public static int RandomNumbers()
	     {
	    	    return (int) (Math.random()*6)+1;
	     }
		

	

}
