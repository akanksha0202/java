import java.util.Date;
public class GetDateTime
{
	public static void main(String aargs[])
	{
		Date date=new Date();
	System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()-100));
	System.out.println(date.toString());
	System.out.println(date.getHours()+":"+date.getMintutes()+":"+date.getSeconds());
	}
}