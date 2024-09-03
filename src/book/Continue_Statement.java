package book;

public class Continue_Statement {

	public static void main(String[] args) {
		
//		for (int i=1; i<=26; i++)
//		{
//			if(i == 4 || i==8 || i==10 || i>=18)            //Continue Program.
//			{
//				continue;
//			}
//			System.out.println(i);
//		}

		
		
		for (int i=1; i<=26; i++)
		{
				if(i == 4 || i==8 || i==10 ) continue;             // Optimize Continue Program.
					
					if(i>=18) break;
				
					System.out.println(i);
			}
		
	}

}
