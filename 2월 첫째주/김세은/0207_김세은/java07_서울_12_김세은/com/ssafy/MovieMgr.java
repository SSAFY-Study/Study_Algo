package com.ssafy;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index;
	private static MovieMgr instance;

	private MovieMgr() {

	}

	public static MovieMgr getInstance() {
		if (instance == null) {
			instance = new MovieMgr();
		}
		return instance;
	}

	/** 파라메터로 전달된 영화 정보를 전달받아 배열에 저장한다. */
	public void add(Movie m) {

		movies[index++] = m;
	}

	/** 배열에 저장된 모든 영화정보를 리턴한다. */
	public Movie[] search() {

		for (int i = 0; i < index; i++) {
			if (movies[i] == null)
				continue;
			System.out.println(movies[i].toString());
		}
		return movies;

	}

	/** 파라메터로 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴한다 */
	public Movie[] search(String title) {
		for (int i = 0; i < index; i++) {

			if (movies[i].getTitle().equals(title))
				System.out.println(movies[i].toString());
		}
		return null;
	}

	/** 파라메터로 전달된 감독명의 모든 영화 정보를 검색하여 리턴한다 */
	public Movie[] searchDirector(String name) {
		Movie[] temp = new Movie[100];
		for (int i = 0; i < index; i++) {

			if (movies[i].getDirector().equals(name))
				System.out.println(movies[i].toString());
		}
		return null;
	}

	/** 파라메터로 전달된 장르의 모든 영화 정보를 검색하여 리턴한다 */
	public Movie[] searchGenre(String genre) {
		for (int i = 0; i < index; i++) {

			if (movies[i].getGenre().equals(genre))
				System.out.println(movies[i].toString());
		}
		return null;
	}

	/** 파라메터로 전달된 제목의 영화를 삭제한다. */
	public void delete(String title) {
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().equals(title))
				movies[i] = null;

		}

		for (int j = 0; j < index; j++) {
			if (movies[j] == null)
				continue;
			System.out.println(movies[j].toString());
		}
	}

	/** 저장된 영화 정보의 갯수를 리턴한다. */
	public int getSize() {

		int cnt = 0;

		for (int i = 0; i < index; i++) {
			if (movies[i] != null)
				++cnt;

		}
		return cnt;
	}
}
