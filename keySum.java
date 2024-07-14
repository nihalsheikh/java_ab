import java.lang.*;
import java.util.*;

public class keySum
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		
		// add two nums
		int a, b, c;
		
		System.out.println("Enter a: ");
		a = s.nextInt();
		
		System.out.println("Enter b: ");
		b = s.nextInt();
		
		c = a + b;
		
		System.out.println("Sum is: " + c);
	}
}