package study;

import java.util.Scanner;

public class SWEA_1491_�����Ǻ��ٹ̱� {

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

			for (int j = 1; j <= N / 2; j++) {// r  =>   N/2 ���ĺ��ʹ� �ݺ�

				long r = j;

				for (int k = j; k <= N; k++) {//c
					long c = k;
					if (r * c > N) {//�ִ� N���� Ÿ���� ����� �� �ֱ⶧���� r*c�� N�� ������ �ȵ�.
						break;

					} else
						ans = Math.min(ans, (A * Math.abs(r - c) + (B * (N - r * c))));//Math.min =>���� �� �ּڰ��� ��������.
				}

			}

			System.out.println("#" + (i + 1) + " " + ans);
		} // end of tc
	}// end of main

}// end of class
