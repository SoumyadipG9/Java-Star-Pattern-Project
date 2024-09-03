package book;

public class For_Each_Loop {

	public static void main(String[] args) {
		
		int arr[]= {33,42,51,83,92,15};
		
		int sum=0;
		
		for(int num:arr)                      //This is a 'For Each Loop' program.
		{
			  sum=sum+num;
			//sum+=num;
		}

		System.out.println("Sum of the all numbers - "+sum);
	}

}
