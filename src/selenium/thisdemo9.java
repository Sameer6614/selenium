package selenium;

public class thisdemo9 {
	thisdemo9()
	{
		System.out.println("zero args of the cons of this demo9");
		this(20);
	}
	thisdemo9(int a)
	{
		System.out.println("int args cons of this demo");
		this();
	}
public static void main(String[] args)
{
	thisdemo6 k=new thisdemo6();
	System.out.println("done");
	
}
}
