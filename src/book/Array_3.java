package book;

public class Array_3 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		arr[3]=55;        // Updated value in an 'Array'.
		
		System.out.println(arr[3]);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	
	}

}
