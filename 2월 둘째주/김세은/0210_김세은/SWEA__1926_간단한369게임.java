package self;

import java.util.Scanner;

public class SWEA__1926_간단한369게임 {//SWEA,문제 1926, 간단한 369게임
  
    public static void main(String[] args) {
        // TODO Auto-generated method stub
  
        Scanner sc = new Scanner(System.in);
  
        int x = sc.nextInt();
  
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.print("-" + " ");
                ++i;
            }
            System.out.print(i + " ");
        }
        for (int i = 11; i <= 100; i++) {
            if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9)&&(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
               System.out.print("--" + " ");
//                if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
//                    System.out.print("--" + " ");
//             
//                }
            } else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print("-" + " ");
          
            } else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.print("-" + " ");
            } else
  
                System.out.print(i + " ");
        }
  
    }
  
}