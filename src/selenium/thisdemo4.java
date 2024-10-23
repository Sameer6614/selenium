package selenium;

public class thisdemo4 {
	int i=5;
	int j=10;
	thisdemo4()
	{
		System.out.println("zero args of this demo4");
		i=15;
	}
	thisdemo4(int a)
	{
		System.out.println("int args of this demo4");
		j=a;
	}
 public static void main(String[] args)
 {
	 thisdemo4 k=new thisdemo4();
	 System.out.println(k.i);
	 thisdemo4 g=new thisdemo4(30);
	 System.out.println(g.j);
			 
 }
}
