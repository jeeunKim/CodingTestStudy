package sorting;

import java.util.Scanner;

public class baekjoon2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean swapCheck = true;
		for(int j = 0; j< n; j++) {
			if(!swapCheck) {
				break;
			}
			swapCheck = false;
			for(int i=0; i< n; i++) {
				if(i+1 == n) {
					break;
				}
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					swapCheck = true;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
