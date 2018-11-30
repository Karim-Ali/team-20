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
                    "13-\tGet the maximum 3 numbers\n" +
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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    palindrome(integers);
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

                    break;
                case 14:

                    break;
                case 15:

                    break;
                case 16:
                 getprime(arr);
                    break;
                case 17:

                    break;
                case 18:
                    palindrome(chars);
                    Most_common(integers);
                     getprime(integers);
                    break;
                case 19:
                    return;
            }
        }
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



	static void reverse(char [] data){
        for (int i = data.length-1 ; i >=0 ; i--)
        {
                 System.out.print(data[i] + " ");
        } 
    	}

    }



