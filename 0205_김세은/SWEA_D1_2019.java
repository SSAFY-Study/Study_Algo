package self;

import java.util.Scanner;

public class SWEA_D1_2019 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num= sc.nextInt();
		int mul=1;
		System.out.print(mul+" ");
		for (int i = 0; i < num; i++) {
			
			mul*=2;
			System.out.print(mul+" ");
		}
	
	}

}
