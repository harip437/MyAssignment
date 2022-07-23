package week1.day1.assignment1;

public class Car {
		public void applyBreak() 
		{
			System.out.println("apply break safe drive");
		}
		public void applyGear() 
		{
			System.out.println("apply gear when its requried");
		}
		public void switchOnAc()
		{
			System.out.println("switch on ac");
		}
		public void applyAcclerate()
		{
			System.out.println("safely apply acclerate");
		}

	public static void main(String[] args) {
		Car fourwheel=new Car();
		fourwheel.applyBreak();
		fourwheel.applyGear();
		fourwheel.switchOnAc();
		fourwheel.applyAcclerate();
		
		

	}

}
