package study;

import java.util.Scanner;



public class Jungol_1011_�Ҽ�369 {

	public static void main(String[] args) {

 

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// �л� ��

		int M = sc.nextInt();// �� ����

		int K = sc.nextInt();// �ڼ� ��� �ƴ� �� �˰� ���� ���.

 

		int stu[] = new int[N];// �ڼ� Ƚ�� �迭

		int count = 0;// �л� ��ȣ

		

		

 

		for (int i = 1; i <= M; i++) {// ����

			int cnt = 0;// �Ҽ� ���� Ȯ�� cnt=2�� �Ҽ�

 

 

			for (int j = 1; j <= i; j++) {

				if ((i % j) == 0) {

					++cnt;

				}

				if(cnt>2)

					break;

 

			}

 

			if (cnt == 2) {

				++stu[count];

			}

			++count;

			

 

			if (count == (N))

				count = 0;

		}

 

		System.out.println(stu[K]);

	}

 

}