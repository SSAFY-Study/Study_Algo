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
 * �Ｚ ���� ���� �ùķ��̼�
 *
 */
public class SWEA_17135_ĳ�����潺 {

	private static int N;
	private static int M;
	private static int D;
	private static int num;// ������ �� �ο�
	private static int[][] map;
	private static int[][] copyMap;
	private static int maxCnt;
	private static TreeSet<int[]> set = new TreeSet<int[]>(new Comparator<int[]>() {
		public int compare(int[] o1, int[] o2) {// �ܺ� �񱳱�
			if (o1[0] == o2[0] && o1[1] == o2[1]) {
				return 0;// ���� ���
			} else {
				return 1;// �ٸ� ���
			}
		}
	});

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());// ���� ����N 3~15
		M = Integer.parseInt(st.nextToken());// ���� ����M
		D = Integer.parseInt(st.nextToken());// �ü��� ���ݰŸ� ���� D 1~10

		map = new int[N + 1][M];// ���� ��1���� �� ����.
		copyMap = new int[N + 1][M];// ���纻
		// ������ �Է� �ޱ�
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0, index = 0; j < M; j++, index += 2) {
				map[i][j] = str.charAt(index) - '0';
				if (map[i][j] == 1)
					num++;// ���� �� �ο�
			}
		}

		// �ü� ��ġ�� �������� ����
		int[] comb = new int[3];// �ü��� ���� ��ġ�� ���� �迭
		for (comb[0] = 0; comb[0] < M - 2; comb[0]++) {
			for (comb[1] = comb[0] + 1; comb[1] < M - 1; comb[1]++) {
				for (comb[2] = comb[1] + 1; comb[2] < M; comb[2]++) {
					// System.out.println(Arrays.toString(comb));
					int cnt = go(comb);// �ù� ���!

					if (maxCnt < cnt)
						maxCnt = cnt;// �ִ밪�� ����
				}
			}

		}
		System.out.println(maxCnt);
	}// end of main

	/** comb �ü���ġ, ������ ���� �ο��� ���� */
	private static int go(int[] comb) {

		int copyNum = num;// ���� �ο� ����
		// �� ����
		for (int i = 0; i < map.length; i++) {// �� ����
			copyMap[i] = map[i].clone();// �� �྿ ����
			// 1���� �迭�� clone ���� , 2������ �Ұ�.
		}

//		copyMap = new int[N + 1][M];// ���纻
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				copyMap[i][j]=map[i][j];
//				
//				
//			}
//		}
		int cnt = 0;// ������ �ü� ��

		while (copyNum > 0) {// ���� ����������
			for (int i = 0; i < comb.length; i++) {// �ü��� ���ʷ� ���
				ex: for (int j = 1; j <= D; j++) {// ���� �Ÿ�
					int nr = N - 1;
					int nc = comb[i] - j + 1;

					for (int k = 0; k < j; k++) {// ��� �밢�� ������
						if (0 <= nr && nr < N && 0 <= nc && nc < M && copyMap[nr][nc] == 1) {
							set.add(new int[] { nr, nc });// ���� ���� ��ġ�� ����
							break ex;

						}
						nr--;
						nc++;
					}
					nr += 2;
					for (int k = 0; k < j - 1; k++) {// ���� �밢�� ������
						if (0 <= nr && nr < N && 0 <= nc && nc < M && copyMap[nr][nc] == 1) {
							set.add(new int[] { nr, nc });// ���� ���� ��ġ�� ����
							break ex;

						}
						nr++;
						nc++;
					}
				}
			} // �ü� for
			for (int[] v : set) {// �ߺ��� ���ŵǾ���
				int row = v[0];
				int col = v[1];
				copyMap[row][col] = 0;// �ʿ��� ���� ����
				cnt++;// ������ �� �ο�
				copyNum--;// ���� �� �ο� ����
			}
			set.clear();// �ʱ�ȭ
			copyNum -= down();// ���� ��ĭ�� ������

		}

		return cnt;
		// TODO Auto-generated method stub

	}

	/** ���� ��ĭ�� ����, �� ������ ���� ���� �����ϰ� ���ŵ� �ο��� ���� */
	public static int down() {
		// TODO Auto-generated method stub
		int cnt = 0;// �� ������ ���� �� �ο�

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
