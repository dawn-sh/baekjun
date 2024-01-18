package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2579 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//https://girawhale.tistory.com/3 참고

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total=Integer.parseInt(br.readLine());
		int score[]=new int[301]; 
		//계단수 추가
		int stair[]=new int[301];
		
		
		for(int i=1;i<=total;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			//점수 따로 선언 안하고 바로 입력으로 변환
			stair[i]=Integer.parseInt(st.nextToken());
		}
		
		//점수 합과 각 계단의 점수를 따로 배열에 저장
		score[1]=stair[1];
		score[2]=stair[1]+stair[2];
		score[3]=Math.max(stair[1], stair[2])+stair[3];

		for(int i=4;i<=total;i++)
		{
			score[i]=Math.max(score[i-3] + stair[i-1], score[i-2])+stair[i];
		}
			
		bw.write(Integer.toString(score[total]));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
