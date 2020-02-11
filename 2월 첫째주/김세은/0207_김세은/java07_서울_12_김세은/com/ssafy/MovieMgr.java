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

	/** �Ķ���ͷ� ���޵� ��ȭ ������ ���޹޾� �迭�� �����Ѵ�. */
	public void add(Movie m) {

		movies[index++] = m;
	}

	/** �迭�� ����� ��� ��ȭ������ �����Ѵ�. */
	public Movie[] search() {

		for (int i = 0; i < index; i++) {
			if (movies[i] == null)
				continue;
			System.out.println(movies[i].toString());
		}
		return movies;

	}

	/** �Ķ���ͷ� ���޵� Ÿ��Ʋ�� �����ϰ� �ִ� ��� ��ȭ ������ �˻��Ͽ� �����Ѵ� */
	public Movie[] search(String title) {
		for (int i = 0; i < index; i++) {

			if (movies[i].getTitle().equals(title))
				System.out.println(movies[i].toString());
		}
		return null;
	}

	/** �Ķ���ͷ� ���޵� �������� ��� ��ȭ ������ �˻��Ͽ� �����Ѵ� */
	public Movie[] searchDirector(String name) {
		Movie[] temp = new Movie[100];
		for (int i = 0; i < index; i++) {

			if (movies[i].getDirector().equals(name))
				System.out.println(movies[i].toString());
		}
		return null;
	}

	/** �Ķ���ͷ� ���޵� �帣�� ��� ��ȭ ������ �˻��Ͽ� �����Ѵ� */
	public Movie[] searchGenre(String genre) {
		for (int i = 0; i < index; i++) {

			if (movies[i].getGenre().equals(genre))
				System.out.println(movies[i].toString());
		}
		return null;
	}

	/** �Ķ���ͷ� ���޵� ������ ��ȭ�� �����Ѵ�. */
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

	/** ����� ��ȭ ������ ������ �����Ѵ�. */
	public int getSize() {

		int cnt = 0;

		for (int i = 0; i < index; i++) {
			if (movies[i] != null)
				++cnt;

		}
		return cnt;
	}
}
