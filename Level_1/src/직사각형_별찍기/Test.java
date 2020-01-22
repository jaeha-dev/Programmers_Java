package 직사각형_별찍기;

import java.util.Scanner;

/**
 * @title  : 직사각형 별찍기
 * @author : jaeha-dev (Git)
 */
public class Test {

    /**
     * 풀이
     * @param args : 입력 인자값
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}