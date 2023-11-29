package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11659 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader =
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
		
	
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int m = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[n+1];
		S[0] = 0;
		stringTokenizer =
				new StringTokenizer(bufferedReader.readLine());
				
		for (int i = 1; i <= n; i ++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int q = 0; q < m; q++) {
			stringTokenizer =
					new StringTokenizer(bufferedReader.readLine());
			
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			
			System.out.println(S[j] - S[i-1]);
			
			
		}
		
	}

}
