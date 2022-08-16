package assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray=test.toCharArray();// Convert the String to character array
		
		for(int i=charArray.length-1;i>=0;i--)//reverse loop
				{
			if(i%2==0) {
				char a=Character.toUpperCase(test.toCharArray()[i]);
				System.out.println(a+"is odd index");
			}
			else {
				  char a = Character.toLowerCase(test.toCharArray()[i]);
			         System.out.println(a);
				
			}
		}
		

	}

}
