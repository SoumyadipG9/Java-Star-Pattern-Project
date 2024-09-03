package book;

public class Bits_1 {

	public static void main(String[] args) {
		
		int a=6;
		int p=2;
	   int bit=1<<p;
	   
	   if((bit&p)==0)
	   {
		   System.out.println("Bitwise");
	   }
	   else
	   {
		   System.out.println("Not Bitwise");
	   }

	}

}
