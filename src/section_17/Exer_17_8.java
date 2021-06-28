package section_17;

import java.util.Scanner;

public class Exer_17_8 {

    public static Scanner in = new Scanner(System.in);

    public static int what(int x) {
        if (x<0)
            return -1;
        if (x==0)
            return 0;
        return 1;
    }

    public static void main(String[] args) {

        int x,y;
        x = in.nextInt();
        y = what(x);
        System.out.println(y);

    }
}
