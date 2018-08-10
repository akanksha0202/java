import java.util.Scanner;
import java.util.Random;
class RandomNumber
{
	public static void main(String args[])
	{
		int maxRange;
		Scanner sc=new scanner(System.in);
		Random rand=new Random();
	System.out.println("Enter maximum range :");
	maxRange=sc,nextInt();
	for(int loop=1;loop<=10;loop++)
	{
		System.out.println(rand.nextInt(maxRange));
	}
	}
}
 
//Enter max range: 50
6
3
7
24
37
48
45
35
29
10