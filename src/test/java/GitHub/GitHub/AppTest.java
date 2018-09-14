package GitHub.GitHub;

import java.util.Scanner;

public class AppTest 
{


	public static void main(String[] args)
	{

		
		int i=1;
		int j;
		while(i<=5)
		{
			j=1;
			while(j++<=5-i)

			{
				System.out.print(" ");

			}
			j=1;
			while(j++<=i*2-1)

			{
				System.out.print("*");

			}

			System.out.println();
			i++;
		}   
		i=5-1;
		while(i>0)
		{
			j=1;
			while(j++<=5-i)

			{
				System.out.print(" ");

			}                      
			j=1;
			while(j++<=i*2-1)

			{
				System.out.print("*");

			}

			System.out.println();
			i--;
		}             


			}
}