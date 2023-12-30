package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int arr[]=new int[2];
		int a=0;
		int b=0;
		
		for(int i=0;i<2;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			a=arr[0];
			b=arr[1];
		}
		
		if(a==b)
			System.out.println("==");
		else if(a>b)
			System.out.println(">");
		else
			System.out.println("<");
	}
}
