package week2.day3;
import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7,8};
		int len=a.length;
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			int j=i+1;
				if(a[i]!=j)
				{
					System.out.println(j);
					break;
					
			}
			
		}
		
		
	}

}
