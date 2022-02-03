package com.nhx;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {19,5,9,55,6,3,1,70};
           for (int i = 1; i < numbers.length; i++) {

               for (int j = 0; j < numbers.length; j++) {

                   if (numbers[i] < numbers[j]) {
                       int temp = numbers[i];
                       numbers[i] = numbers[j];
                       numbers[j] = temp;
                   }
               }
           }
        System.out.println(Arrays.toString(numbers));
    }
}
