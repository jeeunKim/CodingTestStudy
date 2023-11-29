package datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class baekjoon1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int num = 1;
		boolean r = true;
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(arr[i] >= num) {
				while(arr[i] >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int p = stack.pop();
				if (p > arr[i]) {
					r = false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
			
		}
		if(r) {
			System.out.println(sb.toString());
		} else {
			System.out.println("NO");
		}
		
	}

}
