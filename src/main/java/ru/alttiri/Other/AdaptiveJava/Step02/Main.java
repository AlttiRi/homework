package ru.alttiri.Other.AdaptiveJava.Step02;

import java.util.Scanner;

/**
 Squirrels and nuts - 2

 N squirrels found K nuts and decided to divide them equally.
 Find how many nuts will be left after each of the squirrels takes the equal amount of nuts.

 Input data format

 There are two positive integers N and K, each of them is not greater than 10000.

 ______________________________________________________
 Sample Input:
 3
 14

 Sample Output:
 2

 */

//import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int squirrels = sc.nextInt();
        int nuts = sc.nextInt();

        System.out.println(nuts%squirrels);
    }
}