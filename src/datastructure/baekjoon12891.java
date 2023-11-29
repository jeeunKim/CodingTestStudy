package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon12891 {
	;
	static int checkarr[];
	static int nowarr[];
	static int check = 0;
 	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int P = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int count = 0;
		
		char dna[] = new char[S];
		dna = bf.readLine().toCharArray();
		checkarr = new int[4];
		nowarr = new int[4];
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < 4; i++) {
			checkarr[i] = Integer.parseInt(st.nextToken()); 
			nowarr[i] = 0;
			if(checkarr[i] == 0) {
				check++;
			}
		}
		
		for(int i = 0; i< P; i++) {
			Add(dna[i]);
			
		}
		if(check == 4) {
			count++;
		}
		for(int i = P; i<S; i++) {
			int j = i - P;
			Add(dna[i]);
			Remove(dna[j]);
			if(check == 4) count++;
		}
		
		
		System.out.println(count);
	}
	private static void Add(char i) {
		switch(i) {
		case 'A':
			nowarr[0]++;
			if(nowarr[0] == checkarr[0]) check++;
			break;
		case 'C':
			nowarr[1]++;
			if(nowarr[1] == checkarr[1]) check++;
			break;
		case 'G':
			nowarr[2]++;
			if(nowarr[2] == checkarr[2]) check++;
			break;
		case 'T':
			nowarr[3]++;
			if(nowarr[3] == checkarr[3]) check++;
			break;
		}
	}
	
	private static void Remove(char i) {

		
		switch(i) {
		case 'A':
			if(nowarr[0] == checkarr[0]) check--;
			nowarr[0]--;
			break;
		case 'C':
			if(nowarr[1] == checkarr[1]) check--;
			nowarr[1]--;
			break;
		case 'G':
			if(nowarr[2] == checkarr[2]) check--;
			nowarr[2]--;
			break;
		case 'T':
			if(nowarr[3] == checkarr[3]) check--;
			nowarr[3]--;
			break;
		}
	}

}
