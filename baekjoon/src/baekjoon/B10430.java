package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int arr [] = new int[3];
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i=0;i<3;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			a=arr[0];
			b=arr[1];
			c=arr[2];
		}
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}

}
