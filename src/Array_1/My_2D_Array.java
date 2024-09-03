package Array_1;

public class My_2D_Array {

	public static void main(String[] args) {
		
		int arr[][]= {
				{11,22,33,44},
				{10,20,30,40}
		};
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		int num1=arr[0][1];
		int num2=arr[1][2];
		int num3=arr[1][3];
		
		System.out.println("First num: "+num1);
		System.out.println("Second num: "+num2);
		System.out.println("Third num: "+num3);
		
		
		for(int matrix[] : arr )
		{
			for(int value : matrix)
			{
				System.out.println(value+" ");
			}
		}

	}

}
