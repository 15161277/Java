import java.util.*;
public class RemoveDup
{
	

public static void main(String[] args) 
	{
		testRemoveDuplicates();	
	}
	// this method is asking to give the size of array and the elements of it
	public static void testRemoveDuplicates()
		{
			System.out.println("Enter a number for the size of the array");
			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int[] myArray = new int [length];
		
			System.out.println("Enter numbers to enter into the array");
		
			for (int i=0 ; i < length ; i++)
			{
				System.out.println("Enter number for array");
				myArray[i] = sc.nextInt();
			}
			boolean found = false; 
			hasDuplicates(myArray);
			int [] listB  = removeDuplicates(myArray);
			// display the elements 
			for(int i = 0 ; i < listB.length; i++)
				System.out.println(listB[i]);
		}
	// this metod is just checking if there is a duplicates
	public static boolean hasDuplicates(int [] listA )
		{
			boolean hasDuplicates = false;
			for (int counter = 0; counter < listA.length - 1; counter++)
			{
				for(int counter2 = counter + 1;counter2 < listA.length;counter2++)
				{
					if(listA[counter] == listA[counter2])
						hasDuplicates = true;
				}
			}	
			return hasDuplicates;
			
		}
	public static int[] removeDuplicates(int [] arr)
		{
			int end = arr.length;
	
			for (int i = 0; i < end; i++) {
				for (int j = i + 1; j < end; j++) {
					if (arr[i] == arr[j]) {                  
						arr[j] = arr[end-1];
							end--;
								j--;
						}
					}
				}

				int[] whitelist = new int[end];
			System.out.println("The array with duplicates removed is:");
			System.arraycopy(arr, 0, whitelist,0,end);
				return whitelist;
 
		}
}