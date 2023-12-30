package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B10950 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int a=0;
		int b=0;
		
		
		for(int i=0;i<t;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a+b);
		}
		
		
		//예제 입력 하고 바로 엔터치면 에제 출력 가능 한 버전
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int arr []= new int [T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int result = A + B;
            arr[i]=result;
//            System.out.println(result);
        }
        
        for(int i=0; i<T; i++)
        {
        	System.out.println(arr[i]);
        }
        
        br.close();
	}

}
