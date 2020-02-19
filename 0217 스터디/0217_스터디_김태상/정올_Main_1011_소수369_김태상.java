package asd;

import java.util.Arrays;
import java.util.Scanner;

public class 정올_Main_1011_소수369_김태상 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] student = new int[N];
		int sNum=0;
		
		for (int i = 2; i <= M; i++) {
			if(sNum+1>N-1) {
				sNum=0;
			}else {
				sNum++;
			}
			if(i==M) {
				student[sNum]++;
				break;
				
			}
			

			int j;
			for (j = 2; j <(i/2+1); j++) {
				if(i%j==0) {
					break;
				}
			} 
			if(j==i/2+1) {
				student[sNum]++;
			}
	
		}
		
		System.out.println(student[K]);
		
		
		
		
	}//end of main
}//end of class
