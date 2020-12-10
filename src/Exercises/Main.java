package Exercises;

import java.util.Scanner;

import static Exercises.Input.staticScanner;

public class Main {
    public static void main(String[] args) {
//
//        //Rozwiązanie Exercise 1
//        System.out.println("Insert integer");
//        Scanner in = new Scanner(System.in);
//        int variable = in.nextInt();
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.println(variable + " X " + i + " = " + (variable * i));
//        }
//
//        //Rozwinięcie
//        Input x = new Input();
//        //x.setOut(); //setter liczby integer wywołane z osobnej klasy Input
//
//        System.out.println("Nasze x to :" + x.outer() ); //funcja outer
//
//        //funkcja statyczna
//        int y = staticScanner();
//        System.out.println("Nasze y to : " + y);

//        //Exercise 2
//        int var1 =1231;
//        double sqrtroot = Math.sqrt((double) var1);
//        boolean isPrime = true;
//        sqrtroot = Math.floor(sqrtroot);
//        if(var1<=2){
//            isPrime = false;
//        }
//        for (int i=2; i<=sqrtroot; i++){
//            if(var1%i==0){
//                isPrime = false;
//            }
//        }
//        if (isPrime){
//            System.out.println("Podana liczba jest liczbą pierwszą");
//        } else {
//            System.out.println("Podana liczba jest nie liczbą pierwszą");
//        }
//   Exercise 3
//        int var1 = 8;
//        int var2 = 6;
//        Integer suma = var1;
//        if (var2 != var1) {
//            int difference = Math.abs((var1 - var2));
//            if (var2 < var1) {
//                var1 = var2;
//            }
//            for (int i = (var1 + 1); i <= (var1 + difference); i++) {
//                suma += i;
//            }
//        }
//        System.out.println(suma);
//
//        //Exercise 4
//        int[] zadanatablica = new int[]{12, 7, 19};
//        int temp = zadanatablica[0];
//        zadanatablica[0] = zadanatablica[2];
//        zadanatablica[2] = temp;
//        for (int x: zadanatablica) {
//            System.out.println(x);

        // Exercise 5
//        int[] zadanatablica = new int[]{12, 7, 19, 213,-90,23};
//        int min = zadanatablica[0];
//        int max = zadanatablica[0];
//        for(int i=1; i<zadanatablica.length; i++){
//            if (min>zadanatablica[i]){
//                min = zadanatablica[i];
//            }
//            if(max<zadanatablica[i]){
//                max = zadanatablica[i];
//            }
//        }
//        System.out.println(min + " " + max);
    }
}
