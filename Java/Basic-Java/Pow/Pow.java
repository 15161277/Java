import java.util.*;
public class Pow
{
	public static void main(String [] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter base ");
	int x = in.nextInt();
	System.out.print("Enter power ");
	int n = in.nextInt();
	int result = pow(x,n);
	System.out.println("-----------------------------------");
	System.out.println("Iteratively");
	System.out.println(x +" to the power of " + n + " is equal to " +result);
	System.out.println("-----------------------------------");
	System.out.println("Recursive");
	System.out.println("pow(" +x+","+n+ " )");
	int val = power(x,n);
	System.out.println(val);
	System.out.println("-----------------------------------");
	System.out.println("Iteratively using for loop");
	int total = powWithFor(x,n);
	System.out.println(total);
	
	
	
	
	
	}	
	
	public static  int pow(int x, int n)
	{
        int result = 1;

        while (n > 0)
		{
            if (n % 2 != 0) 
			{
                result = result * x;
            }

            x = x * x;
            n = n / 2;
			
			
        }

        return result;
    }
	
	public static int power(int x, int n) 
	{
    if (n == 0)
	{
        return 1;
	}
    else if (n % 2 == 0)
	{
        int val = power(x, n/2);
        return val * val;
	}
		else
		{
			return x * (power(x, n-1));
		}
	}
	public static int powWithFor(int x, int n)
{
    int total = 1;

    if(n > 0)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            total *= x;
        }
    } 
    else 
    {
        for(int i = -1 ; i >= n ; i--)
        {
            total /= x;
        }
    }
    return total;
}
}