import java.util.Scanner;
class CircleAreaCum
{
	staic Scanner sc=new Scanner(System.in);
	public statc void main(String args[])
	{
		System.out.println("Enter the Radius :");
		double radius = sc.nextDouble();
		double area = Math.PI *(radius*radius);
		System.out.println("The area of Circle is:"+area);
		double circumference= Math.PI * 2*radius;
		System.out.println("The circumference of the Circle is : "+circumference);
	}
}