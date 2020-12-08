package Exercises;

import java.util.Scanner;

public class Input {
    private Scanner in = new Scanner(System.in);
    private int out;

    //scanning for new variable + setter
    public void setOut() {
        this.out = in.nextInt();
    }

    //getter
    public int getOut() {
        return out;
    }

    //merging two method insert an  getOut
    public int outer() {
        this.out = in.nextInt();
        return out;
    }

    //funkcja static dostępna bez postępu o pól
    public static int staticScanner() {
        Scanner qwe = new Scanner(System.in);
        return qwe.nextInt();
    }

}
