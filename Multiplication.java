import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
		int i,no,table=1;
		Scanner s=new Scanner(System.in);
		Sysytem.out.println("Enter any no. :");
		no=s.nextInt();
		for(i=1;i<=10;i++)
		{
			table=no*i;
		System.out.println(table);
		}
	}
}
Output
Enter any no.:
5

5
10
15
20
25
30
35
40
45
50


	