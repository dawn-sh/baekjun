package baekjoon;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int m=sc.nextInt();
		int set_m=sc.nextInt();
		int totalm=m+set_m;
		int totalh=totalm/60;
		
		if((h+totalh)<24)
			System.out.println((h+totalh)+" "+((totalm)-(totalh*60)));
		if((h+totalh)==24)
			System.out.println(0+" "+((totalm)-(totalh*60)));
		if((h+totalh)>24)
		{
			System.out.println(((h+totalh)%24)+" "+((totalm)-(totalh*60)));
		}
		
	}

}
