package study;

import java.util.Scanner;



public class Jungol_1011_소수369 {

	public static void main(String[] args) {

 

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();// 학생 수

		int M = sc.nextInt();// 끝 숫자

		int K = sc.nextInt();// 박수 몇번 쳤는 지 알고 싶은 사람.

 

		int stu[] = new int[N];// 박수 횟수 배열

		int count = 0;// 학생 번호

		

		

 

		for (int i = 1; i <= M; i++) {// 숫자

			int cnt = 0;// 소수 인지 확인 cnt=2가 소수

 

 

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