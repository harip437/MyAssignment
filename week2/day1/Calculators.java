package week2.day1;

public class Calculators {
	public int  additionTwoNumber(int a,int b) {
		int c=a+b;
		return(c);
		
	}
	public int substraction(int e,int f) {
		int g=e-f;
		return(g);
		
	}
	public double multipleTwoNumber(double i,double j) {
		double k=i*j;
		return(k);
				
		
	}
	public float divideTwoNumber(float x,float y) {
		float z=x/y;
		return(z);
		
	}

	public static void main(String[] args) {
		Calculators ca=new Calculators();
		int add = ca.additionTwoNumber(50, 60);
		System.out.println("adding two numbers is "+ add);
		int sub = ca.substraction(50, 60);
		System.out.println("sub two numbers is "+ sub);
		double mul = ca.multipleTwoNumber(5, 6);
		System.out.println("multipling two numbers is "+ mul);
		float div = ca.divideTwoNumber(50, 6);
		System.out.println("dividing two numbers is "+ div);

	}
	

}
