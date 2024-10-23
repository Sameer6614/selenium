package selenium;

public class thisdemo6 {
thisdemo6()
{
	this(20);
	System.out.println("zero args of this demo6");
}
thisdemo6(int b)
{
	System.out.println("int args cons of thisdemo6");
	int a=20;
	int d=b;
	int c=a+b;
	System.out.println(c);
	
}
public static void main(String[] args)
{
	System.out.println("main mrthod starts");
	thisdemo6 t1=new thisdemo6();
	System.out.println(t1);
			
}
}
