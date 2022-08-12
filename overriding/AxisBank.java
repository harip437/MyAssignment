package overriding;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("10000");
	}
	public static void main(String[] args) {
		AxisBank ob=new AxisBank();
		ob.deposit();
		ob.saving();
		ob.fixed();
		
	}


}
