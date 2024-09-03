import java.util.Scanner;

public class Nested_if_else {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers: ");
		
		int a=22,b=33,c=66;
		
		Scanner yap=new Scanner(System.in);
		
       a=yap.nextInt();
		b=yap.nextInt();
	     c=yap.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(" bigest number is: "+a);
			}
			
			else
			{
				System.out.println(" bigest number is: "+c);
			}
			
		}
		
		else {
			
			if(b>c)
				
			{
				System.out.println("bigest number is: "+b);
			}
			
			else {
				
				System.out.println("bigest number is: "+c);
				
			}
			
		}
		
		
	}

}
