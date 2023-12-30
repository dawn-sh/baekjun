package baekjoon;

import java.util.Scanner;

public class B25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int N=sc.nextInt();
		int price=0;
		int cnt=0;
		int total=0;
		
		for(int i=0;i<N;i++)
		{
			price=sc.nextInt();
			cnt=sc.nextInt();
			total+=price*cnt;
		}
		
		if(X==total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
