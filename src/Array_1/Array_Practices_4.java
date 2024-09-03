package Array_1;

public class Array_Practices_4 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,5};
		int arr2[]= {6,8,9};
		
		int n=arr1.length;
		System.out.println("Array length is: "+n);
		
		int m=arr2.length;
		System.out.println("Array length is: "+m);
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				System.out.println("Traverse The Whole Array-1: "+arr1[i]);
				
				System.out.println("Traverse The Whole Array-2: "+arr1[j]);
			}
		}
		
	}

}
