package overloading;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Total id= " +id);
	}
	public void getStudentInfo(int id,String Name)
	{
		System.out.println("id= "+id+", Name= "+Name+",");
	}
	public void getStudentInfo(int id,String Name,String mail)
	{
		System.out.println("id= "+id+", Name= "+Name+", mail= "+mail);
	}
public static void main(String[] args) {
	Students oj2=new Students();
	oj2.getStudentInfo(5);
	oj2.getStudentInfo(1,"hari");
	oj2.getStudentInfo(2,"raju","raj@gmail.com");
}
}
