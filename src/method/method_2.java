package method;

public class method_2 {

	public static void main(String[] args) {
		
		        int res= result( 6 , 4, true);
		        
		        System.out.println(res);
	}
	
	
	        public static int result (int a , int b, boolean test)
	        {
	        	if(test==false)
	        	{
	        		return -1;
	        	}
	        	int res=(a+b)/2;
	        	return res;
	        }

}
