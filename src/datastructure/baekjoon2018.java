package datastructure;

import java.util.Scanner;


public class baekjoon2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int startIdx =1, endIdx=1, sum=1, count =1;
		
		while(endIdx != num) {
			if (sum > num) {
				sum -= startIdx;
				startIdx++;
			}
			else if (sum < num) {
				endIdx++;
				sum+=endIdx;
			}
			else {
				count++;
				endIdx++;
				sum += endIdx;
			}
		}
		
		System.out.println(count);
	}

}
