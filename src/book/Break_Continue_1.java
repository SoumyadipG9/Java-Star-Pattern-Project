package book;

public class Break_Continue_1 {

	public static void main(String[] args) {
		
//		int i;
//		for(i=0; i<10; i++)
//		{
//			System.out.println(i);
//			break;                              //  This is a 'Break Statement' Program.
//		}
//		System.out.println("The loop is over");
		
		int j=0;
		
		for(j=0; j<=15; j++)
		{
			if(j==4 || j==6 || j==8 || j==10)continue;  // This is a 'Continue Statement' Program.
			System.out.println(j);
		}
		
		System.out.println("The loop is end");
	}

}
