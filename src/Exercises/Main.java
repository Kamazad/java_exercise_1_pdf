package Exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert integer");
        Scanner in = new Scanner(System.in);
        int variable = in.nextInt();

        for (int i = 1; i <= 4; i++) {
            System.out.println(variable + " X " + i + " = " + (variable * i));
        }

    }
}
