
package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void removeDuplicatesPreservesOriginalOrder() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);

        ArrayList<Integer> result = App.removeDuplicates(numbers);

        assertEquals(new ArrayList<>(java.util.List.of(5, 2, 1)), result);
    }
    
    @Test
    void removeDuplicatesFromEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Integer> result = App.removeDuplicates(numbers);

        assertEquals(new ArrayList<Integer>(), result);
    }

    @Test
    void removeDuplicatesFromSingleItem() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        ArrayList<Integer> result = App.removeDuplicates(numbers);

        assertEquals(new ArrayList<>(java.util.List.of(1)), result);
    }

    @Test
    void removeDuplicatesFromListWithoutDuplicates() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        ArrayList<Integer> result = App.removeDuplicates(numbers);

        assertEquals(new ArrayList<>(java.util.List.of(1, 2, 3)), result);
    }

    @Test
    void removeDuplicatesFromListWithStrings() {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("A");
        letters.add("B");

        ArrayList<String> result = App.removeDuplicates(letters);

        assertEquals(new ArrayList<>(java.util.List.of("A", "B")), result);
    }

    @Test
    void removeDuplicatesFromListWithMultipleDuplicates() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);

        ArrayList<Integer> result = App.removeDuplicates(numbers);

        assertEquals(new ArrayList<>(java.util.List.of(1, 3, 5)), result);
    }
}
