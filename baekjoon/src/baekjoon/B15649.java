package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {

	public static int N,M;
	public static int [] arr;
	public static boolean[] visit;
	public static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* 내풀이
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.println(i+" "+j);
			}
		}
		*/
		
		//https://infodon.tistory.com/55 참고
		//너무 어려워서 풀다가 포기하고 설명이 잘된 정리글을 찾다가 찾은 tistory입니다.
		//진행과정을 세분화해서 설명해주는 블로그라 조금은? 더 이해할 수 있던 것 같아 주소 남깁니다
		
		//진행과정을 하나씩 코드로 써가면서 이해하니까 조금 더 수월했어요! 말로는 설명하기 힘들듯;;
		
		//https://st-lab.tistory.com/114 이 블로그와 병합해서 풀었으니 위 url에서 개념 잡고 섞어서 풀어보면 좋을듯 싶습니다
		//이 블로그의 boolean 배열 visit 사용법을 이해하시면 좋을 것 같습니다
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new int[M]; //순열개수
		visit=new boolean[N]; //범위
		
		/// 정적변수를 쓰면 되기 때문에 굳이 N과 M을 넘겨줄 필요 없다.
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		
		//재귀 길이가 M과 같아지면 탐색과정에서 담았던 배열 출력
		if(depth==M)
		{
			for(int t:arr)
			{
				sb.append(t).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0;i<N;i++)
		{
			//만약 노드 값을 방문하지 않았다면?
			if(!visit[i])
			{
				visit[i]=true;//해당 노드를 방문상태로 변경
				arr[depth]=i+1;//해당 깊이를 index로 하여 i+1값을 배열에 저장
				dfs(depth+1);//다음 자식 노드 방문을 위해 재귀식으로 depth를 1증가
				visit[i]=false;//자식노드 방문이 끝나고 되돌아올 경우 방문으로 바꾼 노드를 다시 방문 안한 노드로 변경
			}
		}
	}

}
