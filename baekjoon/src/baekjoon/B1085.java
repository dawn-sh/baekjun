package baekjoon;

import java.util.Scanner;

public class B1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		
		if(x==y && w==h)
		{
			if(x<w)
				System.out.println(x);
			else
				System.out.println(w);
		}
		else if(x < w-x && x < y && x < h-y)
			System.out.println(x);
		else if(y < w-x && y < x && y < h-y)
			System.out.println(y);
		else if(h-y < x && h-y < y && h-y < w-x)
			System.out.println(h-y);
		else if(w-x < x && w-x < y && w-x < h-y)
			System.out.println(w-x);
	}
}
