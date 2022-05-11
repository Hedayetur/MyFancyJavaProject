import java.util.Scanner;

public class xPart {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Len, i, S = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Len = sc.nextInt();	
		
		int [] a = new int[Len];
		
		System.out.print(" Please Enter " + Len + " elements of an Array  : ");
		for (i = 0; i < Len; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Len; i++)
		{
			S = S + a[i]; 
		}		
		System.out.println("\n The S of All Elements in this Array = " + S);
	}
}