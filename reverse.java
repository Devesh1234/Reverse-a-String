 //java program is to reverse a string and find number of spaces in string

import java.util.Scanner;
public class reverse
{
	public static void main(String[] args) {
		
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter the String you want to reverse");
			String str = obj.nextLine();

			String newstr =""; // store reverse string
			int c=0; //store the number of spaces in string
			int n=str.length();//length of original string


			// reverse a string
			for(int i=0;i<n;i++)
			{
				char ch=str.charAt(n-i-1);

				newstr=newstr+ch;
			}


			// number of spaces in string
			for(int i=0;i<n;i++)
			{
				if(str.charAt(i)==' ')
				{
					c=c+1;
				}

			}

			System.out.println("The reverse String is : ");
			System.out.println(newstr);

			System.out.println("The Number of spaces in original string is :");
			System.out.println(c);



			


	 }



	
}