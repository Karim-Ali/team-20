/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe.pkg1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Karim
 */
public class SWE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while (true) {
            System.out.println("Please Enter size of arr");
            int sz;
            Scanner in = new Scanner(System.in);
            sz = in.nextInt();
            int arr[] = new int[sz];
            System.out.println("Enter array elements");
            for (int i = 0; i < sz; ++i) {
                int c = in.next().charAt(0);
                arr[i] = c;

            }
            System.out.println("1  - most repeated value");
            System.out.println("2  - sort");
            System.out.println("3  - shuffle");
            System.out.println("4  - Find the Largest Prime");
            System.out.println("5  - Find ths smallest Prime");
            System.out.println("6  - Check Palindrome");
            System.out.println("7  - Check sorted");
            System.out.println("8  - Count Primes");
            System.out.println("9  - Reverse array");
            System.out.println("10 - Shift array");
            System.out.println("11 - Distinct array");
            System.out.println("12 - Get the maximum 3 numbers");
            System.out.println("13 - Get the minimum 3 numbers");
            System.out.println("14 - Get average");
            System.out.println("15 - Get median");
            System.out.println("16 - Return only primes");
            System.out.println("17 - Zero if less than zero");
            System.out.println("18 - Execute all functions");
            System.out.println("19 - Exit");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            in.close();
            if (choice == 1) {

            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if (choice == 5) {

            } else if (choice == 6) {

            } else if (choice == 7) {

            } else if (choice == 8) {

            } else if (choice == 9) {

            } else if (choice == 10) {

            } else if (choice == 11) {

            } else if (choice == 12) {

            } else if (choice == 13) {
                System.out.print("the minimum 3 numbers of the array : ");
                getmin(arr);
            } else if (choice == 14) {

            } else if (choice == 15) {

            } else if (choice == 16) {

            } else if (choice == 17) {

            } else if (choice == 18) {

            }else if (choice == 19) {
                break;
            }
        }
    }
    static void getmin(int[] arr) {
        int mini = arr[0], idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
                idx = i;
            }
        }
        System.out.print("the Smallest 3 numbers are : " + mini);
        arr[idx] = arr[arr.length - 1];
        mini = arr[0];
        idx = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
                idx = i;
            }
        }
        System.out.print(" , " + mini);
        arr[idx] = arr[arr.length - 2];
        mini = arr[0];
        idx = 0;
        for (int i = 1; i < arr.length - 2; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        System.out.println(" , " + mini);
    }
}