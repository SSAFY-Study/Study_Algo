package com.ssafy;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieMgr mm = MovieMgr.getInstance();
		Scanner sc = new Scanner(System.in);

		// sc.nextLine();
		while (true) {
			int a = sc.nextInt();
			if (a == 1) {

				System.out.print("���� �Է�");
				String title = sc.next();
				System.out.print("���� �Է�");
				String director = sc.next();
				System.out.print("��� �Է�");
				int grade = sc.nextInt();

				System.out.print("�帣 �Է�");
				String genre = sc.next();
				System.out.print("�ٰŸ� �Է�");
				String summary = sc.next();

				mm.add(new Movie(title, director, grade, genre, summary));
			} else if (a == 2) {
				System.out.println("**************��ü ��ȭ ����**************");
				mm.search();
			} else if (a == 3) {
				System.out.println("�˻��� ��ȭ ������ �Է��ϼ���.");
				String title = sc.next();
				mm.search(title);
			} else if (a == 4) {
				System.out.println("�˻��� �帣�� �Է��ϼ���.");
				String genre = sc.next();
				mm.searchGenre(genre);

			} else if (a == 5) {
				System.out.println("������ ��ȭ ������ �Է��ϼ���.");
				String title = sc.next();
				mm.delete(title);
				
				
			} else if (a == 0) {
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				break;
			}
				

		}

	}
}