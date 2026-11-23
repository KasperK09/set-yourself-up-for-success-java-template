package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);

        ArrayList<Integer> result = removeDuplicates(numbers);

        System.out.println(result);
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        Set<T> set = new LinkedHashSet<>(list);

        return new ArrayList<>(set);
    }
}
