package Array_1;

public class Array_Practices_1 {

	public static void main(String[] args) {
		bob();
	
	}
	
	static int bob()     //It is called Brute Force Approach.
	{
		int arr[]= {1,2,2,3,4};
//		int i;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
				return arr[i];
			}
		}
		return 0;
	}

}
