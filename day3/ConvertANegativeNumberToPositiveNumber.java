package week2.day3;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number=-40;
		int a=number*-1;
		if(number>0){
			System.out.println("   "+number+ " is a positive number");
		}
		else
			if(number<0)
		{
			System.out.println("   "+number+" is a negative number");
		}
		
		if(a>0) {
		System.out.println("   "+number+" this negative number converted to possitve "+a);
		}
		if(a<0)
		{
			System.out.println("   "+number+" this positive number converted to negative "+a);
		}
	}}

