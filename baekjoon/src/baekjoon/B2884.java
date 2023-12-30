package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2884 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int arr[]=new int[2];
		int h=0;
		int m=0;
		
		for(int i=0;i<2;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			h=arr[0];
			m=arr[1];
		}
		
		if(h!=0 && m<45)
			System.out.println(h-1+" "+(60-45+m));
		else if(h==0 && m<45)
			System.out.println(23+" "+(60-45+m));
		else if(m>=45)
			System.out.println(h+" "+(m-45));
		
	}

}
