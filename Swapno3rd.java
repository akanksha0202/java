import java.util.Scanner;
class Swapnothird
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=s.nextInt();
		System.out.println("Enter value of b: ");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}