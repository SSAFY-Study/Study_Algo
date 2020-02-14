package today;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * 삼성 기출 문제 시뮬레이션
 *
 */
public class SWEA_17135_캐슬디펜스 {

	private static int N;
	private static int M;
	private static int D;
	private static int num;// 적군의 총 인원
	private static int[][] map;
	private static int[][] copyMap;
	private static int maxCnt;
	private static TreeSet<int[]> set = new TreeSet<int[]>(new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {// 외부 비교기
			if (o1[0] == o2[0] && o1[1] == o2[1]) {
				return 0;// 같은 경우
			} else {
				return 1;// 다른 경우
			}
		}
	});

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());// 행의 개수N 3~15
		M = Integer.parseInt(st.nextToken());// 열의 개수M
		D = Integer.parseInt(st.nextToken());// 궁수의 공격거리 제한 D 1~10

		map = new int[N + 1][M];// 성의 행1줄을 더 만듦.
		copyMap = new int[N + 1][M];// 복사본
		// 데이터 입력 받기
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0, index = 0; j < M; j++, index += 2) {
				map[i][j] = str.charAt(index) - '0';
				if (map[i][j] == 1)
					num++;// 적의 총 인원
			}
		}

		// 궁수 위치를 조합으로 생성
		int[] comb = new int[3];// 궁수의 조합 위치를 담을 배열
		for (comb[0] = 0; comb[0] < M - 2; comb[0]++) {
			for (comb[1] = comb[0] + 1; comb[1] < M - 1; comb[1]++) {
				for (comb[2] = comb[1] + 1; comb[2] < M; comb[2]++) {
					// System.out.println(Arrays.toString(comb));
					int cnt = go(comb);// 시뮬 고고!

					if (maxCnt < cnt)
						maxCnt = cnt;// 최대값을 갱신
				}
			}

		}
		System.out.println(maxCnt);
	}// end of main

	/** comb 궁수위치, 제거한 적의 인원을 리턴 */
	private static int go(int[] comb) {

		int copyNum = num;// 적의 인원 복사
		// 맵 복사
		for (int i = 0; i < map.length; i++) {// 맵 복사
			copyMap[i] = map[i].clone();// 한 행씩 복사
			// 1차원 배열만 clone 가능 , 2차원은 불가.
		}

//		copyMap = new int[N + 1][M];// 복사본
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				copyMap[i][j]=map[i][j];
//				
//				
//			}
//		}
		int cnt = 0;// 제거한 궁수 셈

		while (copyNum > 0) {// 적이 남아있으면
			for (int i = 0; i < comb.length; i++) {// 궁수가 차례로 쏘기
				ex: for (int j = 1; j <= D; j++) {// 공격 거리
					int nr = N - 1;
					int nc = comb[i] - j + 1;

					for (int k = 0; k < j; k++) {// 우상 대각선 오르막
						if (0 <= nr && nr < N && 0 <= nc && nc < M && copyMap[nr][nc] == 1) {
							set.add(new int[] { nr, nc });// 적의 죽은 위치를 저장
							break ex;

						}
						nr--;
						nc++;
					}
					nr += 2;
					for (int k = 0; k < j - 1; k++) {// 우하 대각선 내리막
						if (0 <= nr && nr < N && 0 <= nc && nc < M && copyMap[nr][nc] == 1) {
							set.add(new int[] { nr, nc });// 적의 죽은 위치를 저장
							break ex;

						}
						nr++;
						nc++;
					}
				}
			} // 궁수 for
			for (int[] v : set) {// 중복이 제거되었음
				int row = v[0];
				int col = v[1];
				copyMap[row][col] = 0;// 맵에서 적군 삭제
				cnt++;// 제거한 적 인원
				copyNum--;// 적의 총 인원 감소
			}
			set.clear();// 초기화
			copyNum -= down();// 지도 한칸씩 내리기

		}

		return cnt;
		// TODO Auto-generated method stub

	}

	/** 맵을 한칸씩 내림, 맵 밖으로 나간 적은 제거하고 제거된 인원을 리턴 */
	public static int down() {
		// TODO Auto-generated method stub
		int cnt = 0;// 맵 밖으로 나간 적 인원

		for (int c = 0; c < M; c++) {
			if (copyMap[N - 1][c] == 1) {
				cnt++;
				copyMap[N - 1][c] = 0;
			}

		}

		int[] temp = copyMap[N - 1];
		for (int r = N - 1; r > 0; r--) {
			copyMap[r] = copyMap[r - 1];

		}

		copyMap[0] = temp;
		return cnt;

	}

}// end of class
