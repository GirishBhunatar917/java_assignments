package assignment;

import java.util.Scanner;

public class pattern_7 {

	public static void main(String[] args) {
		
          int i,j,num,n=1;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter number");
		num=obj.nextInt();
		
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
		


	}

}
