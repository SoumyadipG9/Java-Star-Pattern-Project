package Array_1;

public class Array_Practices_3 {

	public static void main(String[] args) {
		
		goal();

	}

	    static int goal()
	    {
	    	int arr[]= {1,2,3,7,5};
	    	  int sum=12;
	    	  int n=5;
	    	  
	    	  for(int i=0; i<n; i++)
	    	  {
	    		  for(int j=i+1; j<n; j++)
	    		  {
//	    			  System.out.println(n);
//	    			return n;
	    			  if(n==sum)
	    			  {
	    				  System.out.println(sum); 
	    			  }
	    			  else
	    			  {
	    				  return sum;
	    			  }
	    		  }
	    	  }
	    	  return 0;
	    }
	  
	    
}
