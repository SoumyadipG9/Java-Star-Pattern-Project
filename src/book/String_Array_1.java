package book;

public class String_Array_1 {

	public static void main(String[] args) {
		
		String name[]= {"rat","cat","tiger","lion","bird"};
		name[2]="dog";    //This is a 'String Updated Name'.
		
		for(String store:name)    //This is a 'For Each Loop'.
		{
			System.out.println(store);
		}

	}

}
