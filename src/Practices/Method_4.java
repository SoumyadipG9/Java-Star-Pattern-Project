package Practices;

public class Method_4 {

	public static void main(String[] args) {
		
		int eat=goal(2,8,false);
		
		System.out.println(eat);
		
		 
	}
	
	
	 static int goal(int a, int b, boolean tat)
	{
		 if(tat==false)
		 {
			 return 0;
		 }
		 
		int avg=(a+b)/2;
		return avg;
	}
			

	

}
