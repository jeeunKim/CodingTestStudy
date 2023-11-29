package datastructure;

import java.util.Scanner;

public class baekjoon1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] score = new double[N];
		
		for (int i = 0; i <N;i++) {
			score[i] = sc.nextInt();
		}
		
		double max = 0;
		double sum = 0.0;
		
		for (int i = 0; i < N;i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}

		for (int i = 0; i < N;i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
		}
		
		System.out.println(sum / N);
	}

}
