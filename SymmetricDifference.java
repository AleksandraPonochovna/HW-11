package com.company;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> resultSet = new HashSet<>();
        for (T t : set1) {
            if (!set2.contains(t)) {
                resultSet.add(t);
            }
        }
        for (T t : set2) {
            if (!set1.contains(t)) {
                resultSet.add(t);
            }
        }
        return resultSet;
    }

    public void printSet(Set<? extends T> set) {
        if (set.isEmpty()) {
            System.out.println("This set is empty.");
        }
        for (T t : set) {
            System.out.println(t);
        }
    }
}
