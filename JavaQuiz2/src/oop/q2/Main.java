package oop.q2;

import java.util.*;

/**
 * This program demonstrates how to construct a third list (list3)
 * by using two predefined lists: list1 (a list of integers) and list2 (a list of strings).
 *
 * For each index i, the program adds the value of list1[i] to the index i,
 * and uses the resulting index to retrieve an element from list2.
 * If the resulting index is within bounds, it adds that element to list3.
 *
 * This program works not only with the example values shown in the animation,
 * but also with any values provided for list1 and list2, as long as the calculated indices
 * are valid (i + list1[i] < list2.size()).
 */
public class Main {
    public static void main(String[] args) {
        // Predefined values from the animation
        List<Integer> list1 = Arrays.asList(3, 6, 6, 9, 2, 8, 6, 8, 5, 2, 4, 8, 2);
        List<String> list2 = Arrays.asList(
                "hUtqd", "JzXE", "gNho", "test", "eAgF", "RTu", "W3d7", "jiGbj", "BBBvu",
                "Vnd8i", "90C", "iT8B", "5vnWH", "4Dnm", "kmG", "6pPTs", "D7p", "ebDnd"
        );

        List<String> list3 = new ArrayList<>();

        // Generate list3 by mapping indices using list1 values
        for (int i = 0; i < list1.size(); i++) {
            int index = list1.get(i) + i;
            if (index >= 0 && index < list2.size()) {
                list3.add(list2.get(index));
            }
        }

        System.out.println("List3: " + list3);
    }
}
