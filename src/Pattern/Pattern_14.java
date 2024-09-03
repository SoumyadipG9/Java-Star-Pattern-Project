package Pattern;

public class Pattern_14 {

	public static void main(String[] args) {
		int size=5;
         hi(size);
	}
	
	static void hi(int s)
	{
		int num=1;
		for(int row=1; row<=s; row++)
		{
	
			for(int col=1; col<s-row+1; col++)
			{
				System.out.print(num+" ");
            		//num=num+1;
			}
			System.out.println(" ");
			   num++;
		}
	}

}
