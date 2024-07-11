import java.util.*;

class sample
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		int i,j,n;

		System.out.println("enter the number:");

		n = sc.nextInt();

		for(i=0; i<n; i++)
		
		{
		
			for(j=i; j<n; j++)

			{

				System.out.print("*");

			}

		System.out.println("");

		}

	}

}