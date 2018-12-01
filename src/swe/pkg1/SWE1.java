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

        while(true)
        {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements of array: ");
            int size = reader.nextInt();
            System.out.println("Enter array: ");

            // for functions that require char array
            char[] chars = new char[size];
            for (int i = 0; i < size; i++)
            {
                System.out.print(i + 1 + " element: ");
                chars[i] = reader.next().charAt(0);
            }

            // for functions that only takes int array
            int[] integers = new int[size];
            for (int i = 0; i < size; i++)
            {
                if (chars[i] >= '0' || chars[i] <= '9')
                    integers[i] = chars[i] - '0';
                else
                    integers[i] = chars[i];
            }

            // Menu
            System.out.println("Choose function:\n" +
                    "1-\tMost repeated value\n" +
                    "2-\tSort\n" +
                    "3-\tShuffle\n" +
                    "4-\tFind the largest prime\n" +
                    "5-\tFind the smallest prime\n" +
                    "6-\tCheck palindrome\n" +
                    "7-\tCheck sorted\n" +
                    "8-\tCount primes\n" +
                    "9-\tReverse array\n" +
                    "10-\tShift array\n" +
                    "11-\tDistinct array\n" +
                    "12-\tGet the maximum 3 numbers\n" +
                    "13-\tGet the minimum 3 numbers\n" +
                    "14-\tGet average\n" +
                    "15-\tGet median\n" +
                    "16-\tReturn only primes\n" +
                    "17-\tZero if less than zero\n" +
                    "18-\tAll\n" +
                    "19-\tExit\n");
            int choice = reader.nextInt();
            //reader.close();
            switch (choice)
            {
                case 1:
                    Most_common(integers);
                    break;
                case 2:
                    sortArray(integers);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    palindrome(chars);
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    reverse(chars);

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:
                    getmin(integers);
                    break;
                case 14:

                    break;
                case 15:
                    get_median(integers);
                    break;
                case 16:
                    getprime(integers);
                    break;
                case 17:

                    break;
                case 18:
                    palindrome(chars);
                    Most_common(integers);
                    getprime(integers);
                    sortArray(integers);
		    get_median(integers);;
                    break;
                case 19:
                    return;
            }
        }
    }
    public static void get_median (int [] myArray) {
        int size= myArray.length;
        for (int i = 1, j; i < size; i++) {
        int tmp = myArray [i];
            for (j = i; j > 0 && tmp < myArray [j-1]; j--)
                myArray [j] = myArray [j-1];
            myArray [j] = tmp;
        }
        double median;
        if (size%2==0)
        {
            double tmp;
            tmp=myArray[(size/2)-1]+myArray[size/2];
            median=(tmp/2.00);
        }
        else
        {
            median=myArray[(size-1)/2];
        }
        System.out.println(median);
    }
    public static void Most_common(int [] array){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<array.length;i++)
        {

            if(hash.containsKey(array[i]))
            {
                hash.put(array[i], hash.get(array[i]) + 1);
            }
            else {
                hash.put(array[i], 1);
            }
        }

        int max=0; int ind=0;
        for (int i: hash.keySet())
        {
            if(hash.get(i)>max)
            {
                ind=i;
                max=hash.get(i);
            }
        }
        System.out.println(max);

    }

    static boolean palindrome(char[] array)
    {
        for(int i = 0; i < array.length / 2; i++)
            if(array[i] != array[array.length - 1 - i])
            {
                System.out.println("Not Palindrome.");
                return false;
            }
        System.out.println("Palindrome.");
        return true;
    }
    static boolean checkprime (int n){
        if( n < 2 )
            return false;
        for(int i = 2 ; i < n ; i++ )
            if(n%i == 0)
                return false;
        return true;
    }

    static void getprime (int []arr){
        System.out.print("The prime numbers are : ");
        for(int i = 0 ; i < arr.length ; i++)
            if (checkprime(arr[i]))
                System.out.print(arr[i] + " , ");
        System.out.println("\b\b\n");
    }

    public static void sortArray(int[] arr) {

        int temp, min;
        //Selection Sort
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

        System.out.print("The sorted array : ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" , ");

        }
        System.out.println("");
    }

    static void reverse(char [] data){
        for (int i = data.length-1 ; i >=0 ; i--)
        {
            System.out.print(data[i] + " ");
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
	
	
	static void avg_of_array(int[] array, int size)
    {
        Scanner input2=new Scanner(System.in);
        int count=0;
        for (int i=0;i<size;i++) {

            count += array[i];
        }
        System.out.println("the avarage = "+ new Double((count/size)));

    }
}



