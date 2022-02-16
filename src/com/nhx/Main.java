package com.nhx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite tekst:");
        String inputtedText = scanner.nextLine().replace(" ","");

        String[] inputtedTextArray = inputtedText.split("");

        String reversedText = "";

        for (int i = inputtedTextArray.length - 1; i >= 0; i--){
            reversedText += inputtedTextArray[i];
        }
        if (inputtedText.equals(reversedText)) {
            System.out.println("Ovo je palindrom");
        } else {
            System.out.println("Ovo nije palindrom");
        }
    }
}
