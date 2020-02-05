package self;

import java.util.Scanner;

public class SWEA_D1_2029 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tc=sc.nextInt();
		
		for (int i = 0; i <tc; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			System.out.println("#"+(i+1)+" "+a/b+" "+a%b);
			
		}
	}

}
