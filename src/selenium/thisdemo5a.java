package selenium;

public class thisdemo5a {
	int i=5;
	thisdemo5a()
	{
		System.out.println("zero args cons of thisdemo5");
		i=10;
	}
	thisdemo5a(int a)
	{
		this();
		System.out.println("int args cons of this demo5");
		i=a;
		//System.out.println(i);
	}
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		thisdemo5a b=new thisdemo5a(20);
		System.out.println(b.i);
		System.out.println("done");
	}

}
