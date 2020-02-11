package self;

import java.util.Scanner;

public class BOJ_2991_사나운개 {//백준 2991 사나운개
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Dog = new int[4];
		int[] Man = new int[3];
		int swp, x, jud;
		for (int i = 0; i < 4; i++) {
			Dog[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			Man[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			x = Man[i];
			jud = 0;
			swp = 0;
			while (true) {
				if (swp == 0) {
					x -= Dog[0];
					if (x <= 0) {
						jud++;
						break;
					}
					swp = 1;
				}
				if (swp == 1) {
					x -= Dog[1];
					if (x <= 0)
						break;
					swp = 0;
				}
			}
			x = Man[i];
			swp = 0;
			while (true) {
				if (swp == 0) {
					x -= Dog[2];
					if (x <= 0) {
						jud++;
						break;
					}
					swp = 1;
				}
				if (swp == 1) {
					x -= Dog[3];
					if (x <= 0)
						break;
					swp = 0;
				}
			}
			System.out.println(jud);
		}
	}
}