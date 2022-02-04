package com.nhx;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Koliko brojeva želite da unesete?");
        int size = scanner.nextInt();
        System.out.println("Unesite " + size + " brojeva:");

        int count = 0;
        int[] numbers = new int[size];

        while(count < size) {
            int number = scanner.nextInt();
            numbers[count] = number;
            count++;
        }

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
