package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
	
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		int temp;
		while(queue.size() != 1) {
			queue.poll();
			int behind = queue.poll();
			queue.add(behind);
		}
		System.out.println(queue.peek());
	}

}
