package baekjoon;

import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int i;
		int x;
		int arr[]=new int[10];
		int divi=42;
		int cnt=1;
		
		
		for(i=0;i<10;i++)
		{
			x=sc.nextInt();
			
			
			arr[i]=x;
		}
		
		for (i=0;i<10;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i] % divi)!=(arr[j] % divi))
				{
					cnt++;
					break;
				}
				if((arr[i] % divi) == (arr[j] % divi))
				{
					continue;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
