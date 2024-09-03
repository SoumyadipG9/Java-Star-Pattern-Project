package Pattern;

public class Pattern_5 {

	public static void main(String[] args) {
		int size=6;
		tat(size);
	}
	
          static void tat(int n)
          {
        	  char c='A';
        	  for(int row=1; row<n; row++)
        	  {
        		  
        		  for(int col=1; col<n; col++)
        		  {
        			  if(row == 1 || col ==1 || row==n-1|| col==n-1 )
        			  {
        				 
        				    System.out.print(c);
        				  
        				      c=(char)(c+1);
        				  System.out.print(c);
        				  
//        				  System.out.print(c+"  ");
        				  
        			  }
        			  
        			  else
        			  {
        				  System.out.print("  ");
        				
        			  }  
        			  
        		  }
        		  
        		  System.out.println();
        		  
        		  
        	  }
          }
	   

}
