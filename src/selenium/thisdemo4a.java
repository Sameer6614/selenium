package selenium;

public class thisdemo4a {
int i=5;
int j=20;
thisdemo4a()
{
	this('d');
	System.out.println("sameer");
}
thisdemo4a(char c)
{
	System.out.println("khadar");
}
public static void main(String[] args)
{
	thisdemo4a k=new thisdemo4a();
	System.out.println(k.i);
	System.out.println(k.j);
}
}
