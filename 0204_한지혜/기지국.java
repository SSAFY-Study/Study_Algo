import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * IM 대비 보충반
 * IM난이도의 문제는 30분 정도 고민해보고 문제가 풀리지 않으면 정답보고 습득.
 * 
 * 변수의 이름에 의미부여!!
 * 단계별로 확인하고 가자
 *
 */
public class 기지국{
//	private static String src  = {
//			XXXXXXXXX
//			XXXHXXXXX
//			XXHAHXXHX
//			XXHHXXXXX
//			XXXXXXXXX
//			XXAHHXXXX
//			XXHXXHAHX
//			XXAHXXHXX
//			XXHXHXXXX
//	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 상하좌우의 값을 조회하기 위한 배열
		int[] row = {-1, 1, 0, 0,};
		int[] col = {0, 0, -1, 1,};
		//testcase 개수 
		int TC = sc.nextInt();
		//TC개수만큼 반복
		for (int testCase = 1; testCase <= TC; testCase++) {
			//배열의 크기
			int n = sc.nextInt();
			char[][] field = new char[n][n];//배열의 크기 +2 -> 가장자리 0으로 둘러쌈
			//입력된 값 field 배열에 넣음
			for (int i = 0; i < field.length; i++) {
				String str = sc.next();
				for (int j = 0; j < field.length; j++) {
					field[i] = str.toCharArray();
				}
			} 
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					char data = field[i][j];
					if(data == 'A') {
						check(field, n, i, j, 1);
					}
					else if(data == 'B') {
						check(field, n, i, j, 2);
					}
					else if(data == 'C') {
						check(field, n, i, j, 3);
					}
				}
			}
			for (int i = 0; i < field.length; i++) {
				System.out.println(Arrays.toString(field[i]));
			}
			int cnt = 0;
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					if(field[i][j] == 'H') cnt++;
				}
			}
			System.out.println("#" + testCase + " " + cnt);
		}
		
		
	}//end of main
	private static void check(char[][] map, int n, int r, int c, int l) {
		//북쪽으로 찾아보기
		for (int k = r-1, cnt = 0; k>=0 && cnt <1; k--,cnt++) {
			if(map[k][c] == 'H') {
				map[k][c] = 'X';
			}
		}
		//남쪽 찾아보기
		for (int k = r+1, cnt = 0; k<n && cnt <1; k++,cnt++) {
			if(map[k][c] == 'H') {
				map[k][c] = 'X';
			}
		}
		//동쪽 찾아보기
		for (int k = c+1, cnt = 0; k<n && cnt <1; k++,cnt++) {
			if(map[r][k] == 'H') {
				map[r][k] = 'X';
			}
		}
		//서쪽 찾아보기
		for (int k = c-1, cnt = 0; k>=0 && cnt <1; k--,cnt++) {
			if(map[r][k] == 'H') {
				map[r][k] = 'X';
			}
		}
	}
	
}//end of class
