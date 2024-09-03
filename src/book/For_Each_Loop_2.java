package book;

public class For_Each_Loop_2 {

	public static void main(String[] args) {
	
		
		int arr[]= {33,45,66,23,98,5};
		
		int min=Integer.MAX_VALUE;
		
		for(int numbers:arr)
		{
			if(numbers<min)
			{
				min=numbers;
			}
			
		}
		
		System.out.println(min);

	}

}
