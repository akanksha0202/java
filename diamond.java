import java.util.Scanner;
class Dimond
{
	public static void main(String[] args)
	{
		int n,c,k,space=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		space=n-1;
		for(k=1;k<=n;k++)
		{
			for(c=1;c<=space;c++)
			System.out.print( );
			space--;
			for(c=1;c<=2*k-1;c++)
			System.out.print("*");
			System.out.print(" ");
		}
	space=1;
	
	for(k=1;k<=n-1;k++)
	{
	for(c=1;c<=space;c++)
	System.out.print(" ");
	sapce++;
	for(c=1;c<=2*(n-k)-1;c++)
	System.out.print("*");
	System.out.println("");
	}
	}
}
		
