package week2.day3;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int original=n;
		int remainder;
		int result=0;
		while(n>0)
		{
			remainder=n%10;
			result=result+(remainder*remainder*remainder);
			int c=n/10;	
			n=c;
		}
		if(original==result)
		{System.out.println(original+ " is an armstrg num");
		}
		else {

			System.out.println(original+" is not an armstrong num");
			
		}

	}
		
	}


