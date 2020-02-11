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

				System.out.print("제목 입력");
				String title = sc.next();
				System.out.print("감독 입력");
				String director = sc.next();
				System.out.print("등급 입력");
				int grade = sc.nextInt();

				System.out.print("장르 입력");
				String genre = sc.next();
				System.out.print("줄거리 입력");
				String summary = sc.next();

				mm.add(new Movie(title, director, grade, genre, summary));
			} else if (a == 2) {
				System.out.println("**************전체 영화 정보**************");
				mm.search();
			} else if (a == 3) {
				System.out.println("검색할 영화 제목을 입력하세요.");
				String title = sc.next();
				mm.search(title);
			} else if (a == 4) {
				System.out.println("검색할 장르를 입력하세요.");
				String genre = sc.next();
				mm.searchGenre(genre);

			} else if (a == 5) {
				System.out.println("삭제할 영화 제목을 입력하세요.");
				String title = sc.next();
				mm.delete(title);
				
				
			} else if (a == 0) {
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}
				

		}

	}
}