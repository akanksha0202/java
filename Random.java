import java.util.*;
class GenerateRandomNumber
{
	public static void main(String[] args)
	{
		int counter;
		Random rnum=new Random();
	System.out.println("Random Numbers:");
	System.out.println("**************");
	for(counter=1;counter<=5;counter++)
	{
		System.out.println(rnum.nextInt(200));
	}
	}
}

Random Numbers:
***************
135
173
5
16
15

	