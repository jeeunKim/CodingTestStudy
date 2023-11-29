package datastructure;

import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String sNum = sc.next();
		int sum = 0;
		char[] cNum = sNum.toCharArray();
		
		for (int i = 0; i <len;i++) {
			sum+= cNum[i] -'0';
		}
		System.out.println(sum);
	}

}
