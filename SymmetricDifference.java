package com.company;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> resultSet = new HashSet<>();
        resultSet.addAll(set1);
        resultSet.addAll(set2);
        Iterator itr = resultSet.iterator();
        while (itr.hasNext()) {
            T temp = (T) itr.next();
            if (set1.contains(temp) && set2.contains(temp)) {
                itr.remove();
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
