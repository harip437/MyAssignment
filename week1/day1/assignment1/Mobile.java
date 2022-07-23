package week1.day1.assignment1;

public class Mobile 
{
	public void sendMessage()
	{
		System.out.println("send message");
	}
	public void shareDocument()
	{
		System.out.println("share the document");
	}
    public void call() 
    {
    	System.out.println("call");
		
	}
	public static void main(String[] args) {
		Mobile mymob=new Mobile();
		mymob.sendMessage();
		mymob.shareDocument();
		mymob.call();
	}

}
