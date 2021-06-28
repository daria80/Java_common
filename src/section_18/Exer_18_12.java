package section_18;

import java.util.Scanner;

public class Exer_18_12 {

    public static Scanner in = new Scanner(System.in);

    public static void fill(int[] m, int down, int up) {

        for (int i=0; i< m.length; i++)     m[i] = (int)(Math.random()*(up + 1 - down) + down);
    }

    public static void write(int[] m) {

        for (int i=0; i< m.length; i++)     System.out.println(m[i] + " ");
    }

    public static void main(String[] args) {

        int down = 100; int up = 999;
        int n = in.nextInt();
        int[] m = new int [n];
        fill (m, down, up);
        write(m);
    }
}
