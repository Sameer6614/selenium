package selenium;

public class thisdemo5 {
	thisdemo5()
	{
		System.out.println("zero of the args cons of thisdemo5");
	}
	thisdemo5(int a)
	{
		this();
		System.out.println("int args cons this demo5");
		
	}
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		thisdemo5 f=new thisdemo5(20);
		System.out.println("done");
	}

}
