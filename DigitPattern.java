public class DigitPattern
{
	public static void main(String args[])
	{	
		int d=1;
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(d + "  ");
		++d;
		}
		System.out.println();
		}
	}
} 