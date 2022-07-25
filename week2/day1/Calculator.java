package week2.day1;

public class Calculator {
	public void additionTwoNumber(int a,int b) {
	 System.out.println(a+b);
		
	}
	public void substraction(int e,int f) {
		System.out.println(e-f);
		
	}
	public void multipleTwoNumber(double i,double j) {
		System.out.println(i*j);
		
	}
	public void divideTwoNumber(float x,float y) {
		System.out.println(x/y);
		
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.multipleTwoNumber(20, 2);
		cal.additionTwoNumber(20, 20);
		cal.substraction(30, 20);
		cal.divideTwoNumber(40, 2);
	}

}
