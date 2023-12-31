package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T=Integer.parseInt(br.readLine());
		int A=0;
		int B=0;
		int total[]=new int[T];
		
		for(int i=0;i<T;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			A=Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			
			total[i]+=A+B;
			
			bw.write("Case #"+(i+1)+": "+Integer.toString(total[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
