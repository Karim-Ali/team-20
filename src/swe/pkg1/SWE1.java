/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe.pkg1;

import java.util.*;

public class SWE1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int []arr= {1 , 2, 0, 4};
		sortArray(arr);
	}

	public static void sortArray(int []arr) {
		String result = "";
		int temp, min;
		// Selection Sort
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j]< arr[min])
					min = j;
			}
			temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
		
	}

}
