package baekjoon;

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
