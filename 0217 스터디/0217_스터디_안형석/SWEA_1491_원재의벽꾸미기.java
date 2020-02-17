package study;

import java.util.Scanner;

public class SWEA_1491_원재의벽꾸미기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			long ans = Integer.MAX_VALUE;

//			System.out.println(A + " " + B);

			for (int j = 1; j <= N / 2; j++) {// r  =>   N/2 이후부터는 반복

				long r = j;

				for (int k = j; k <= N; k++) {//c
					long c = k;
					if (r * c > N) {//최대 N개의 타일을 사용할 수 있기때문에 r*c가 N을 넘으면 안됨.
						break;

					} else
						ans = Math.min(ans, (A * Math.abs(r - c) + (B * (N - r * c))));//Math.min =>집합 중 최솟값을 리턴해줌.
				}

			}

			System.out.println("#" + (i + 1) + " " + ans);
		} // end of tc
	}// end of main

}// end of class
