package com.company;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class TaskApp {

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1 ");
        SymmetricDifference<Integer> app = new SymmetricDifference();
        Set<Integer> firstHashSet = new HashSet<>();
        Set<Integer> secondHashSet = new HashSet<>();
        firstHashSet.add(1);
        firstHashSet.add(2);
        firstHashSet.add(3);
        secondHashSet.add(0);
        secondHashSet.add(1);
        secondHashSet.add(2);
        Set<Integer> resultSet = app.symmetricDifference(firstHashSet, secondHashSet);
        app.printSet(resultSet); // 0 3
        TaskApp main = new TaskApp();
        //Task 2
        System.out.println("Task 2 ");
        main.calculating();
        //Task 3 getCallerClassAndMethodName()
        System.out.println("Task 3 ");
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        if (stackTraceElements.length < 3) {
            return null;
        } else {
            return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
        }
    }

    private void calculating() {
        try (Scanner scn = new Scanner(System.in)) {
            String[] strings = scn.nextLine().split(" ");
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i < strings.length; i += 2) {
                numbers.add(Integer.parseInt(strings[i]));
            }
            Collections.reverse(numbers);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        } catch (RuntimeException ex) {
        }
    }
}
