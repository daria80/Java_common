package section_19;

import java.util.Scanner;

public class Exer_19_11 {

    public static Scanner in = new Scanner(System.in);

    private static void fill(int[] m, int down, int up) {

        for (int i = 0; i < m.length; i++) {

            do {
                m[i] = 3 * (down + (int) ((up + 1 - down) * Math.random())) + 1;
            } while (!hasAllDigitsSame(m[i]));
        }
    }

    private static void write(int[] m) {

        for (int i = 0; i < m.length; i++) System.out.println(m[i] + " ");
    }

    public static boolean hasAllDigitsSame (int i)
    {
        int a = i ;
        int m = a % 10 ;
        int mm = m ;
        while(a > 0)
        {
            m = a % 10;
            if (m != mm)
                return false ;
            a /= 10 ;
        }
        return true ;
    }

    public static void main(String[] args) {

        int down = 3, up = 32, n;
        n = in.nextInt();
        int[] m = new int[n];
        fill(m, down, up);
        write(m);
    }

}