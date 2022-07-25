package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String empName) {
		System.out.println(empName);
	}
	public void printEmployeeId(int empid) {
		System.out.println(empid);
		
	}
public void getEmployeeAddress(String empAddress) {
	System.out.println(empAddress);
	
}
public void printEmployeeSalary(double empsalary) {
	System.out.println(empsalary);
	
}
public void printEmployeeMobileNumber(long mobnum) {
	System.out.println(mobnum);
	
}
	public static void main(String[] args) {
		EmployeeDetails emo=new EmployeeDetails();
		emo.printEmployeeId(101);
		emo.printEmployeeName("hari");
		emo.getEmployeeAddress("chennai");
		emo.printEmployeeSalary(25000.00);
		emo.printEmployeeMobileNumber(9876543219l);
		emo.printEmployeeId(102);
		emo.printEmployeeName("raj");
		emo.getEmployeeAddress("pondy");
		emo.printEmployeeSalary(24500.00);
		emo.printEmployeeMobileNumber(8765432198l);
		
		

	}

}
