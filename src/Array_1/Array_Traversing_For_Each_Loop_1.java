package Array_1;

public class Array_Traversing_For_Each_Loop_1 {

	public static void main(String[] args) {
		
		int marks[]= {11,22,33,44,55,66};
		int h=marks.length;
		System.out.println("Length of Arrays is: "+h);
		
		System.out.println("Array Traversing With For-Each Loop.");
		
		for(int numbers: marks)    //Array Traversing With For-Each Loop.
		{
			System.out.println(numbers);
		}

	}

}
