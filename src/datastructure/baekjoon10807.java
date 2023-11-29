package datastructure;

import java.util.Scanner;

public class baekjoon10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int fNum;
		int count = 0;
		sc.nextLine();
		String sNum = sc.nextLine();
		String[] num = sNum.split(" ");
		
		fNum = sc.nextInt();
		
		for(int i = 0; i < num.length; i++) {
			if(num[i].equals(Integer.toString(fNum))) {
				count+=1;
			}
		}
		System.out.println(count);
		
		
	}

}
