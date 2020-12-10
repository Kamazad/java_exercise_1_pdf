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
        //Exercise6
//        int[] zadanatablica = new int[]{12, 7, 19, 213, -90, 23, -4534, -34424};
//        int howmany = 0;
//        for (int x : zadanatablica) {
//            if (x<0){
//                howmany++;
//            }
//        }
//        System.out.println("Jest :"+howmany +" liczb ujemnych, oto one :");
//        int[] ujemne = new int[howmany];
//        int i = 0;
//        for (int x : zadanatablica) {
//            if (x<0){
//                ujemne[i] = x;
//                i++;
//            }
//        }
//        for(int x : ujemne){
//            System.out.println(x);
//        }

//Exercise 7
//        int length = 3;
//        int first =4;
//        int differnce = 100;
//        int[] tablica = new int [length];
//        for (int i = 0; i<length; i++){
//            if (i==0) {
//                tablica[i] = first;
//            } else {
//                tablica[i] = tablica[i-1] + differnce;
//            }
//        }
//        for (int x : tablica){
//            System.out.println(x);
//        }
        //Exercise 8
//        int[] test = {-1,2,5,8,11};
//        boolean isArithethic = true;
//        int diff1 = test[0] - test[1];
//        int diff2;
//        for (int i=2; i<test.length; i++ ){
//            diff2 = test[i-1] - test[i];
//            if ((diff1 != diff2)){
//                isArithethic = false;
//            }
//        }
//        if(isArithethic){
//            System.out.println("Jest to ciąg arytmetyczny");
//        } else {
//            System.out.println("Nie jest to ciąg arytmetyczny");
//        }
        //Exercise 9 &10
        int var1 = 11;
        int var2 = 5;
        double divide = ((double) var1 / (double) var2);
        System.out.printf("%.3f", divide);
        int temp = (int) divide;
        System.out.println("\n" + temp);
        int modulo = var1 - (temp * var2);
        System.out.println(modulo);

        if (modulo == (var1%var2)){
            System.out.println("Wszystko jest ok");
        } else{
            System.out.println("Błędnie działająca funkcja");
        }
    }
}
