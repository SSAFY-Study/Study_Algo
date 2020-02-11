package February;
import java.util.Scanner;

 

public class Solution_SWEA_1233_사칙연산유효성검사_김세은{

 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

 

		for (int tc = 1; tc < 11; tc++) {

			

			boolean check = false;

			int size = sc.nextInt();

			sc.next();

			

			for (int i = 0; i < size; i++) {

			

				String[] str = sc.nextLine().split(" ");

 

				if (i < size / 2) {

					

					if (str[1].equals("+") || str[1].equals("-") || str[1].equals("*") || str[1].equals("/")) {

						check = true;

					} else {

						check = false;

					}

					

				} else {

					

					if (str[1].equals("+") || str[1].equals("-") || str[1].equals("*") || str[1].equals("/")) {

						check = false;

					}

				}

			}

 

			if (check == false) {

				System.out.println("#" + tc + " " + " " + 0);

			} else

				System.out.println("#" + tc + " " + " " + 1);

		}

 

	}

}