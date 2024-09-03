package method;

public class method_6 {

	public static void main(String[] args) {
		
		    int res= result(8 , 10, true);
		    System.out.println(res);
		 
	         System.out.println("Hi Soumyadip have a good day.");
	         
	    }


	    public static int result (int a , int b, boolean ray)
	    {
	    	if(ray == false)
	    	{
	    		return 0;
	    	}
	        int res=(a+b)/2;
	       return res;
	    }

}
