package baekjoon;

import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		for(int i=N-1;i>=0;i--)
		{
			
			for(int j=i+2;j<=N;j++)
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
