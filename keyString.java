import java.lang.*;
import java.util.*;

public class keyString
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		
		// take user name
		System.out.println("What's your name?: ");
		String name = s.next();
		
		System.out.println("Hello, " + name);
	}
}