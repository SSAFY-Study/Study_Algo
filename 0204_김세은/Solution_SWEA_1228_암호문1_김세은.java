package today;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution_SWEA_1228_��ȣ��1_�輼�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int f = 0; f < 10; f++) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			int keynum = 0;
			keynum = sc.nextInt();// Ű ���� ����

			for (int j = 0; j < keynum; j++) {
				list.add(sc.nextInt());

			} // key �޾ƿ�

			int order = sc.nextInt();// ��ɾ� ����

			for (int j = 0; j < order; j++) {

				char a = sc.next().charAt(0);
				int k = sc.nextInt();// 1
				int q = sc.nextInt();// 5

				for (int i = k + 1; i <= k + q; i++) {
					int data = sc.nextInt();

					list.add(i - 1, data);
				}

			}
			System.out.print("#" + f+" " );
			for (int j = 0; j < 10; j++) {
				System.out.print( list.get(j) + " ");

			}
			System.out.println();
		}

	}

}
