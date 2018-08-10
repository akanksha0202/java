
import java.util.Scanner;
class GreatestNumber
{
	public ststic void main(String args[])
	{
		int a,b,c,largest;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any three nos. :");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		largest=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println("Largest number:"+largest);
	}
}
/*
Output:
Enter any three nos. :
7
6
11
Largest number:11