package selenium;

public class arraydemo3 {
	public static void main(String[] args)
	{
		int sam[][]=new int[3][4];
		sam[0][0]=10;
		sam[0][1]=20;
		sam[0][2]=30;
		sam[0][3]=40;
		
		sam[1][0]=50;
		sam[1][2]=60;
		sam[1][3]=70;
		sam[1][1]=80;
		
		sam[2][0]=90;
		sam[2][1]=100;
		sam[2][2]=110;
		sam[2][3]=120;
		
		System.out.println(sam[0][1]);
		
	}

}
