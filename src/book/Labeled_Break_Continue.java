package book;

public class Labeled_Break_Continue {

	public static void main(String[] args) {
		
		outerloop:
		for(int i=0; i<=6; i++)
		{
			for(int j=0; j<=i; j++)
			{
				if(j==3) break outerloop;
				
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
