package self;

import java.util.Scanner;

public class SWEA_1936_1대1가위바위보 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a==1&&b==3) {
			System.out.println("A");
		}else if(a==2&&b==1) {
			System.out.println("A");
		}else if(a==3&&b==2) {
			System.out.println("A");
		}else if(a==b) {
			System.out.println("비기는 경우는 없다.");
		}else
			System.out.println("B");
		
	
	}

}
