package self;

import java.util.Scanner;



public class BOJ_2941_ũ�ξ�Ƽ�ƾ��ĺ� {//����, ����2941, ũ�ξ�Ƽ�ƾ��ĺ�

	static String[] crAlphas = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

 

		Scanner sc = new Scanner(System.in);

 

		String str = sc.next();

 

		int cnt = 0;

		// �Է� Ȯ��

		//System.out.println(str);

		for (int d = 0; d < str.length(); d++) {

			for (int ca = 0; ca < crAlphas.length; ca++) {

				if (str.substring(d).startsWith(crAlphas[ca])) {

					d += crAlphas[ca].length() - 1;

					break;

 

				}

			}

			cnt++;

		}

	System.out.println(cnt);

	}

 

}