import java.util.*;
public class SearchFor
{
	   public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number for the size of the array");
			int n = in.nextInt();
			int[] f = new int [n];
			 for (int i=0 ; i < n ; i++)
			{
				System.out.print("Enter number for array: ");
					f[i] = in.nextInt();
			}
				 
		 System.out.println("Enter number to be searched");
		 int a = in.nextInt();
		 
			System.out.print(isinFor(f,a));
			System.out.print(isinRec(f,n-1,a));
		}
   public static boolean isinFor(int[] f, int a) 
	 {
      for (int i = 0; i < f.length; i++ ) 
			{
         if (a == f[i])
					 {
            return true;
         }
      }
      return false;
    }
		public static boolean isinRec(int [] f, int n, int a)
		{
			if (n == 0 )
			{
				return false;
			}
			
			else if(f[n - 1] == a)
			{
				return true;
			}
			else
			{
				return isinRec(f , n-1, a);
			}
		}	
	
		
}