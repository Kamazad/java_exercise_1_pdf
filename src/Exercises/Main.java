package Exercises;

import java.util.Scanner;

import static Exercises.Input.staticScanner;

public class Main {
    public static void main(String[] args) {

        //Rozwiązanie Exercise 1
        System.out.println("Insert integer");
        Scanner in = new Scanner(System.in);
        int variable = in.nextInt();

        for (int i = 1; i <= 4; i++) {
            System.out.println(variable + " X " + i + " = " + (variable * i));
        }

//        //Rozwinięcie
//        Input x = new Input();
//        //x.setOut(); //setter liczby integer wywołane z osobnej klasy Input
//
//        System.out.println("Nasze x to :" + x.outer() ); //funcja outer
//
//        //funkcja statyczna
//        int y = staticScanner();
//        System.out.println("Nasze y to : " + y);
    }
}
