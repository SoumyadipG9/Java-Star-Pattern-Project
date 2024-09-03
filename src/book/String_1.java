package book;

public class String_1 {

	public static void main(String[] args) {
		
		String name="Soumyadip";
		
		String goal=" have a good day.";
		
		System.out.println(name+""+goal);
		
		System.out.println(name.length());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.contains("Soumya"));  //This method is return 'Boolean'.
		
         System.out.println(name.charAt(3));
         
         System.out.println(name.endsWith("dip"));   //This method is return 'Boolean'.
         
         System.out.println(name.indexOf("dip"));
	}

}
