package Array_1;

public class Array_Traversing_1 {

	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66,88,99};
		int g=arr.length;
		
		System.out.println("Length of the Arrays is: "+g);
		
		for(int i=0; i<arr.length; i++)    //This is 'Traversing'.
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("This is Traversing with- Wile Loop.");
		int j=0;
		while( j<arr.length)
		{
			System.out.println(arr[j]);
			j++;
		}

	}

}
