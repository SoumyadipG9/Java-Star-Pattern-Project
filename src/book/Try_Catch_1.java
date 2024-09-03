package book;

public class Try_Catch_1 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		try
		{
		 System.out.println(arr[5]);          // This is a 'Try & Catch' Program.
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Exception is coming");
		}
		

	}

}
