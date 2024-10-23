package selenium;

public class staticconsdemo1
{
int i=1;
static int j=1;
staticconsdemo1()
{
	i++;
	j++;
}
public static void main(String[] args)
{
	System.out.println(j);
	staticconsdemo1 sc1=new staticconsdemo1();
	System.out.println(sc1.i);
	System.out.println(sc1.j);
	staticconsdemo1 sc2=new staticconsdemo1();
	System.out.println(sc2.i);
	System.out.println(sc2.j);
	
}
}
