package sorting;

import java.util.Scanner;

public class baekjoon1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String[] sarr = n.split("");
		int[] arr = new int[sarr.length];
		
		for(int i = 0; i< arr.length;i++) {
			arr[i] = Integer.parseInt(sarr[i]);
		}
		
				
		for(int j =0; j<arr.length; j++) {
			int max =j;
			for(int i = j; i<arr.length;i++) {
				if(arr[max] <= arr[i]) {
					max = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[max];
			arr[max] = temp;
		}
			
		for(int a : arr) {
			System.out.print(a);
		}
		
	}

}
