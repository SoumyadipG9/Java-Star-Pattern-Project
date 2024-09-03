package Practices;

public class Ternary_Operator_1 {

	public static void main(String[] args) {
		
		int yap=wx(6,2);
		
		System.out.println(yap);
	}	

	public static int wx(int a, int b)
	{
		int min=a<b?a:b;
		return min;
	}

}
