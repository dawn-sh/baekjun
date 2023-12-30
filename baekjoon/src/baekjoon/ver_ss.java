package baekjoon;

import java.util.Scanner;

public class ver_ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i,j;
		int cnt=0;
		for(i=0;i<n;i++)
		{	
			int num=sc.nextInt();
			if(num==1) {
				continue;
			}
			if(num==2) {
				cnt++;
				continue;
			}
			for(j=2;j<num;j++) {
				if(num%j==0) {
					break;
				}
			}
			if(num==j) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
