package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
		int many = Integer.parseInt(st.nextToken());
		
		int min = 0;
		int max = many - 1;
		
		st = new StringTokenizer(bufferedReader.readLine());
		int need = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(bufferedReader.readLine());
	    int[] nums = new int[many];
	    
		for(int i = 0; i < many; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		
		while(min < max) {
			if((nums[min] + nums[max]) < need) {
				min++;
			} else if((nums[min] + nums[max]) > need){
				max--;
			}else {
				count++;
				max--;
			}
		}
		System.out.println(count);
		
		
	}
}
