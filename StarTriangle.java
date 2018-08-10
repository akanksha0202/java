class StarTriangle
{
	public static void main(String[] args)
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.println(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.println("*");
			}
		System.out.println("");
		}
	}
}
	