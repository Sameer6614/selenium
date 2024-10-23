package selenium;

public class thisdemo6a {
	int i=5;
	thisdemo6a()
	{
	this(20);
	System.out.println("zero args of consdemo6");
	i=10;
	//System.out.println(i);
	}
	thisdemo6a(int b)
	{
		System.out.println("int args of consdemo6");
		i=b;
		
	}
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		thisdemo6a v=new thisdemo6a();
		System.out.println(v.i);
		System.out.println("done");
	}

}
