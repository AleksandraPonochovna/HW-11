package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskApp {
    private Scanner scn = new Scanner(System.in);
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

    private static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message;
        if (stackTraceElements.length >= 4) {
            StackTraceElement element = stackTraceElements[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            message = className + ": " + methodName;
        } else {
            return null;
        }
        return message;
    }

    private void calculating() {
        ArrayList<Integer> numbers;
        String string;
        String[] strings;
        System.out.println("Enter your numbers across space: ");
        string = scn.nextLine();
        strings = string.split(" ");
        numbers = new ArrayList<>(strings.length);
        try {
            for (String s : strings) {
                numbers.add(Integer.parseInt(s));
            }
        } catch (Throwable t) {
        }
        for (int i = 1; i < numbers.size(); i += 2) {
            numbers.remove(i);
            i--;
        }
        System.out.println("Result is: ");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}

