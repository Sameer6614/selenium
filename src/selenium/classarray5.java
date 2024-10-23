package selenium;

public class classarray5 
{
	public static void main(String[] args)
	{
		double sam[]=new double[20];
		sam[0]=0.7778888;
		System.out.println(sam[0]);
		sam[1]=1.344456;
		System.out.println(sam[1]);
		sam[2]=3.66453;
		System.out.println(sam[2]);
		sam[3]=4.543678;
		System.out.println(sam[3]);
		try
		{
		double c[]={2.4445,6.78900,4.56784,3.78905,2.56432};
		System.out.println(c[5]);
		
		

		System.out.println(c[4]);
		System.out.println(c[3]);
		System.out.println(c[2]);
		System.out.println(c[1]);
		System.out.println(c[0]);
		}
		catch(arrayindexoutofbounds g)
		{
			System.out.println("arrayindexoutofbounds");
		}
	}

}
