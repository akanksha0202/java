import java.util.Scanner;
class Swapno;
{
	public static void main(String[] args)
	{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a :");
	a=s.nextInt();
	System.out.println("Enter b:");
	b=s.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("a :"+a);
	System.out.println("b :"+b);
	}
}