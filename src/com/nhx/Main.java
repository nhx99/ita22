package com.nhx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Primjer 1
        int[] brojevi = {12,12,23,23,23,34,3,67,67,6676767};

        var brojeviBezDuplikata = Arrays.stream(brojevi).distinct().toArray();

        System.out.println(Arrays.toString(brojeviBezDuplikata));

        // Primjer 2

        int[] brojevi2 = {12,12,23,23,23,34,3,67,67,6676767};

        Set<Integer> set = new HashSet<>();

        for (Integer broj : brojevi2) {
            set.add(broj);
        }
        System.out.println(set);

        //Primjer 3

        int[] brojevi3 = {12,12,23,23,23,34,3,67,67,6676767};

        Set<Integer> set2 = Arrays.stream(brojevi3).boxed().collect(Collectors.toSet());

        System.out.println(set2);

    }
}
